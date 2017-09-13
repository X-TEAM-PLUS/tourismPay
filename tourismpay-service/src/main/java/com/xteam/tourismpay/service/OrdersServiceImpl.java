package com.xteam.tourismpay.service;

import com.xteam.tourismpay.api.OrdersService;
import com.xteam.tourismpay.api.PFT_Exception;
import com.xteam.tourismpay.api.PFT_OrderService;
import com.xteam.tourismpay.common.JsonUtils;
import com.xteam.tourismpay.domain.Orders;
import com.xteam.tourismpay.dto.SubmitOrderResponseData;
import com.xteam.tourismpay.dto.OrdersDto;
import com.xteam.tourismpay.manager.OrdersManager;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
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
        Orders orders = JsonUtils.transform(ordersDto, Orders.class);
        orders.setCreated(new Date());
        orders.setUpdated(new Date());
        int count = ordersManager.insert(orders);
        ordersDto.setOrderNo(orders.getOrderNo());//回写本地订单号
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
