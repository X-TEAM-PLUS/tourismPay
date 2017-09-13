package com.tourism.api.service.impl;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import java.util.Map;

/**
 * Created by xinleisong on 2017/9/11.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {
        "classpath:spring-config-wxpay.xml"})
public class TestWxPayThirdPartyPaymentServiceImpl {

    @Resource
    private WxPayThirdPartyPaymentServiceImpl wxPayThirdPartyPaymentService;

    @Test
    public void getQRCode() {
        Map<String, Object> returnValue = wxPayThirdPartyPaymentService.getQRCode("10000321", "2", "3", "3");
        System.out.println(returnValue);

    }
}
