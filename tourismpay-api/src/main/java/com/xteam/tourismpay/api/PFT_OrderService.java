package com.xteam.tourismpay.api;

import com.xteam.tourismpay.dto.OrderQueryResonse;
import com.xteam.tourismpay.dto.SubmitOrderResponseData;
import com.xteam.tourismpay.dto.TicketNotify;

/**
 * 票付通订单接口
 */
public interface PFT_OrderService {
    /**
     * 提交订单
     *
     * @param orderNo 本地订单号
     * @return
     * @throws Exception
     */
    public SubmitOrderResponseData submit(String orderNo) throws PFT_Exception;

    /**
     * 查询订单
     *
     * @param orderNo 本地订单号
     * @return
     */
    public OrderQueryResonse queryOrder(String orderNo) throws PFT_Exception;

    /**
     * 出票状态通知
     *
     * @param ticketNotify
     */
    void notifyStatus(TicketNotify ticketNotify) throws PFT_Exception;
}
