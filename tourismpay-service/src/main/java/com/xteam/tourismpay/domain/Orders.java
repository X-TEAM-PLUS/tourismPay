package com.xteam.tourismpay.domain;

import java.io.Serializable;


/**
 * Created by IntelliJ IDEA.
 * User: yankun
 * Date: 2017年09月10日
 * Time: 09:47:04
 * TableName:T_ORDERS
 */

public class Orders implements Serializable {

    private Integer start;

    private Integer limit = 20;


    /**
     * id
     */
    private Integer id;
    /**
     * open_id
     */
    private String openId;
    /**
     * action_type
     */
    private Integer actionType;
    /**
     * id_number
     */
    private String idNumber;
    /**
     * return_message
     */
    private String returnMessage;
    /**
     * reservation_name
     */
    private String reservationName;
    /**
     * qr_code
     */
    private String qrCode;
    /**
     * order_id
     */
    private String orderId;
    /**
     * mobile
     */
    private String mobile;
    /**
     * travel_name
     */
    private String travelName;
    /**
     * pay_state
     */
    private Integer payState;
    /**
     * distinct_name
     */
    private String distinctName;
    /**
     * order_state
     */
    private Integer orderState;
    /**
     * ticket_UUID
     */
    private String ticketUuid;
    /**
     * begin_date
     */
    private String beginDate;
    /**
     * tourist_type
     */
    private String touristType;
    /**
     * pay_name
     */
    private String payName;
    /**
     * ticket_price
     */
    private java.math.BigDecimal ticketPrice;
    /**
     * order_date
     */
    private String orderDate;
    /**
     * ticket_name
     */
    private String ticketName;
    /**
     * end_date
     */
    private String endDate;
    /**
     * ticket_amount
     */
    private java.math.BigDecimal ticketAmount;
    /**
     * ticket_count
     */
    private Integer ticketCount;
    /**
     * return_code
     */
    private String returnCode;

    /**
     * 设置 id
     *
     * @param id id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取 id
     * return
     */
    public Integer getId() {
        return this.id;
    }

    /**
     * 设置 openId
     *
     * @param openId open_id
     */
    public void setOpenId(String openId) {
        this.openId = openId;
    }

    /**
     * 获取 openId
     * return
     */
    public String getOpenId() {
        return this.openId;
    }

    /**
     * 设置 actionType
     *
     * @param actionType action_type
     */
    public void setActionType(Integer actionType) {
        this.actionType = actionType;
    }

    /**
     * 获取 actionType
     * return
     */
    public Integer getActionType() {
        return this.actionType;
    }

