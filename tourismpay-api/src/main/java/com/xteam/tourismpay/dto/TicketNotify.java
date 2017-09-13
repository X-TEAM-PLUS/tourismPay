package com.xteam.tourismpay.dto;

public class TicketNotify {
    /**
     * 加密码 账号+密码的MD5值，请在业务执行前验证
     */
    private String VerifyCode;

    /**
     * 票付通订单号
     */
    private String Order16U;

    /**
     * 远端订单号
     */
    private String OrderCall;

    /**
     * 执行时间
     */
    private String ActionTime;

    /**
     * 本次消费票数
     */
    private String Tnumber;

    /**
     * 通知类型
     */
    private String OrderState;

    /**
     * 总消费数
     */
    private String AllCheckNum;

    /**
     * 渠道 2—内部；4--终端
     */
    private String Source;

    /**
     * 操作类型
     */
    private String Action;

    /**
     * 退款状态
     */
    private String Refundtype;

    /**
     * 审核说明
     */
    private String Explain;

    /**
     * 退款金额
     */
    private String RefundAmount;

    /**
     * 退款手续费
     */
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
