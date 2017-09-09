package com.tourismpay.api.service;

import java.util.Map;

/**
 * Created by xinleisong on 2017/9/9.
 */
public interface ThirdPartyPaymentService {

    /**
     * 获取二维码链接地址
     * @param out_trade_no  商户订单号
     * @param total_amount  付款金额
     * @param subject       订单名称
     * @return
     */
    public Map<String,Object> getQRCode(String out_trade_no,String total_amount,String subject);
}
