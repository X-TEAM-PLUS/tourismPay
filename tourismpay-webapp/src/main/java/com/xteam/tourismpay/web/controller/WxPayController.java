package com.xteam.tourismpay.web.controller;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.EncodeHintType;
import com.google.zxing.MultiFormatWriter;
import com.google.zxing.WriterException;
import com.google.zxing.common.BitMatrix;
import com.xteam.tourismpay.api.PFT_OrderService;
import com.xteam.tourismpay.api.service.impl.WxPayThirdPartyPaymentServiceImpl;
import com.xteam.tourismpay.web.controller.util.XMLUtil4jdom;
import com.xteam.tourismpay.wx.util.PayCommonUtil;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.jdom.JDOMException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import javax.imageio.ImageIO;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.awt.image.BufferedImage;
import java.io.*;
import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/**
 * Created by xinleisong on 2017/9/12.
 */
@Controller
@RequestMapping("/tourismpay/getrq")
public class WxPayController {

    private static final Log log = LogFactory.getLog(WxPayController.class);

    @Resource
    private PFT_OrderService pft_orderService;
    @javax.annotation.Resource
    private WxPayThirdPartyPaymentServiceImpl wxPayThirdPartyPaymentService;


    // 线程安全的订单信息
    private static ConcurrentMap<String, HashMap> concurrentMapWordCounts = new ConcurrentHashMap<String, HashMap>();

    private static final int WHITE = 0xFFFFFFFF;
    private static final int BLACK = 0xFF000000;

    @RequestMapping("/getRqWx")
    public ModelAndView edit(String out_trade_no, String total_amount, String subject, String productId) {
        ModelAndView modelAndView = new ModelAndView("getrq/wxpay");
        try {
            HashMap orderInfo = new HashMap();
            orderInfo.put("total_amount", total_amount);
            orderInfo.put("productId", productId);
            orderInfo.put("subject", subject);
            Map<String, Object> returnValue = wxPayThirdPartyPaymentService.getQRCode(out_trade_no, total_amount, subject, productId);
            if (returnValue.get("result_code") != null && returnValue.get("result_code").equals("FAIL")) {
                modelAndView = new ModelAndView("error/error");
                return modelAndView;
            }
            if ((Boolean) returnValue.get("success")) {
                orderInfo.putAll(returnValue);
                // 默认状态未回调
                orderInfo.put("status", "1");
                concurrentMapWordCounts.put(out_trade_no, orderInfo);
            } else {
                modelAndView = new ModelAndView("error/error");
            }
            modelAndView.addObject("rq", orderInfo);
            modelAndView.addObject("out_trade_no", out_trade_no);
        } catch (Exception e) {
            modelAndView = new ModelAndView("error/error");
            log.error("获取数据异常", e);
        }
        return modelAndView;
    }

    @RequestMapping("/getImage")
    public void getImage(String out_trade_no, HttpServletResponse response, HttpSession session) throws Exception {
        HashMap map = concurrentMapWordCounts.get(out_trade_no);
        if (map == null) {

        }
        String code_url = (String) map.get("code_url");
        if (code_url == null || "".equals(code_url))
            return;
        MultiFormatWriter multiFormatWriter = new MultiFormatWriter();
        Map hints = new HashMap();
        hints.put(EncodeHintType.CHARACTER_SET, "UTF-8"); //设置字符集编码类型
        BitMatrix bitMatrix = null;
        try {
            bitMatrix = multiFormatWriter.encode(code_url, BarcodeFormat.QR_CODE, 300, 300, hints);
            BufferedImage image = toBufferedImage(bitMatrix);
            //输出二维码图片流
            try {
                ImageIO.write(image, "png", response.getOutputStream());
            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        } catch (WriterException e1) {
            // TODO Auto-generated catch block
            e1.printStackTrace();
        }
    }


    private static BufferedImage toBufferedImage(BitMatrix matrix) {
        int width = matrix.getWidth();
        int height = matrix.getHeight();
        BufferedImage image = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
        for (int x = 0; x < width; x++) {
            for (int y = 0; y < height; y++) {
                image.setRGB(x, y, matrix.get(x, y) ? BLACK : WHITE);
            }
        }
        return image;
    }


    /**
     * 微信平台发起的回调方法，
     * 调用我们这个系统的这个方法接口，将扫描支付的处理结果告知我们系统
     *
     * @throws JDOMException
     * @throws Exception
     */
    @RequestMapping("/weixinNotify")
    public void weixinNotify(HttpServletRequest request, HttpServletResponse response) throws JDOMException, Exception {

        //读取参数
        InputStream inputStream;
        StringBuffer sb = new StringBuffer();
        inputStream = request.getInputStream();
        String s;
        BufferedReader in = new BufferedReader(new InputStreamReader(inputStream, "UTF-8"));
        while ((s = in.readLine()) != null) {
            sb.append(s);
        }
        in.close();
        inputStream.close();

        //解析xml成map
        Map<String, String> m = new HashMap<String, String>();
        System.out.println("收到微信回复:" + sb.toString());
        m = XMLUtil4jdom.doXMLParse(sb.toString());

        //过滤空 设置 TreeMap
        SortedMap<Object, Object> packageParams = new TreeMap<Object, Object>();
        Iterator it = m.keySet().iterator();
        while (it.hasNext()) {
            String parameter = (String) it.next();
            String parameterValue = m.get(parameter);

            String v = "";
            if (null != parameterValue) {
                v = parameterValue.trim();
            }
            packageParams.put(parameter, v);
        }

        // 账号信息
        String key = wxPayThirdPartyPaymentService.getWxConfig().getKey(); //key

        //判断签名是否正确
        if (PayCommonUtil.isTenpaySign("UTF-8", packageParams, key)) {
            //------------------------------
            //处理业务开始
            //------------------------------
            String resXml = "";
            if ("SUCCESS".equals((String) packageParams.get("result_code"))) {
                // 这里是支付成功
                //////////执行自己的业务逻辑////////////////
                String mch_id = (String) packageParams.get("mch_id");
                String openid = (String) packageParams.get("openid");
                String is_subscribe = (String) packageParams.get("is_subscribe");
                String out_trade_no = (String) packageParams.get("out_trade_no");
                pft_orderService.submit(out_trade_no);
                String total_fee = (String) packageParams.get("total_fee");

                //////////执行自己的业务逻辑////////////////
                //暂时使用最简单的业务逻辑来处理：只是将业务处理结果保存到session中
                //（根据自己的实际业务逻辑来调整，很多时候，我们会操作业务表，将返回成功的状态保留下来）
                request.getSession().setAttribute("_PAY_RESULT", "OK");

                System.out.println("支付成功");
                //通知微信.异步确认成功.必写.不然会一直通知后台.八次之后就认为交易失败了.
                resXml = "<xml>" + "<return_code><![CDATA[SUCCESS]]></return_code>"
                        + "<return_msg><![CDATA[OK]]></return_msg>" + "</xml> ";

            } else {
                resXml = "<xml>" + "<return_code><![CDATA[FAIL]]></return_code>"
                        + "<return_msg><![CDATA[报文为空]]></return_msg>" + "</xml> ";
            }
            //------------------------------
            //处理业务完毕
            //------------------------------
            BufferedOutputStream out = new BufferedOutputStream(
                    response.getOutputStream());
            out.write(resXml.getBytes());
            out.flush();
            out.close();
        } else {
            System.out.println("通知签名验证失败");
        }

    }
}
