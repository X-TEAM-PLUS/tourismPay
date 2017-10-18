package com.xteam.tourismpay.domain;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;


/**
 * Created by IntelliJ IDEA.
 * User: yankun
 * Date: 2017年10月18日
 * Time: 15:03:08
 * TableName:T_ORDERS
 */

public class Orders implements Serializable {

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
     * 设置 orderNo
     *
     * @param orderNo order_no
     */
    public void setOrderNo(BigDecimal orderNo) {
        this.orderNo = orderNo;
    }

    /**
     * 获取 orderNo
     * return
     */
    public BigDecimal getOrderNo() {
        return this.orderNo;
    }

    /**
     * 设置 orderTel
     *
     * @param orderTel order_tel
     */
    public void setOrderTel(String orderTel) {
        this.orderTel = orderTel;
    }

    /**
     * 获取 orderTel
     * return
     */
    public String getOrderTel() {
        return this.orderTel;
    }

    /**
     * 设置 smsSend
     *
     * @param smsSend sms_send
     */
    public void setSmsSend(Integer smsSend) {
        this.smsSend = smsSend;
    }

    /**
     * 获取 smsSend
     * return
     */
    public Integer getSmsSend() {
        return this.smsSend;
    }

    /**
     * 设置 contactTel
     *
     * @param contactTel contact_tel
     */
    public void setContactTel(String contactTel) {
        this.contactTel = contactTel;
    }

    /**
     * 获取 contactTel
     * return
     */
    public String getContactTel() {
        return this.contactTel;
    }

    /**
     * 设置 payMode
     *
     * @param payMode pay_mode
     */
    public void setPayMode(Integer payMode) {
        this.payMode = payMode;
    }

    /**
     * 获取 payMode
     * return
     */
    public Integer getPayMode() {
        return this.payMode;
    }

    /**
     * 设置 payWay
     *
     * @param payWay pay_way
     */
    public void setPayWay(Integer payWay) {
        this.payWay = payWay;
    }

    /**
     * 获取 payWay
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
     * 设置 orderMode
     *
     * @param orderMode order_mode
     */
    public void setOrderMode(Integer orderMode) {
        this.orderMode = orderMode;
    }

    /**
     * 获取 orderMode
     * return
     */
    public Integer getOrderMode() {
        return this.orderMode;
    }

    /**
     * 设置 concatId
     *
     * @param concatId concat_id
     */
    public void setConcatId(String concatId) {
        this.concatId = concatId;
    }

    /**
     * 获取 concatId
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
     * 设置 pCode
     *
     * @param pCode p_code
     */
    public void setPCode(String pCode) {
        this.pCode = pCode;
    }

    /**
     * 获取 pCode
     * return
     */
    public String getPCode() {
        return this.pCode;
    }

    /**
     * 设置 personId
     *
     * @param personId person_id
     */
    public void setPersonId(String personId) {
        this.personId = personId;
    }

    /**
     * 获取 personId
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
     * 设置 productSn
     *
     * @param productSn product_sn
     */
    public void setProductSn(String productSn) {
        this.productSn = productSn;
    }

    /**
     * 获取 productSn
     * return
     */
    public String getProductSn() {
        return this.productSn;
    }

    /**
     * 设置 orderStatus
     *
     * @param orderStatus order_status
     */
    public void setOrderStatus(Integer orderStatus) {
        this.orderStatus = orderStatus;
    }

    /**
     * 获取 orderStatus
     * return
     */
    public Integer getOrderStatus() {
        return this.orderStatus;
    }

    /**
     * 设置 pftOrderNo
     *
     * @param pftOrderNo pft_order_no
     */
    public void setPftOrderNo(String pftOrderNo) {
        this.pftOrderNo = pftOrderNo;
    }

    /**
     * 获取 pftOrderNo
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
     * 设置 responseMsg
     *
     * @param responseMsg response_msg
     */
    public void setResponseMsg(String responseMsg) {
        this.responseMsg = responseMsg;
    }

    /**
     * 获取 responseMsg
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
     * 设置 responeCode
     *
     * @param responeCode respone_code
     */
    public void setResponeCode(String responeCode) {
        this.responeCode = responeCode;
    }

    /**
     * 获取 responeCode
     * return
     */
    public String getResponeCode() {
        return this.responeCode;
    }

    /**
     * 设置 retailPrice
     *
     * @param retailPrice retail_price
     */
    public void setRetailPrice(BigDecimal retailPrice) {
        this.retailPrice = retailPrice;
    }

    /**
     * 获取 retailPrice
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
     * 设置 orderAmount
     *
     * @param orderAmount order_amount
     */
    public void setOrderAmount(BigDecimal orderAmount) {
        this.orderAmount = orderAmount;
    }

    /**
     * 获取 orderAmount
     * return
     */
    public BigDecimal getOrderAmount() {
        return this.orderAmount;
    }

    /**
     * 设置 orderName
     *
     * @param orderName order_name
     */
    public void setOrderName(String orderName) {
        this.orderName = orderName;
    }

    /**
     * 获取 orderName
     * return
     */
    public String getOrderName() {
        return this.orderName;
    }

    /**
     * 设置 playTime
     *
     * @param playTime play_time
     */
    public void setPlayTime(String playTime) {
        this.playTime = playTime;
    }

    /**
     * 获取 playTime
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
