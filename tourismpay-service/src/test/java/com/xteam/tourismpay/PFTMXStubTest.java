package com.xteam.tourismpay;

import org.junit.Test;


import static org.junit.Assert.*;

public class PFTMXStubTest {
    private static final String account = "100019";

    private static final String pwd = "jjl4yk11f82ce6c0f33a5c003f2fec56";

    /**
     * 通过webService调用景区列表接口1.1
     */
    @Test
    public  void getScenieSpotList() {

        try {
            //通过axis2自动生成的web service客户端的代码类
            com.xteam.tourismpay.PFTMXStub pFTMXStub = new com.xteam.tourismpay.PFTMXStub();

            //创建接口对应对象
            com.xteam.tourismpay.PFTMXStub.Get_ScenicSpot_List get_ScenicSpot_List = new com.xteam.tourismpay.PFTMXStub.Get_ScenicSpot_List();
            //设置接口调用参数
            get_ScenicSpot_List.setAc(account);
            get_ScenicSpot_List.setPw(pwd);
            get_ScenicSpot_List.setN("10");
            get_ScenicSpot_List.setM("");
            //获取接口响应值
            com.xteam.tourismpay.PFTMXStub.Get_ScenicSpot_ListResponse get_ScenicSpot_ListResponse = pFTMXStub
                    .get_ScenicSpot_List(get_ScenicSpot_List);
            String result = get_ScenicSpot_ListResponse.getGet_ScenicSpot_List();

            System.out.println(result);
        }
        catch (Exception e) {
            e.printStackTrace();
        }


    }


    @Test
    public  void PFT_Order_Submit() {

        try {
            //通过axis2自动生成的web service客户端的代码类
            com.xteam.tourismpay.PFTMXStub pFTMXStub = new com.xteam.tourismpay.PFTMXStub();

            //创建接口对应对象
            com.xteam.tourismpay.PFTMXStub.PFT_Order_Submit order_submit = new com.xteam.tourismpay.PFTMXStub.PFT_Order_Submit();
            //设置接口调用参数
            order_submit.setAc(account);
            order_submit.setPw(pwd);

            //获取接口响应值
            com.xteam.tourismpay.PFTMXStub.PFT_Order_SubmitResponse  order_submitResponse = pFTMXStub
                    .pFT_Order_Submit(order_submit);
            String result = order_submitResponse.getPFT_Order_Submit();
            System.out.println(result);
        }
        catch (Exception e) {
            e.printStackTrace();
        }

    }
}