    /**
     * 设置 idNumber
     *
     * @param idNumber id_number
     */
    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber;
    }

    /**
     * 获取 idNumber
     * return
     */
    public String getIdNumber() {
        return this.idNumber;
    }

    /**
     * 设置 returnMessage
     *
     * @param returnMessage return_message
     */
    public void setReturnMessage(String returnMessage) {
        this.returnMessage = returnMessage;
    }

    /**
     * 获取 returnMessage
     * return
     */
    public String getReturnMessage() {
        return this.returnMessage;
    }

    /**
     * 设置 reservationName
     *
     * @param reservationName reservation_name
     */
    public void setReservationName(String reservationName) {
        this.reservationName = reservationName;
    }

    /**
     * 获取 reservationName
     * return
     */
    public String getReservationName() {
        return this.reservationName;
    }

    /**
     * 设置 qrCode
     *
     * @param qrCode qr_code
     */
    public void setQrCode(String qrCode) {
        this.qrCode = qrCode;
    }

    /**
     * 获取 qrCode
     * return
     */
    public String getQrCode() {
        return this.qrCode;
    }

    /**
     * 设置 orderId
     *
     * @param orderId order_id
     */
    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    /**
     * 获取 orderId
     * return
     */
    public String getOrderId() {
        return this.orderId;
    }

    /**
     * 设置 mobile
     *
     * @param mobile mobile
     */
    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    /**
     * 获取 mobile
     * return
     */
    public String getMobile() {
        return this.mobile;
    }

    /**
     * 设置 travelName
     *
     * @param travelName travel_name
     */
    public void setTravelName(String travelName) {
        this.travelName = travelName;
    }

    /**
     * 获取 travelName
     * return
     */
    public String getTravelName() {
        return this.travelName;
    }

    /**
     * 设置 payState
     *
     * @param payState pay_state
     */
    public void setPayState(Integer payState) {
        this.payState = payState;
    }

    /**
     * 获取 payState
     * return
     */
    public Integer getPayState() {
        return this.payState;
    }

    /**
     * 设置 distinctName
     *
     * @param distinctName distinct_name
     */
    public void setDistinctName(String distinctName) {
        this.distinctName = distinctName;
    }

    /**
     * 获取 distinctName
     * return
     */
    public String getDistinctName() {
        return this.distinctName;
    }

    /**
     * 设置 orderState
     *
     * @param orderState order_state
     */
    public void setOrderState(Integer orderState) {
        this.orderState = orderState;
    }

    /**
     * 获取 orderState
     * return
     */
    public Integer getOrderState() {
        return this.orderState;
    }

    /**
     * 设置 ticketUuid
     *
     * @param ticketUuid ticket_UUID
     */
    public void setTicketUuid(String ticketUuid) {
        this.ticketUuid = ticketUuid;
    }

    /**
     * 获取 ticketUuid
     * return
     */
    public String getTicketUuid() {
        return this.ticketUuid;
    }

    /**
     * 设置 beginDate
     *
     * @param beginDate begin_date
     */
    public void setBeginDate(String beginDate) {
        this.beginDate = beginDate;
    }

    /**
     * 获取 beginDate
     * return
     */
    public String getBeginDate() {
        return this.beginDate;
    }

    /**
     * 设置 touristType
     *
     * @param touristType tourist_type
     */
    public void setTouristType(String touristType) {
        this.touristType = touristType;
    }

    /**
     * 获取 touristType
     * return
     */
    public String getTouristType() {
        return this.touristType;
    }

    /**
     * 设置 payName
     *
     * @param payName pay_name
     */
    public void setPayName(String payName) {
        this.payName = payName;
    }

    /**
     * 获取 payName
     * return
     */
    public String getPayName() {
        return this.payName;
    }

    /**
     * 设置 ticketPrice
     *
     * @param ticketPrice ticket_price
     */
    public void setTicketPrice(java.math.BigDecimal ticketPrice) {
        this.ticketPrice = ticketPrice;
    }

    /**
     * 获取 ticketPrice
     * return
     */
    public java.math.BigDecimal getTicketPrice() {
        return this.ticketPrice;
    }

    /**
     * 设置 orderDate
     *
     * @param orderDate order_date
     */
    public void setOrderDate(String orderDate) {
        this.orderDate = orderDate;
    }

    /**
     * 获取 orderDate
     * return
     */
    public String getOrderDate() {
        return this.orderDate;
    }

    /**
     * 设置 ticketName
     *
     * @param ticketName ticket_name
     */
    public void setTicketName(String ticketName) {
        this.ticketName = ticketName;
    }

    /**
     * 获取 ticketName
     * return
     */
    public String getTicketName() {
        return this.ticketName;
    }

    /**
     * 设置 endDate
     *
     * @param endDate end_date
     */
    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    /**
     * 获取 endDate
     * return
     */
    public String getEndDate() {
        return this.endDate;
    }

    /**
     * 设置 ticketAmount
     *
     * @param ticketAmount ticket_amount
     */
    public void setTicketAmount(java.math.BigDecimal ticketAmount) {
        this.ticketAmount = ticketAmount;
    }

    /**
     * 获取 ticketAmount
     * return
     */
    public java.math.BigDecimal getTicketAmount() {
        return this.ticketAmount;
    }

    /**
     * 设置 ticketCount
     *
     * @param ticketCount ticket_count
     */
    public void setTicketCount(Integer ticketCount) {
        this.ticketCount = ticketCount;
    }

    /**
     * 获取 ticketCount
     * return
     */
    public Integer getTicketCount() {
        return this.ticketCount;
    }

    /**
     * 设置 returnCode
     *
     * @param returnCode return_code
     */
    public void setReturnCode(String returnCode) {
        this.returnCode = returnCode;
    }

    /**
     * 获取 returnCode
     * return
     */
    public String getReturnCode() {
        return this.returnCode;
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
