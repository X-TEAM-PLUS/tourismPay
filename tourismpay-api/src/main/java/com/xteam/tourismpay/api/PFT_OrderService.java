package com.xteam.tourismpay.api;

import com.xteam.tourismpay.dto.*;

/**
 * 票付通订单接口
 */
public interface PFT_OrderService {

    /**
     * 查询景区所有门票
     * @param uuLld
     * @return
     * @throws PFT_Exception
     */
    public GetTicketListResponseData getTicketList(String uuLld ) throws PFT_Exception;
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
    public QueryOrderResponseData queryOrder(String orderNo) throws PFT_Exception;

    /**
     * 出票状态通知
     *
     * @param ticketNotify
     */
    void notifyStatus(TicketNotify ticketNotify) throws PFT_Exception;

    /**
     * 动态价格，实时库存上限获取
     * @param aid  供应商id
     * @param pid 产品id
     *  @param playTime 游玩时间
     * @return
     * @throws PFT_Exception
     */
    GetRealTimeStorageResonseData getRealTimeStorage(String aid, String pid,String playTime)  throws PFT_Exception;
}
