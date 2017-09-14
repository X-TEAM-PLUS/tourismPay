package com.xteam.tourismpay.web.controller;

import com.xteam.tourismpay.api.OrdersService;
import com.xteam.tourismpay.common.JsonResult;
import com.xteam.tourismpay.dto.OrdersDto;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.servlet.http.HttpServletRequest;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: yankun
 * Date: 2017年09月12日
 * Time: 13:21:25
 * 功能:订单表【T_ORDERS】控制器
 */

@Controller
@RequestMapping("/tourismpay/orders")
public class OrdersController {
    private static final Log log = LogFactory.getLog(OrdersController.class);

    @javax.annotation.Resource
    private OrdersService ordersService;

    @RequestMapping("/index")
    public String index() {
        return "/orders/index";
    }

    /**
     * 查询订单列表页
     *
     * @param ordersDto
     * @return
     */
    @RequestMapping(value = "/list")
    @ResponseBody
    public JsonResult list(OrdersDto ordersDto) {
        JsonResult jsonResult = new JsonResult();
        try {
            List<OrdersDto> data = ordersService.query(ordersDto);
            // 设置结果集
            jsonResult.put("list", data);
            jsonResult.put("rowCount", ordersService.queryCount(ordersDto));
            jsonResult.setSuccess(true);
        } catch (Exception e) {
            log.error("查询异常", e);
            jsonResult.setMessage("查询异常");
            jsonResult.setSuccess(false);
        }
        return jsonResult;
    }


    @RequestMapping(value = "/add")
    public String add() {
        return "/orders/add";
    }

    /**
     * 新增订单
     *
     * @param ordersDto
     * @return
     */
    @RequestMapping(value = "/post")
    public ModelAndView post(OrdersDto ordersDto, RedirectAttributes attr, HttpServletRequest request) throws Exception {
        ModelAndView modelAndView = new ModelAndView("redirect:/tourismpay/getrq/getRqWx");
        try {
            if (StringUtils.isEmpty(ordersDto.getContactTel())) {
                modelAndView.addObject("errorInfo", "联系人手机号不能为空");
                modelAndView = new ModelAndView("/error/error");
                return modelAndView;
            }
            if (ordersDto.getTprice() == null || ordersDto.getTprice().intValue() == 0) {
                modelAndView.addObject("errorInfo", "商品单价不能为空");
                modelAndView = new ModelAndView("/error/error");
                return modelAndView;
            }
            if (ordersDto.getTnum() == null || ordersDto.getTnum().intValue() == 0) {
                modelAndView.addObject("errorInfo", "商品个数不能为空");
                modelAndView = new ModelAndView("/error/error");
                return modelAndView;
            }

            if (StringUtils.isEmpty(ordersDto.getProductSn())) {
                modelAndView.addObject("errorInfo", "产品id不能为空");
                modelAndView = new ModelAndView("/error/error");
                return modelAndView;
            }
            if (StringUtils.isEmpty(ordersDto.getLid())) {
                modelAndView.addObject("errorInfo", "景区id不能为空");
                modelAndView = new ModelAndView("/error/error");
                return modelAndView;
            }
            if (StringUtils.isEmpty(ordersDto.getTid())) {
                modelAndView.addObject("errorInfo", "门票id不能为空");
                modelAndView = new ModelAndView("/error/error");
                return modelAndView;
            }

            if (StringUtils.isEmpty(ordersDto.getOrderName())){
                modelAndView.addObject("errorInfo", "联系人姓名不能为空");
                modelAndView = new ModelAndView("/error/error");
                return modelAndView;
            }
            ordersDto.setOrderMode(0);
            ordersDto.setOrderStatus(0);
            ordersDto.setPayMode(2);
            ordersDto.setOrderTel(ordersDto.getContactTel());
            if (StringUtils.isEmpty(ordersDto.getOrderName())) {
                ordersDto.setOrderName("用户购买门票");
            }
            ordersDto.setSmsSend(0);
            ordersDto.setPlayTime(new SimpleDateFormat("yyyy-MM-dd").format(new Date()));
            //保存本地订单
            ordersService.insert(ordersDto);
            attr.addAttribute("out_trade_no", ordersDto.getOrderNo());
            Integer total_amount = ordersDto.getTprice().multiply(BigDecimal.valueOf(ordersDto.getTnum())).intValue();
            attr.addAttribute("total_amount", total_amount);
            attr.addAttribute("subject", "ticket");
            attr.addAttribute("productId", ordersDto.getProductSn());
        } catch (Exception e) {
            log.error("提交数据异常", e);
            modelAndView = new ModelAndView("/error/error");
            modelAndView.addObject("errorInfo", "系统异常");
            return modelAndView;
        }
        return modelAndView;
    }

