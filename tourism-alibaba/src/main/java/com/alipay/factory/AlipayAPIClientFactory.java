/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2014 All Rights Reserved.
 */
package com.alipay.factory;

import com.alipay.api.AlipayClient;
import com.alipay.api.DefaultAlipayClient;
import com.alipay.constants.AlipayServiceEnvConstants;


/**
 * API调用客户端工厂
 *
 * @author taixu.zqq
 * @version $Id: AlipayAPIClientFactory.java, v 0.1 2014年7月23日 下午5:07:45 taixu.zqq Exp $
 */
public class AlipayAPIClientFactory {

    /**
     * API调用客户端
     */
    private static AlipayClient alipayClient;

    private static AlipayServiceEnvConstants alipayServiceEnvConstants;


    /**
     * 获得API调用客户端
     *
     * @return
     */
    public static AlipayClient getAlipayClient() {

        if (null == alipayClient) {
            alipayClient = new DefaultAlipayClient(alipayServiceEnvConstants.getALIPAY_GATEWAY(), alipayServiceEnvConstants.getAPP_ID(),
                    alipayServiceEnvConstants.PRIVATE_KEY, "json", alipayServiceEnvConstants.CHARSET, alipayServiceEnvConstants.ALIPAY_PUBLIC_KEY);
        }
        return alipayClient;
    }

    public AlipayServiceEnvConstants getAlipayServiceEnvConstants() {
        return alipayServiceEnvConstants;
    }

    public void setAlipayServiceEnvConstants(AlipayServiceEnvConstants alipayServiceEnvConstants) {
        this.alipayServiceEnvConstants = alipayServiceEnvConstants;
    }
}
