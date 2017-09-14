package com.xteam.tourismpay.dto;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonProperty;


@JsonAutoDetect
public class TicketNotify{
    /**
     * 加密码 账号+密码的MD5值，请在业务执行前验证
     */
    @JsonProperty("VerifyCode")
    private String VerifyCode;

    /**
     * 票付通订单号
     */
    @JsonProperty("Order16U")
    private String Order16U;

    /**
     * 远端订单号
     */
    @JsonProperty("OrderCall")
    private String OrderCall;

    /**
     * 执行时间
     */
    @JsonProperty("ActionTime")
    private String ActionTime;

    /**
     * 本次消费票数
     */
    @JsonProperty("Tnumber")
    private String Tnumber;

    /**
     * 通知类型
     */
    @JsonProperty("OrderState")
    private String OrderState;

    /**
     * 总消费数
     */
    @JsonProperty("AllCheckNum")
    private String AllCheckNum;

    /**
     * 渠道 2—内部；4--终端
     */
    @JsonProperty("Source")
    private String Source;

    /**
     * 操作类型
     */
    @JsonProperty("Action")
    private String Action;

    /**
     * 退款状态
     */
    @JsonProperty("Refundtype")
    private String Refundtype;

    /**
     * 审核说明
     */
    @JsonProperty("Explain")
    private String Explain;

    /**
     * 退款金额
     */
    @JsonProperty("RefundAmount")
    private String RefundAmount;

    /**
     * 退款手续费
     */
    @JsonProperty("RefundFee")
    private String RefundFee;

    public String getVerifyCode() {
        return VerifyCode;
    }

    public void setVerifyCode(String verifyCode) {
        VerifyCode = verifyCode;
    }

    public String getOrder16U() {
        return Order16U;
    }

    public void setOrder16U(String order16U) {
        Order16U = order16U;
    }

    public String getOrderCall() {
        return OrderCall;
    }

    public void setOrderCall(String orderCall) {
        OrderCall = orderCall;
    }

    public String getActionTime() {
        return ActionTime;
    }

    public void setActionTime(String actionTime) {
        ActionTime = actionTime;
    }

    public String getTnumber() {
        return Tnumber;
    }

    public void setTnumber(String tnumber) {
        Tnumber = tnumber;
    }

    public String getOrderState() {
        return OrderState;
    }

    public void setOrderState(String orderState) {
        OrderState = orderState;
    }

    public String getAllCheckNum() {
        return AllCheckNum;
    }

    public void setAllCheckNum(String allCheckNum) {
        AllCheckNum = allCheckNum;
    }

    public String getSource() {
        return Source;
    }

    public void setSource(String source) {
        Source = source;
    }

    public String getAction() {
        return Action;
    }

    public void setAction(String action) {
        Action = action;
    }

    public String getRefundtype() {
        return Refundtype;
    }

    public void setRefundtype(String refundtype) {
        Refundtype = refundtype;
    }

    public String getExplain() {
        return Explain;
    }

    public void setExplain(String explain) {
        Explain = explain;
    }

    public String getRefundAmount() {
        return RefundAmount;
    }

    public void setRefundAmount(String refundAmount) {
        RefundAmount = refundAmount;
    }

    public String getRefundFee() {
        return RefundFee;
    }

    public void setRefundFee(String refundFee) {
        RefundFee = refundFee;
    }
}
