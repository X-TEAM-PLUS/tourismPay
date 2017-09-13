package com.xteam.tourismpay.api.service.impl;

import com.alipay.api.AlipayApiException;
import com.alipay.api.AlipayClient;
import com.alipay.api.request.AlipayTradePrecreateRequest;
import com.alipay.api.response.AlipayTradePrecreateResponse;
import com.alipay.factory.AlipayAPIClientFactory;
import com.xteam.tourismpay.api.service.ThirdPartyPaymentService;

import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by xinleisong on 2017/9/9.
 * 阿里巴巴支付宝接口服务类
 */
public class AliPayThirdPartyPaymentServiceImpl implements ThirdPartyPaymentService {

    private AlipayAPIClientFactory alipayAPIClientFactory;

    /**
     * 支付宝获取二维码链接地址
     *
     * @param out_trade_no 商户订单号
     * @param total_amount 付款金额
     * @param subject      订单名称
     * @return
     */
    public Map<String, Object> getQRCode(String out_trade_no, String total_amount, String subject,String productId) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String time_expire = sdf.format(System.currentTimeMillis() + 24 * 60 * 60 * 1000);

        HashMap<String, Object> returnValue = new HashMap<String, Object>();
        StringBuilder sb = new StringBuilder();
        sb.append("{\"out_trade_no\":\"" + out_trade_no + "\",");
        sb.append("\"total_amount\":\"" + total_amount + "\",\"discountable_amount\":\"0.00\",");
        sb.append("\"subject\":\"" + subject + "\",\"body\":\"test\",");
        sb.append("\"goods_detail\":[{\"goods_id\":\"apple-01\",\"goods_name\":\"ipad\",\"goods_category\":\"7788230\",\"price\":\"88.00\",\"quantity\":\"1\"},{\"goods_id\":\"apple-02\",\"goods_name\":\"iphone\",\"goods_category\":\"7788231\",\"price\":\"88.00\",\"quantity\":\"1\"}],");
        sb.append("\"operator_id\":\"op001\",\"store_id\":\"pudong001\",\"terminal_id\":\"t_001\",");
        sb.append("\"time_expire\":\"" + time_expire + "\"}");
        System.out.println(sb.toString());

        AlipayClient alipayClient = alipayAPIClientFactory.getAlipayClient();

        // 使用SDK，构建群发请求模型
        AlipayTradePrecreateRequest request = new AlipayTradePrecreateRequest();
        request.setBizContent(sb.toString());
        request.setNotifyUrl("http://185297.cicp.net:50366/fuwuchuang_demo/notify_url.jsp");
//		request.putOtherTextParam("ws_service_url", "http://unitradeprod.t15032aqcn.alipay.net:8080");
        AlipayTradePrecreateResponse response = null;
        try {

            // 使用SDK，调用交易下单接口
            response = alipayClient
                    .execute(request);

            System.out.println(response.getBody());
            System.out.println(response.isSuccess());
            System.out.println(response.getMsg());
            // 这里只是简单的打印，请开发者根据实际情况自行进行处理
            if (null != response && response.isSuccess()) {
                if (response.getCode().equals("10000")) {
                    System.out.println("商户订单号：" + response.getOutTradeNo());
                    System.out.println("二维码值：" + response.getQrCode());//商户将此二维码值生成二维码，然后展示给用户，用户用支付宝手机钱包扫码完成支付
                    //二维码的生成，网上有许多开源方法，可以参看：http://blog.csdn.net/feiyu84/article/details/9089497
                    returnValue.put("succes", response.isSuccess());
                    returnValue.put("outTradeNo", response.getOutTradeNo());
                    returnValue.put("qrCode", response.getQrCode());
                } else {
                    returnValue.put("succes", response.isSuccess());
                    returnValue.put("code", response.getSubCode());
                    returnValue.put("submsg", response.getSubMsg());
                    //打印错误码
                    System.out.println("错误码：" + response.getSubCode());
                    System.out.println("错误描述：" + response.getSubMsg());
                }
            }
        } catch (AlipayApiException e) {
            returnValue.put("success", false);
            returnValue.put("info", e.getMessage());
        }

        return returnValue;

    }

    public AlipayAPIClientFactory getAlipayAPIClientFactory() {
        return alipayAPIClientFactory;
    }

    public void setAlipayAPIClientFactory(AlipayAPIClientFactory alipayAPIClientFactory) {
        this.alipayAPIClientFactory = alipayAPIClientFactory;
    }
}
