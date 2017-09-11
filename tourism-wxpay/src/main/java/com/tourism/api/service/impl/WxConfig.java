package com.tourism.api.service.impl;

/**
 * Created by xinleisong on 2017/9/11.
 */
public class WxConfig {

    // 微信支付分配的公众账号ID（企业号corpid即为此appId）
    private String appid = "";
    // 微信支付分配的商户号
    private String mchid = "";
    private String key = "";
    private String appsecret = "";
    // 商品简单描述，该字段请按照规范传递，具体请见参数规定
    private String body = "";
    // 异步接收微信支付结果通知的回调地址，通知url必须为外网可访问的url，不能携带参数。
    private String notify_url = "";//回调地址。测试回调必须保证外网能访问到此地址
    // ip地址
    private String spbill_create_ip;

    public String getAppid() {
        return appid;
    }

    public void setAppid(String appid) {
        this.appid = appid;
    }

    public String getMchid() {
        return mchid;
    }

    public void setMchid(String mchid) {
        this.mchid = mchid;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getAppsecret() {
        return appsecret;
    }

    public void setAppsecret(String appsecret) {
        this.appsecret = appsecret;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String getNotify_url() {
        return notify_url;
    }

    public void setNotify_url(String notify_url) {
        this.notify_url = notify_url;
    }

    public String getSpbill_create_ip() {
        return spbill_create_ip;
    }

    public void setSpbill_create_ip(String spbill_create_ip) {
        this.spbill_create_ip = spbill_create_ip;
    }
}
