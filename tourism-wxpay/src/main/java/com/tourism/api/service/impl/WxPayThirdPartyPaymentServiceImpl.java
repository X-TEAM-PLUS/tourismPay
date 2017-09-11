package com.tourism.api.service.impl;

import com.tourism.wx.util.CommonUtilPub;
import com.tourism.wx.util.HtmlUtil;
import com.tourismpay.api.service.ThirdPartyPaymentService;
import org.apache.commons.lang.StringUtils;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by xinleisong on 2017/9/11.
 */
public class WxPayThirdPartyPaymentServiceImpl implements ThirdPartyPaymentService {

    private WxConfig wxConfig;

    @Override
    public Map<String, Object> getQRCode(String out_trade_no, String total_amount, String subject,String productId) {
        HashMap<String, Object> returnValue = new HashMap<String, Object>();
        try {

            HashMap<String, String> paramMap = new HashMap<String, String>();
            paramMap.put("trade_type", "NATIVE"); //交易类型
            paramMap.put("spbill_create_ip", wxConfig.getSpbill_create_ip()); //本机的Ip
            // trade_type=NATIVE时（即扫码支付），此参数必传。此参数为二维码中包含的商品ID，商户自行定义。
            paramMap.put("product_id", productId); // 商户根据自己业务传递的参数 必填
            paramMap.put("body", subject);         //描述
            paramMap.put("out_trade_no", out_trade_no); //商户 后台的贸易单号
            paramMap.put("total_fee", "" + total_amount); //金额必须为整数  单位为分
            paramMap.put("notify_url", wxConfig.getNotify_url()); //支付成功后，回调地址
            paramMap.put("appid", wxConfig.getAppid()); //appid
            paramMap.put("mch_id", wxConfig.getMchid()); //商户号
            paramMap.put("nonce_str", CommonUtilPub.getRandomStringByLength(32));  //随机数
            paramMap.put("sign", CommonUtilPub.createSign("utf-8", paramMap, wxConfig.getKey()));//根据微信签名规则，生成签名
            String xmlData = CommonUtilPub.map2XmlString(paramMap);//把参数转换成XML数据格式
            String resXml = HtmlUtil.postData("https://api.mch.weixin.qq.com/pay/unifiedorder", xmlData);
            if (StringUtils.isNotEmpty(resXml)) {
                returnValue.put("success", false);
                returnValue.put("info", "微信返回值为空");
                return returnValue;
            }
            Map<String, String> map = CommonUtilPub.readStringXmlOut(resXml);
            if (map.isEmpty()) {
                returnValue.put("success", false);
                returnValue.put("info", "微信返回值为空");
                return returnValue;
            }
            if (map.get("return_code").equals("SUCCESS")) {
                returnValue.put("success", true);
                returnValue.put("info", "成功");
                returnValue.putAll(map);
                return returnValue;
            }
        } catch (Exception e) {
            returnValue.put("success", false);
            returnValue.put("info", "系统异常");
            return returnValue;
        }

        return returnValue;
    }

    public WxConfig getWxConfig() {
        return wxConfig;
    }

    public void setWxConfig(WxConfig wxConfig) {
        this.wxConfig = wxConfig;
    }
}
