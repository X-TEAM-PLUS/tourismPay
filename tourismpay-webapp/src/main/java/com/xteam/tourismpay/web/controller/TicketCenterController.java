package com.xteam.tourismpay.web.controller;

import com.xteam.tourismpay.api.PFT_OrderService;
import com.xteam.tourismpay.common.JsonResult;
import com.xteam.tourismpay.common.JsonUtils;
import com.xteam.tourismpay.dto.TicketNotify;
import org.apache.commons.lang.StringUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.http.protocol.HTTP;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;

/**
 * Created by IntelliJ IDEA.
 * User: yankun
 * Date: 2017年09月12日
 * Time: 13:21:25
 * 功能:订单表【T_ORDERS】控制器
 */

@Controller
@RequestMapping("/ticket/center")
public class TicketCenterController {
    private static final Log log = LogFactory.getLog(TicketCenterController.class);

    @javax.annotation.Resource
    private PFT_OrderService pft_orderService;

//    /**
//     * 更新订单
//     *
//     * @param json
//     * @return
//     */
//    @RequestMapping(value = "/notify")
//    @ResponseBody
//    public String notify(@RequestBody String  json ) throws Exception {
//        String result = "success";
//        try {
//            if(json!=null && !"".equalsIgnoreCase(json)) {
//                //解析通知
//                TicketNotify ticketNotify = JsonUtils.fromJSON(json, TicketNotify.class);
//                //更新记录
//                pft_orderService.notifyStatus(ticketNotify);
//                result = "200";
//            }
//        } catch (Exception e) {
//            log.error("更新数据异常", e);
//        }
//        return result;
//    }

    @RequestMapping(value = "/notify")
    @ResponseBody
    public String notify(HttpServletRequest request) throws Exception {
        // 读取请求内容
        BufferedReader br = new BufferedReader(new InputStreamReader(request.getInputStream()));
        String line = null;
        StringBuilder sb = new StringBuilder();
        while((line = br.readLine())!=null){
            sb.append(line);
        }

        // 将资料解码
        String reqBody = sb.toString();
        log.info("接收到消息：" +reqBody);
        if(StringUtils.isEmpty(reqBody)){
            return "success";
        }else{
            //解析通知
            TicketNotify ticketNotify = JsonUtils.fromJSON(reqBody, TicketNotify.class);
            //更新记录
            pft_orderService.notifyStatus(ticketNotify);
            return "200";
        }
    }

}
