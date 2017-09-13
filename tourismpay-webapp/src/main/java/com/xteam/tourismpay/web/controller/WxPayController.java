package com.xteam.tourismpay.web.controller;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.EncodeHintType;
import com.google.zxing.MultiFormatWriter;
import com.google.zxing.WriterException;
import com.google.zxing.common.BitMatrix;
import com.tourismpay.api.service.ThirdPartyPaymentService;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.imageio.ImageIO;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/**
 * Created by xinleisong on 2017/9/12.
 */
@Controller
@RequestMapping("/tourismpay/getrq")
public class WxPayController {

    private static final Log log = LogFactory.getLog(WxPayController.class);

    @javax.annotation.Resource
    private ThirdPartyPaymentService wxPayThirdPartyPaymentService;
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
            if ((Boolean) returnValue.get("success")) {
                orderInfo.putAll(returnValue);
                // 默认状态未回调
                orderInfo.put("status", "1");
                concurrentMapWordCounts.put(out_trade_no, orderInfo);
            }
            modelAndView.addObject("rq", orderInfo);
            modelAndView.addObject("out_trade_no", out_trade_no);
        } catch (Exception e) {
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
}
