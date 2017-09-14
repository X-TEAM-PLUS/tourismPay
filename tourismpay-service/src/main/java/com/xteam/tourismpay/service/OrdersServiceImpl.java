package com.xteam.tourismpay.service;

import com.xteam.tourismpay.api.OrdersService;
import com.xteam.tourismpay.api.PFT_Exception;
import com.xteam.tourismpay.api.PFT_OrderService;
import com.xteam.tourismpay.common.JsonUtils;
import com.xteam.tourismpay.domain.Orders;
import com.xteam.tourismpay.dto.GetRealTimeStorageResonseData;
import com.xteam.tourismpay.dto.SubmitOrderResponseData;
import com.xteam.tourismpay.dto.OrdersDto;
import com.xteam.tourismpay.manager.OrdersManager;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: yankun
 * Date: 2017年09月12日
 * Time: 13:21:24
 * 功能:T_ORDERS表Service接口实现类
 */
@Service
public class OrdersServiceImpl implements OrdersService {
    private static final Log log = LogFactory.getLog(OrdersServiceImpl.class);
    @javax.annotation.Resource
    private OrdersManager ordersManager;

    @Resource
    private PFT_OrderService pft_orderService;

    @Override
    public OrdersDto get(OrdersDto ordersDto) throws Exception {
        Orders orders = JsonUtils.transform(ordersDto, Orders.class);
        return JsonUtils.transform(ordersManager.get(orders), OrdersDto.class);
    }

    @Override
    public int insert(OrdersDto ordersDto) throws Exception {
        int count  =-1;
             //查询价格和库存
            GetRealTimeStorageResonseData resonseData = pft_orderService.getRealTimeStorage(ordersDto.getM(), ordersDto.getProductSn(), ordersDto.getPlayTime());
            //验证库库存
            if(resonseData!=null
                    && resonseData.getGetRealTimeStorageResonse()!=null
                    && resonseData.getGetRealTimeStorageResonse().getUuErrorcode()==null){ //查询成功
                if(resonseData.getGetRealTimeStorageResonse().getStorage()!=-1
                        && ordersDto.getTnum().intValue()>resonseData.getGetRealTimeStorageResonse().getStorage()){//库存不为无限时 验证刚买数理是否大于库存量
                    throw new Exception("购买量大于库存量，下单失败");
                }
                Orders orders = JsonUtils.transform(ordersDto, Orders.class);
                //结算价
                orders.setTprice(BigDecimal.valueOf(resonseData.getGetRealTimeStorageResonse().getBuy_price()));
                //零售价
                orders.setRetailPrice(BigDecimal.valueOf(resonseData.getGetRealTimeStorageResonse().getRetail_price()));
                //订单支付金额 = 零售价 * 数量
                BigDecimal amount = BigDecimal.valueOf(resonseData.getGetRealTimeStorageResonse().getRetail_price()*orders.getTnum().intValue());
                orders.setOrderAmount(amount);
                orders.setCreated(new Date());
                orders.setUpdated(new Date());
                count = ordersManager.insert(orders);
                ordersDto.setOrderNo(orders.getOrderNo());//回写本地订单号
            }else{
                throw new Exception("查询库存异常");
            }

          return count;
    }

    @Override
    public int batchInsert(List<OrdersDto> list) throws Exception {
        List<Orders> rows = JsonUtils.transform(list, Orders.class);
        return ordersManager.batchInsert(rows);
    }

    @Override
    public int delete(OrdersDto ordersDto) throws Exception {
        Orders orders = JsonUtils.transform(ordersDto, Orders.class);
        return ordersManager.delete(orders);
    }

    @Override
    public int update(OrdersDto ordersDto) throws Exception {
        Orders orders = JsonUtils.transform(ordersDto, Orders.class);
        return ordersManager.update(orders);
    }

    @Override
    public List<OrdersDto> query(OrdersDto ordersDto) throws Exception {
        Orders orders = JsonUtils.transform(ordersDto, Orders.class);
        List<Orders> list = ordersManager.query(orders);
        return JsonUtils.transform(list, OrdersDto.class);
    }

    @Override
    public Integer queryCount(OrdersDto ordersDto) throws Exception {
        Orders orders = JsonUtils.transform(ordersDto, Orders.class);
        return ordersManager.queryCount(orders);
    }
}
