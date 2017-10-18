package com.xteam.tourismpay.dto;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;


/**
 * Created by IntelliJ IDEA.
 * User: yankun
 * Date: 2017年10月18日
 * Time: 15:03:09
 * TableName:T_ORDERS  DTO对象
 */

public class OrdersDto implements Serializable {

    private Integer start = 0;

    private Integer limit = 20;


    /**
     * order_no
     */
    private BigDecimal orderNo;
    /**
     * order_tel
     */
    private String orderTel;
    /**
     * sms_send
     */
    private Integer smsSend;
    /**
     * contact_tel
     */
    private String contactTel;
    /**
     * pay_mode
     */
    private Integer payMode;
    /**
     * pay_way
     */
    private Integer payWay;
    /**
     * assembly
     */
    private String assembly;
    /**
     * order_mode
     */
    private Integer orderMode;
    /**
     * concat_id
     */
    private String concatId;
    /**
     * series
     */
    private String series;
    /**
     * p_code
     */
    private String pCode;
    /**
     * person_id
     */
    private String personId;
    /**
     * m
     */
    private String m;
    /**
     * product_sn
     */
    private String productSn;
    /**
     * order_status
     */
    private Integer orderStatus;
    /**
     * pft_order_no
     */
    private String pftOrderNo;
    /**
     * memo
     */
    private String memo;
    /**
     * tid
     */
    private String tid;
    /**
     * response_msg
     */
    private String responseMsg;
    /**
     * lid
     */
    private String lid;
    /**
     * respone_code
     */
    private String responeCode;
    /**
     * retail_price
     */
    private BigDecimal retailPrice;
    /**
     * updated
     */
    private Date updated;
    /**
     * tprice
     */
    private BigDecimal tprice;
    /**
     * created
     */
    private Date created;
    /**
     * tnum
     */
    private Integer tnum;
    /**
     * order_amount
     */
    private BigDecimal orderAmount;
    /**
     * order_name
     */
    private String orderName;
    /**
     * play_time
     */
    private String playTime;

    /**
     * 设置 order_no
     *
     * @param orderNo order_no
     */
    public void setOrderNo(BigDecimal orderNo) {
        this.orderNo = orderNo;
    }

    /**
     * 获取 order_no
     * return
     */
    public BigDecimal getOrderNo() {
        return this.orderNo;
    }

    /**
     * 设置 order_tel
     *
     * @param orderTel order_tel
     */
    public void setOrderTel(String orderTel) {
        this.orderTel = orderTel;
    }

    /**
     * 获取 order_tel
     * return
     */
    public String getOrderTel() {
        return this.orderTel;
    }

    /**
     * 设置 sms_send
     *
     * @param smsSend sms_send
     */
    public void setSmsSend(Integer smsSend) {
        this.smsSend = smsSend;
    }

    /**
     * 获取 sms_send
     * return
     */
    public Integer getSmsSend() {
        return this.smsSend;
    }

    /**
     * 设置 contact_tel
     *
     * @param contactTel contact_tel
     */
    public void setContactTel(String contactTel) {
        this.contactTel = contactTel;
    }

    /**
     * 获取 contact_tel
     * return
     */
    public String getContactTel() {
        return this.contactTel;
    }

    /**
     * 设置 pay_mode
     *
     * @param payMode pay_mode
     */
    public void setPayMode(Integer payMode) {
        this.payMode = payMode;
    }

    /**
     * 获取 pay_mode
     * return
     */
    public Integer getPayMode() {
        return this.payMode;
    }

    /**
     * 设置 pay_way
     *
     * @param payWay pay_way
     */
    public void setPayWay(Integer payWay) {
        this.payWay = payWay;
    }

    /**
     * 获取 pay_way
     * return
     */
    public Integer getPayWay() {
        return this.payWay;
    }

    /**
     * 设置 assembly
     *
     * @param assembly assembly
     */
    public void setAssembly(String assembly) {
        this.assembly = assembly;
    }

    /**
     * 获取 assembly
     * return
     */
    public String getAssembly() {
        return this.assembly;
    }

    /**
     * 设置 order_mode
     *
     * @param orderMode order_mode
     */
    public void setOrderMode(Integer orderMode) {
        this.orderMode = orderMode;
    }

    /**
     * 获取 order_mode
     * return
     */
    public Integer getOrderMode() {
        return this.orderMode;
    }

    /**
     * 设置 concat_id
     *
     * @param concatId concat_id
     */
    public void setConcatId(String concatId) {
        this.concatId = concatId;
    }

    /**
     * 获取 concat_id
     * return
     */
    public String getConcatId() {
        return this.concatId;
    }

    /**
     * 设置 series
     *
     * @param series series
     */
    public void setSeries(String series) {
        this.series = series;
    }

    /**
     * 获取 series
     * return
     */
    public String getSeries() {
        return this.series;
    }

    /**
     * 设置 p_code
     *
     * @param pCode p_code
     */
    public void setPCode(String pCode) {
        this.pCode = pCode;
    }

    /**
     * 获取 p_code
     * return
     */
    public String getPCode() {
        return this.pCode;
    }

