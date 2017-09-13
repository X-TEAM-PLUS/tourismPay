package com.xteam.tourismpay.service;

import com.xteam.tourismpay.api.OrdersService;
import com.xteam.tourismpay.api.PFT_Exception;
import com.xteam.tourismpay.api.PFT_OrderService;
import com.xteam.tourismpay.common.JsonUtils;
import com.xteam.tourismpay.domain.Orders;
import com.xteam.tourismpay.dto.OrderSubmitResponse;
import com.xteam.tourismpay.dto.OrdersDto;
import com.xteam.tourismpay.manager.OrdersManager;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
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
        try {
            Orders orders = JsonUtils.transform(ordersDto, Orders.class);
            //生成本地订单
            int count = ordersManager.insert(orders);

            //调用票付通接口
            OrderSubmitResponse response = pft_orderService.submit(JsonUtils.transform(orders, OrdersDto.class));
            if (response.getUuOrderNum() != null && orders.getOrderNo() == Integer.valueOf(response.getUuRemoteNum())) {
                return count;
            }
        }catch (PFT_Exception e){
            log.error("下单失败",e);
            throw new Exception("票付通接口下单失败",e);
        }catch (Exception e){
            log.error("下单失败",e);
            throw new Exception("下单失败");
        }
        return  -1;
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
