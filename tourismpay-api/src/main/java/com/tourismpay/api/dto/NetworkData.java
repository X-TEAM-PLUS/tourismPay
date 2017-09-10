package com.tourismpay.api.dto;

public class NetworkData {
    /**
     * 每一个用户对应的openId由票务系统提供
     */
    private String openId;


    /**
     * 0:表示提交新订单
     */
    private int actionType = 0;

    /**
     * 订单号
     */
    private String orderId;

    /**
     * 订票人姓名
     */
    private String reservationName;

    /**
     * 客源地
     */
    private String distinctName;

    /**
     * 散客或旅行社名称
     */
    private String travelName;
    /**
     * 游客类型，例如：儿童，成人，军人
     */
    private String touristType;

    /**
     * 门票ID
     */
    private String ticketUUID;

    /**
     * 门票的名称
     */
    private String ticketName;

    /**
     * 门票单价
     */
    private Double price;


    /**
     * 票数
     */
    private Integer count;

    /**
     * 合计金额
     */
    private Double amount;

    /**
     * 身份证号码
     */
    private String idNumber;

    /**
     * 手机号码
     */
    private String mobile;

    /**
     * 验证码，验证码的第一位值必须与openId第一位相同 字符串长度为6-10
     */
    private String qrCode;

    /**
     * 订单状态：0：未使用订单1：已经使用订单2：已经退票订单
     */
    private int orderState;

    /**
     * 订单支付状态：1：已经支付 0:未支付
     */
    private int payState;


    /**
     * 支付方式
     */
    private String payName;

    /**
     * 门票有效期开始时间格式（下同）：yyyyMMddHHmmss
     */
    private String beginDate;


    /**
     * 门票有效期截止时间
     */
    private String endDate;

    /**
     * 下单时间
     */
    private String orderDate;

    /**
     * 下单网站名称
     */
    private String network;


    public String getOpenId() {
        return openId;
    }

    public void setOpenId(String openId) {
        this.openId = openId;
    }

    public int getActionType() {
        return actionType;
    }

    public void setActionType(int actionType) {
        this.actionType = actionType;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getReservationName() {
        return reservationName;
    }

    public void setReservationName(String reservationName) {
        this.reservationName = reservationName;
    }

    public String getDistinctName() {
        return distinctName;
    }

    public void setDistinctName(String distinctName) {
        this.distinctName = distinctName;
    }

    public String getTravelName() {
        return travelName;
    }

    public void setTravelName(String travelName) {
        this.travelName = travelName;
    }

    public String getTouristType() {
        return touristType;
    }

    public void setTouristType(String touristType) {
        this.touristType = touristType;
    }

    public String getTicketUUID() {
        return ticketUUID;
    }

    public void setTicketUUID(String ticketUUID) {
        this.ticketUUID = ticketUUID;
    }

    public String getTicketName() {
        return ticketName;
    }

    public void setTicketName(String ticketName) {
        this.ticketName = ticketName;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public String getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getQrCode() {
        return qrCode;
    }

    public void setQrCode(String qrCode) {
        this.qrCode = qrCode;
    }

    public int getOrderState() {
        return orderState;
    }

    public void setOrderState(int orderState) {
        this.orderState = orderState;
    }

    public int getPayState() {
        return payState;
    }

    public void setPayState(int payState) {
        this.payState = payState;
    }

    public String getPayName() {
        return payName;
    }

    public void setPayName(String payName) {
        this.payName = payName;
    }

    public String getBeginDate() {
        return beginDate;
    }

    public void setBeginDate(String beginDate) {
        this.beginDate = beginDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public String getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(String orderDate) {
        this.orderDate = orderDate;
    }

    public String getNetwork() {
        return network;
    }

    public void setNetwork(String network) {
        this.network = network;
    }
}
