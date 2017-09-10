

/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2014 All Rights Reserved.
 */
package com.alipay.constants;

/**
 * 支付宝服务窗环境常量（demo中常量只是参考，需要修改成自己的常量值）
 *
 * @author taixu.zqq
 * @version $Id: AlipayServiceConstants.java, v 0.1 2014年7月24日 下午4:33:49 taixu.zqq Exp $
 */
public class AlipayServiceEnvConstants {

    //支付宝公钥-从支付宝服务窗获取
    public static String ALIPAY_PUBLIC_KEY = "MIGfMA0GCSqGSIb3DQEBAQUAA4GNADCBiQKBgQDIgHnOn7LLILlKETd6BFRJ0GqgS2Y3mn1wMQmyh9zEyWlz5p1zrahRahbXAfCfSqshSNfqOmAQzSHRVjCqjsAw1jyqrXaPdKBmr90DIpIxmIyKXv4GGAkPyJ/6FTFY99uhpiq0qadD/uSzQsefWo0aTvP/65zi3eof7TcZ32oWpwIDAQAB";

    //签名编码-视支付宝服务窗要求
    public static String SIGN_CHARSET = "GBK";

    //字符编码-传递给支付宝的数据编码
    public static String CHARSET = "GBK";

    //签名类型-视支付宝服务窗要求
    public static String SIGN_TYPE = "RSA";

    public static String PARTNER = "2088102172071120";

    //服务窗appId
    //TODO !!!! 注：该appId必须设为开发者自己的服务窗id  这里只是个测试id
    public static String APP_ID = "2016081900286974";

    //开发者请使用openssl生成的密钥替换此处  请看文档：https://fuwu.alipay.com/platform/doc.htm#2-1接入指南
    //TODO !!!! 注：该私钥为测试账号私钥  开发者必须设置自己的私钥 , 否则会存在安全隐患
    public static String PRIVATE_KEY = "MIICdwIBADANBgkqhkiG9w0BAQEFAASCAmEwggJdAgEAAoGBAIKkJ/RyG2pKTQDAfRU34iYQAlOAt0AXzuQFS6dw/zky9JU+NfSp+ONUeYKrDOkNK0AKbT4MHHe1rJV/naVtft57HVhNCMk1vl0W8kokBqY21yoDnGxZrgwFlhoKlIxjr2PyyGZcRzJ8181GCHiQqiRNvFBJY5bxjDzas2sgSFztAgMBAAECgYBqa+UsaUPR+0LtKOD8RvDPxtzOPx2IdZyQ/YtalF8krlC1vt7fNxNLxMXTXxn+Qz8HRTcmg2ExV2qGwlWerCrbUf8rLNZZxrsvF+cu0lM0BlKiZpe5aAQl17hrKnE/fKdgNOMdPo7DxuR3zuPotLPwGWaWjE56Ryx1j2mG9AE+AQJBALlMU36AaK2Z9bgxXDys9G5AiWjq/0vBkr2QD5FyDfLM/abf5SIxxvTUGJF+WqS+pr4BDx3AHq58xUE5JhvL/20CQQC0fQQdwY59BbrajKExX5TNxNDY8YSvrnaWS0KCoJBu0/FcMOu/nC1fg2Sq0PZ1ic8VJPH8/bAs5MIBwgNkm+OBAkEAuJu3b4flQlfqPAlJWNYDbDh17gZ6NPJ1DNETAZf9F5Jtf6z+7rNjAZaxp3qYOhwLqa8KbVxz9Okv6MxUEEuMfQJBAJszgW2g+kjxu2qhUR8mxMtoefqDPIjhaeH1V30CWxCiOcL/4kkDIFUopFDqnXQXC7Zv7ZKSB4OjNlzSm55RGoECQCyprEYip2XSb9r6NTHctBeEPYB2JLNY5G+ZqqFhKc89+S/8BCb0UaQ8MAa3Tsd5sHovzV5d2yezuao9jkEwGns=";

    //TODO !!!! 注：该公钥为测试账号公钥  开发者必须设置自己的公钥 ,否则会存在安全隐患
    public static String PUBLIC_KEY = "MIGfMA0GCSqGSIb3DQEBAQUAA4GNADCBiQKBgQCCpCf0chtqSk0AwH0VN+ImEAJTgLdAF87kBUuncP85MvSVPjX0qfjjVHmCqwzpDStACm0+DBx3tayVf52lbX7eex1YTQjJNb5dFvJKJAamNtcqA5xsWa4MBZYaCpSMY69j8shmXEcyfNfNRgh4kKokTbxQSWOW8Yw82rNrIEhc7QIDAQAB";

    //支付宝网关
    public static String ALIPAY_GATEWAY = "https://openapi.alipaydev.com/gateway.do";

    //授权访问令牌的授权类型
    public static String GRANT_TYPE = "authorization_code";

    public  String getALIPAY_PUBLIC_KEY() {
        return ALIPAY_PUBLIC_KEY;
    }

    public void setALIPAY_PUBLIC_KEY(String ALIPAY_PUBLIC_KEY) {
        this.ALIPAY_PUBLIC_KEY = ALIPAY_PUBLIC_KEY;
    }

    public String getSIGN_CHARSET() {
        return SIGN_CHARSET;
    }

    public void setSIGN_CHARSET(String SIGN_CHARSET) {
        this.SIGN_CHARSET = SIGN_CHARSET;
    }

    public String getCHARSET() {
        return CHARSET;
    }

    public void setCHARSET(String CHARSET) {
        this.CHARSET = CHARSET;
    }

    public String getSIGN_TYPE() {
        return SIGN_TYPE;
    }

    public void setSIGN_TYPE(String SIGN_TYPE) {
        this.SIGN_TYPE = SIGN_TYPE;
    }

    public String getPARTNER() {
        return PARTNER;
    }

    public void setPARTNER(String PARTNER) {
        this.PARTNER = PARTNER;
    }

    public String getAPP_ID() {
        return APP_ID;
    }

    public void setAPP_ID(String APP_ID) {
        this.APP_ID = APP_ID;
    }

    public String getPRIVATE_KEY() {
        return PRIVATE_KEY;
    }

    public void setPRIVATE_KEY(String PRIVATE_KEY) {
        this.PRIVATE_KEY = PRIVATE_KEY;
    }

    public String getPUBLIC_KEY() {
        return PUBLIC_KEY;
    }

    public void setPUBLIC_KEY(String PUBLIC_KEY) {
        this.PUBLIC_KEY = PUBLIC_KEY;
    }

    public String getALIPAY_GATEWAY() {
        return ALIPAY_GATEWAY;
    }

    public void setALIPAY_GATEWAY(String ALIPAY_GATEWAY) {
        this.ALIPAY_GATEWAY = ALIPAY_GATEWAY;
    }

    public String getGRANT_TYPE() {
        return GRANT_TYPE;
    }

    public void setGRANT_TYPE(String GRANT_TYPE) {
        this.GRANT_TYPE = GRANT_TYPE;
    }
}