    /**
     * 设置 person_id
     *
     * @param personId person_id
     */
    public void setPersonId(String personId) {
        this.personId = personId;
    }

    /**
     * 获取 person_id
     * return
     */
    public String getPersonId() {
        return this.personId;
    }

    /**
     * 设置 m
     *
     * @param m m
     */
    public void setM(String m) {
        this.m = m;
    }

    /**
     * 获取 m
     * return
     */
    public String getM() {
        return this.m;
    }

    /**
     * 设置 product_sn
     *
     * @param productSn product_sn
     */
    public void setProductSn(String productSn) {
        this.productSn = productSn;
    }

    /**
     * 获取 product_sn
     * return
     */
    public String getProductSn() {
        return this.productSn;
    }

    /**
     * 设置 order_status
     *
     * @param orderStatus order_status
     */
    public void setOrderStatus(Integer orderStatus) {
        this.orderStatus = orderStatus;
    }

    /**
     * 获取 order_status
     * return
     */
    public Integer getOrderStatus() {
        return this.orderStatus;
    }

    /**
     * 设置 pft_order_no
     *
     * @param pftOrderNo pft_order_no
     */
    public void setPftOrderNo(String pftOrderNo) {
        this.pftOrderNo = pftOrderNo;
    }

    /**
     * 获取 pft_order_no
     * return
     */
    public String getPftOrderNo() {
        return this.pftOrderNo;
    }

    /**
     * 设置 memo
     *
     * @param memo memo
     */
    public void setMemo(String memo) {
        this.memo = memo;
    }

    /**
     * 获取 memo
     * return
     */
    public String getMemo() {
        return this.memo;
    }

    /**
     * 设置 tid
     *
     * @param tid tid
     */
    public void setTid(String tid) {
        this.tid = tid;
    }

    /**
     * 获取 tid
     * return
     */
    public String getTid() {
        return this.tid;
    }

    /**
     * 设置 response_msg
     *
     * @param responseMsg response_msg
     */
    public void setResponseMsg(String responseMsg) {
        this.responseMsg = responseMsg;
    }

    /**
     * 获取 response_msg
     * return
     */
    public String getResponseMsg() {
        return this.responseMsg;
    }

    /**
     * 设置 lid
     *
     * @param lid lid
     */
    public void setLid(String lid) {
        this.lid = lid;
    }

    /**
     * 获取 lid
     * return
     */
    public String getLid() {
        return this.lid;
    }

    /**
     * 设置 respone_code
     *
     * @param responeCode respone_code
     */
    public void setResponeCode(String responeCode) {
        this.responeCode = responeCode;
    }

    /**
     * 获取 respone_code
     * return
     */
    public String getResponeCode() {
        return this.responeCode;
    }

    /**
     * 设置 retail_price
     *
     * @param retailPrice retail_price
     */
    public void setRetailPrice(BigDecimal retailPrice) {
        this.retailPrice = retailPrice;
    }

    /**
     * 获取 retail_price
     * return
     */
    public BigDecimal getRetailPrice() {
        return this.retailPrice;
    }

    /**
     * 设置 updated
     *
     * @param updated updated
     */
    public void setUpdated(Date updated) {
        this.updated = updated;
    }

    /**
     * 获取 updated
     * return
     */
    public Date getUpdated() {
        return this.updated;
    }

    /**
     * 设置 tprice
     *
     * @param tprice tprice
     */
    public void setTprice(BigDecimal tprice) {
        this.tprice = tprice;
    }

    /**
     * 获取 tprice
     * return
     */
    public BigDecimal getTprice() {
        return this.tprice;
    }

    /**
     * 设置 created
     *
     * @param created created
     */
    public void setCreated(Date created) {
        this.created = created;
    }

    /**
     * 获取 created
     * return
     */
    public Date getCreated() {
        return this.created;
    }

    /**
     * 设置 tnum
     *
     * @param tnum tnum
     */
    public void setTnum(Integer tnum) {
        this.tnum = tnum;
    }

    /**
     * 获取 tnum
     * return
     */
    public Integer getTnum() {
        return this.tnum;
    }

    /**
     * 设置 order_amount
     *
     * @param orderAmount order_amount
     */
    public void setOrderAmount(BigDecimal orderAmount) {
        this.orderAmount = orderAmount;
    }

    /**
     * 获取 order_amount
     * return
     */
    public BigDecimal getOrderAmount() {
        return this.orderAmount;
    }

    /**
     * 设置 order_name
     *
     * @param orderName order_name
     */
    public void setOrderName(String orderName) {
        this.orderName = orderName;
    }

    /**
     * 获取 order_name
     * return
     */
    public String getOrderName() {
        return this.orderName;
    }

    /**
     * 设置 play_time
     *
     * @param playTime play_time
     */
    public void setPlayTime(String playTime) {
        this.playTime = playTime;
    }

    /**
     * 获取 play_time
     * return
     */
    public String getPlayTime() {
        return this.playTime;
    }

    public Integer getStart() {
        return start;
    }

    public void setStart(Integer start) {
        this.start = start;
    }

    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }
}
