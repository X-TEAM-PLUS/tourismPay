package com.xteam.tourismpay.dto;

public class OrderSubmitResponse {
    /**
     * 票付通订单号
     */
    private String uuOrderNum;

    /**
     * 远端订单号(本地订单号)
     */
    private String uuRemoteNum;

    /**
     * 凭证码
     */
    private String uuCode;


    /**
     * 订单详情及二维码地址
     */
    private String uuQrcodeURL;

    /**
     * 二维码图片
     */
    private String uuQrcodeIMG;


    public String getUuOrderNum() {
        return uuOrderNum;
    }

    public void setUuOrderNum(String uuOrderNum) {
        this.uuOrderNum = uuOrderNum;
    }

    public String getUuRemoteNum() {
        return uuRemoteNum;
    }

    public void setUuRemoteNum(String uuRemoteNum) {
        this.uuRemoteNum = uuRemoteNum;
    }

    public String getUuCode() {
        return uuCode;
    }

    public void setUuCode(String uuCode) {
        this.uuCode = uuCode;
    }

    public String getUuQrcodeURL() {
        return uuQrcodeURL;
    }

    public void setUuQrcodeURL(String uuQrcodeURL) {
        this.uuQrcodeURL = uuQrcodeURL;
    }

    public String getUuQrcodeIMG() {
        return uuQrcodeIMG;
    }

    public void setUuQrcodeIMG(String uuQrcodeIMG) {
        this.uuQrcodeIMG = uuQrcodeIMG;
    }
}
