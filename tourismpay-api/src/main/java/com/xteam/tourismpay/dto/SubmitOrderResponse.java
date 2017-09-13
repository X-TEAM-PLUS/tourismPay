package com.xteam.tourismpay.dto;

import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Rec", propOrder = {
        "uuErrorcode",
        "uuErrorinfo",
        "uuOrderNum",
        "uuRemoteNum",
        "uuCode",
        "uuQrcodeURL",
        "uuQrcodeIMG"
})
public class SubmitOrderResponse {
    /**
     * 错误 代码
     */
    @XmlElement(name = "UUerrorcode")
    private String uuErrorcode;

    /**
     * 错误信息
     */
    @XmlElement(name = "UUerrorinfo")
    private String uuErrorinfo;

    /**
     * 票付通订单号
     */
    @XmlElement(name = "UUordernum")
    private String uuOrderNum;

    /**
     * 远端订单号(本地订单号)
     */
    @XmlElement(name = "UUremotenum")
    private String uuRemoteNum;

    /**
     * 凭证码
     */
    @XmlElement(name = "UUcode")
    private String uuCode;


    /**
     * 订单详情及二维码地址
     */
    @XmlAttribute(name = "UUqrcodeURL")
    private String uuQrcodeURL;

    /**
     * 二维码图片
     */
    @XmlAttribute(name = "UUqrcodeIMG")
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

    public String getUuErrorinfo() {
        return uuErrorinfo;
    }

    public void setUuErrorinfo(String uuErrorinfo) {
        this.uuErrorinfo = uuErrorinfo;
    }

    public String getUuErrorcode() {
        return uuErrorcode;
    }

    public void setUuErrorcode(String uuErrorcode) {
        this.uuErrorcode = uuErrorcode;
    }
}
