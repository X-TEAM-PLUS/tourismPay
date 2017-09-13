package com.xteam.tourismpay.api.service.impl;

import com.xteam.tourismpay.api.service.ThirdPartyPaymentService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import java.util.Map;

/**
 * Created by xinleisong on 2017/9/9.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {
        "classpath:applicationContext-alipay.xml"})
public class TestAliPayThirdPartyPaymentService {

    @Resource
    private ThirdPartyPaymentService aliPayThirdPartyPaymentService;

    @Test
    public void getQRCode() {
        Map<String, Object> returnValue = aliPayThirdPartyPaymentService.getQRCode("12313", "2", "12","");
        System.out.println(returnValue);
    }
}
