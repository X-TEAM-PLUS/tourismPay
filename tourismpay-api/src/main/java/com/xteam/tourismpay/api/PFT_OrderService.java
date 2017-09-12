package com.xteam.tourismpay.api;

import com.xteam.tourismpay.dto.OrderSubmitResponse;
import com.xteam.tourismpay.dto.OrdersDto;

/**
 * 票付通订单接口
 */
public interface PFT_OrderService {
    /**
     * 提交订单
     *
     * @param ordersDto
     * @return
     * @throws Exception
     */
    public OrderSubmitResponse submit(OrdersDto ordersDto) throws PFT_Exception;
}