    /**
     * 新增订单
     *
     * @param ordersDto
     * @return
     */
    @RequestMapping(value = "/postJump")
    public ModelAndView postJump(OrdersDto ordersDto, RedirectAttributes attr, HttpServletRequest request) throws Exception {
        ModelAndView modelAndView = new ModelAndView("/orders/order");
        try {
            //保存本地订单
            ordersService.insert(ordersDto);
            attr.addAttribute("out_trade_no", ordersDto.getOrderNo());
            Integer total_amount = ordersDto.getTprice().multiply(BigDecimal.valueOf(ordersDto.getTnum())).multiply(BigDecimal.valueOf(100)).intValue();
            modelAndView.addObject("total_amount", total_amount);
            modelAndView.addObject("subject", "ticket");
            modelAndView.addObject("productId", ordersDto.getProductSn());
            modelAndView.addObject("orderInfo", ordersDto);
        } catch (Exception e) {
            modelAndView = new ModelAndView("/error/error");
            modelAndView.addObject("errorInfo", "系统异常，订单无法生成");
            log.error("提交数据异常", e);
            return modelAndView;
        }
        return modelAndView;
    }

    /**
     * 删除订单
     *
     * @param ordersDto
     * @return
     */
    @RequestMapping(value = "/delete")
    @ResponseBody
    public JsonResult delete(OrdersDto ordersDto) throws Exception {
        JsonResult jsonResult = new JsonResult();
        try {
            //删除记录
            ordersService.delete(ordersDto);
            jsonResult.setSuccess(true);
        } catch (Exception e) {
            log.error("删除数据异常", e);
            jsonResult.setMessage("删除数据异常");
            jsonResult.setSuccess(false);
        }
        return jsonResult;
    }


    @RequestMapping("/edit")
    public ModelAndView edit(OrdersDto ordersDto) {
        ModelAndView modelAndView = new ModelAndView("orders/edit");
        try {
            modelAndView.addObject("orders", ordersService.get(ordersDto));
        } catch (Exception e) {
            log.error("获取数据异常", e);
        }
        return modelAndView;
    }


    /**
     * 更新订单
     *
     * @param ordersDto
     * @return
     */
    @RequestMapping(value = "/put")
    @ResponseBody
    public JsonResult put(OrdersDto ordersDto) throws Exception {
        JsonResult jsonResult = new JsonResult();
        try {
            //更新记录
            ordersService.update(ordersDto);
            jsonResult.setSuccess(true);
        } catch (Exception e) {
            log.error("更新数据异常", e);
            jsonResult.setMessage("更新数据异常");
            jsonResult.setSuccess(false);
        }
        return jsonResult;
    }

    /**
     * 获取订单详情
     *
     * @param ordersDto
     * @return
     */
    @RequestMapping(value = "/get")
    @ResponseBody
    public JsonResult get(OrdersDto ordersDto) throws Exception {
        JsonResult jsonResult = new JsonResult();
        try {
            //获取记录
            jsonResult.setData(ordersService.get(ordersDto));
            jsonResult.setSuccess(true);
        } catch (Exception e) {
            log.error("更新数据异常", e);
            jsonResult.setMessage("更新数据异常");
            jsonResult.setSuccess(false);
        }
        return jsonResult;
    }

}
