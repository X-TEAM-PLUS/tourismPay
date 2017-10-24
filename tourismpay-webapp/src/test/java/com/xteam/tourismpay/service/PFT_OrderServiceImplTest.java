package com.xteam.tourismpay.service;

import com.xteam.tourismpay.api.OrdersService;
import com.xteam.tourismpay.api.PFT_OrderService;
import com.xteam.tourismpay.common.JsonUtils;
import com.xteam.tourismpay.common.PayWay;
import com.xteam.tourismpay.dto.GetRealTimeStorageResonseData;
import com.xteam.tourismpay.dto.GetTicketListResponseData;
import com.xteam.tourismpay.dto.OrdersDto;
import com.xteam.tourismpay.dto.SubmitOrderResponseData;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.math.BigDecimal;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath*:spring-config.xml")
public class PFT_OrderServiceImplTest {
    @Autowired
    private PFT_OrderService pft_orderService;
    @Autowired
    private OrdersService ordersService;

    @Test
    public void submit() throws Exception {
        //设置接口调用参数
        OrdersDto ordersDto = new OrdersDto();
        ordersDto.setLid("2633"); //景区的ID 号int （注：2.1&门票接口的UUlid）  2633
        ordersDto.setTid("5715");//门票的ID 号int （注：2.1&门票接口的UUid）
        //ordersDto.setOrderNo(BigDecimal.valueOf(2));//远端订单号 String（贵网站的唯一订单号，请确保唯一，不能为空）JQ11123455123
        ordersDto.setTprice(BigDecimal.valueOf(10));//单价(分单位)int
        ordersDto.setTnum(1);//数量 int
        ordersDto.setPlayTime("2017-11-02");//游玩时间 Date(e.g.2012-03-16)
        ordersDto.setOrderName("测试test");//取票人姓名 String （使用测试接口，取票人姓名必须为‘测试test’）
        ordersDto.setOrderTel("13521846578");//取票人手机 String
        ordersDto.setContactTel("13521846578");//联系人手机String
        ordersDto.setSmsSend(1);//是否需要发送短信 int （0 发送 1 不发送 注：发短信只会返回双方订单号，不发短信才会将凭证信息返回）
        ordersDto.setPayMode(2);//（0 使用账户余额 2 使用供应商授信支付 4 现场支付注：余额不足返回错误122
        ordersDto.setOrderMode(0);//下单方式 int （0 正常下单1 手机用户下单 注：如无特殊请使用正常下单）
        ordersDto.setAssembly("");//集合地点 （线路时需要，可为空）
        ordersDto.setSeries("");//团号 （线路时需要，可为空）（场次信息获取接口详情 3.7 方法。必填参数 格式：
        // json_encode(array(（int）场馆 id,（int）场次 id,（string）分区 id));）
        ordersDto.setConcatId("0");//联票ID （未开放，请填0）
        ordersDto.setPCode("0");//套票ID （未开放，请填0）
        ordersDto.setM("113");//供应商ID （注：2.1 查询门票列表的UUaid）
        ordersDto.setPersonId("640322199307130913");//身份证号码


        //本地下单
        ordersService.insert(ordersDto);

        //票付通下单
        SubmitOrderResponseData response = pft_orderService.submit(ordersDto.getOrderNo().toString(), PayWay.WangYin.value());
        System.out.println(JsonUtils.toJSON(response));
    }

    @Test
    public void getRealTimeStorage() throws Exception {
        GetRealTimeStorageResonseData response = pft_orderService.getRealTimeStorage("113", "2803", "2017-11-02");
        System.out.println(JsonUtils.toJSON(response));

    }

    @Test
    public void getGetTicketList() throws Exception {
        GetTicketListResponseData response = pft_orderService.getTicketList("65077");
        System.out.println(JsonUtils.toJSON(response));

    }


}