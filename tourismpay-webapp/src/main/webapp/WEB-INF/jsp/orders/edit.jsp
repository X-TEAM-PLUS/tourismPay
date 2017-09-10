<!DOCTYPE html>
<%@ page language="java" pageEncoding="UTF-8" %>
<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <%@ include file="../common/head.jsp" %>

</head>
<body class="page-content">

<div class="page-bar">
    <ul class="page-breadcrumb">
        <li>
            <i class="fa fa-home"></i>
            <a href="/welcome">首页</a>
            <i class="fa fa-angle-right"></i>
        </li>
        <li>
            <i class="fa fa-cube"></i>
            <a href="index">订单管理</a>
            <i class="fa fa-angle-right"></i>
        </li>
        <li class=" active">
            <i class="fa fa-edit "></i>
            <a href="#">编辑</a>
        </li>
    </ul>
</div>
<div class="tab-content">
    <div class="tab-pane active" id="tab_0">
        <div class="portlet box grey-cascade">
            <div class="portlet-title">
                <div class="caption">
                    <i class="fa fa-adn"></i>编辑订单
                </div>
                <div class="tools">
                    <a href="javascript:;" class="collapse">
                    </a>
                    <a href="#portlet-config" data-toggle="modal" class="config">
                    </a>
                    <a href="javascript:;" class="reload">
                    </a>
                    <a href="javascript:;" class="remove" data-original-title="" title="">
                    </a>
                </div>
            </div>
            <div class="portlet-body form">
                <!-- BEGIN FORM-->
                <form action="/tourismpay/orders/put" class="form-horizontal">
                    <input type="hidden" name="id" id="id" value="${application.id}">
                    <div class="form-body">
                        
<div class="form-group"><label class="col-md-3 control-label">id<span class="required">* </span>
</label>
<div class="col-md-5">
<div class="input-group">
<span class="input-group-addon input-circle-left">
<i class="fa   fa-font"></i>
</span>
<input type="text" name="id" id="id" class="form-control"  value="${orders.id}" placeholder="id" validate="{minlength: 1,maxlength:0,required: true}"></div></div></div><div class="form-group"><label class="col-md-3 control-label">open_id<span class="required">* </span>
</label>
<div class="col-md-5">
<div class="input-group">
<span class="input-group-addon input-circle-left">
<i class="fa   fa-font"></i>
</span>
<input type="text" name="openId" id="openId" class="form-control"  value="${orders.openId}" placeholder="open_id" validate="{minlength: 1,maxlength:64,required: true}"></div></div></div><div class="form-group"><label class="col-md-3 control-label">action_type<span class="required">* </span>
</label>
<div class="col-md-5">
<div class="input-group">
<span class="input-group-addon input-circle-left">
<i class="fa   fa-font"></i>
</span>
<input type="text" name="actionType" id="actionType" class="form-control"  value="${orders.actionType}" placeholder="action_type" validate="{minlength: 1,maxlength:0,required: true}"></div></div></div><div class="form-group"><label class="col-md-3 control-label">id_number<span class="required">* </span>
</label>
<div class="col-md-5">
<div class="input-group">
<span class="input-group-addon input-circle-left">
<i class="fa   fa-font"></i>
</span>
<input type="text" name="idNumber" id="idNumber" class="form-control"  value="${orders.idNumber}" placeholder="id_number" validate="{minlength: 1,maxlength:18,required: true}"></div></div></div><div class="form-group"><label class="col-md-3 control-label">return_message<span class="required">* </span>
</label>
<div class="col-md-5">
<div class="input-group">
<span class="input-group-addon input-circle-left">
<i class="fa   fa-font"></i>
</span>
<input type="text" name="returnMessage" id="returnMessage" class="form-control"  value="${orders.returnMessage}" placeholder="return_message" validate="{minlength: 1,maxlength:500,required: true}"></div></div></div><div class="form-group"><label class="col-md-3 control-label">reservation_name<span class="required">* </span>
</label>
<div class="col-md-5">
<div class="input-group">
<span class="input-group-addon input-circle-left">
<i class="fa   fa-font"></i>
</span>
<input type="text" name="reservationName" id="reservationName" class="form-control"  value="${orders.reservationName}" placeholder="reservation_name" validate="{minlength: 1,maxlength:64,required: true}"></div></div></div><div class="form-group"><label class="col-md-3 control-label">qr_code<span class="required">* </span>
</label>
<div class="col-md-5">
<div class="input-group">
<span class="input-group-addon input-circle-left">
<i class="fa   fa-font"></i>
</span>
<input type="text" name="qrCode" id="qrCode" class="form-control"  value="${orders.qrCode}" placeholder="qr_code" validate="{minlength: 1,maxlength:8,required: true}"></div></div></div><div class="form-group"><label class="col-md-3 control-label">order_id<span class="required">* </span>
</label>
<div class="col-md-5">
<div class="input-group">
<span class="input-group-addon input-circle-left">
<i class="fa   fa-font"></i>
</span>
<input type="text" name="orderId" id="orderId" class="form-control"  value="${orders.orderId}" placeholder="order_id" validate="{minlength: 1,maxlength:64,required: true}"></div></div></div><div class="form-group"><label class="col-md-3 control-label">mobile<span class="required">* </span>
</label>
<div class="col-md-5">
<div class="input-group">
<span class="input-group-addon input-circle-left">
<i class="fa  fa-mobile"></i>
</span>
<input type="text" name="mobile" id="mobile" class="form-control"  value="${orders.mobile}" placeholder="mobile" validate="{minlength: 1,maxlength:11,required: true}"></div></div></div><div class="form-group"><label class="col-md-3 control-label">travel_name<span class="required">* </span>
</label>
<div class="col-md-5">
<div class="input-group">
<span class="input-group-addon input-circle-left">
<i class="fa   fa-font"></i>
</span>
<input type="text" name="travelName" id="travelName" class="form-control"  value="${orders.travelName}" placeholder="travel_name" validate="{minlength: 1,maxlength:64,required: true}"></div></div></div><div class="form-group"><label class="col-md-3 control-label">pay_state<span class="required">* </span>
</label>
<div class="col-md-5">
<div class="input-group">
<span class="input-group-addon input-circle-left">
<i class="fa   fa-font"></i>
</span>
<input type="text" name="payState" id="payState" class="form-control"  value="${orders.payState}" placeholder="pay_state" validate="{minlength: 1,maxlength:0,required: true}"></div></div></div><div class="form-group"><label class="col-md-3 control-label">distinct_name<span class="required">* </span>
</label>
<div class="col-md-5">
<div class="input-group">
<span class="input-group-addon input-circle-left">
<i class="fa   fa-font"></i>
</span>
<input type="text" name="distinctName" id="distinctName" class="form-control"  value="${orders.distinctName}" placeholder="distinct_name" validate="{minlength: 1,maxlength:64,required: true}"></div></div></div><div class="form-group"><label class="col-md-3 control-label">order_state<span class="required">* </span>
</label>
<div class="col-md-5">
<div class="input-group">
<span class="input-group-addon input-circle-left">
<i class="fa   fa-font"></i>
</span>
<input type="text" name="orderState" id="orderState" class="form-control"  value="${orders.orderState}" placeholder="order_state" validate="{minlength: 1,maxlength:0,required: true}"></div></div></div><div class="form-group"><label class="col-md-3 control-label">ticket_UUID<span class="required">* </span>
</label>
<div class="col-md-5">
<div class="input-group">
<span class="input-group-addon input-circle-left">
<i class="fa   fa-font"></i>
</span>
<input type="text" name="ticketUuid" id="ticketUuid" class="form-control"  value="${orders.ticketUuid}" placeholder="ticket_UUID" validate="{minlength: 1,maxlength:128,required: true}"></div></div></div><div class="form-group"><label class="col-md-3 control-label">begin_date<span class="required">* </span>
</label>
<div class="col-md-5">
<div class="input-group">
<span class="input-group-addon input-circle-left">
<i class="fa   fa-font"></i>
</span>
<input type="text" name="beginDate" id="beginDate" class="form-control"  value="${orders.beginDate}" placeholder="begin_date" validate="{minlength: 1,maxlength:14,required: true}"></div></div></div><div class="form-group"><label class="col-md-3 control-label">tourist_type<span class="required">* </span>
</label>
<div class="col-md-5">
<div class="input-group">
<span class="input-group-addon input-circle-left">
<i class="fa   fa-font"></i>
</span>
<input type="text" name="touristType" id="touristType" class="form-control"  value="${orders.touristType}" placeholder="tourist_type" validate="{minlength: 1,maxlength:10,required: true}"></div></div></div><div class="form-group"><label class="col-md-3 control-label">pay_name<span class="required">* </span>
</label>
<div class="col-md-5">
<div class="input-group">
<span class="input-group-addon input-circle-left">
<i class="fa   fa-font"></i>
</span>
<input type="text" name="payName" id="payName" class="form-control"  value="${orders.payName}" placeholder="pay_name" validate="{minlength: 1,maxlength:20,required: true}"></div></div></div><div class="form-group"><label class="col-md-3 control-label">ticket_price<span class="required">* </span>
</label>
<div class="col-md-5">
<div class="input-group">
<span class="input-group-addon input-circle-left">
<i class="fa   fa-font"></i>
</span>
<input type="text" name="ticketPrice" id="ticketPrice" class="form-control"  value="${orders.ticketPrice}" placeholder="ticket_price" validate="{minlength: 1,maxlength:10,required: true}"></div></div></div><div class="form-group"><label class="col-md-3 control-label">order_date<span class="required">* </span>
</label>
<div class="col-md-5">
<div class="input-group">
<span class="input-group-addon input-circle-left">
<i class="fa   fa-font"></i>
</span>
<input type="text" name="orderDate" id="orderDate" class="form-control"  value="${orders.orderDate}" placeholder="order_date" validate="{minlength: 1,maxlength:14,required: true}"></div></div></div><div class="form-group"><label class="col-md-3 control-label">ticket_name<span class="required">* </span>
</label>
<div class="col-md-5">
<div class="input-group">
<span class="input-group-addon input-circle-left">
<i class="fa   fa-font"></i>
</span>
<input type="text" name="ticketName" id="ticketName" class="form-control"  value="${orders.ticketName}" placeholder="ticket_name" validate="{minlength: 1,maxlength:64,required: true}"></div></div></div><div class="form-group"><label class="col-md-3 control-label">end_date<span class="required">* </span>
</label>
<div class="col-md-5">
<div class="input-group">
<span class="input-group-addon input-circle-left">
<i class="fa   fa-font"></i>
</span>
<input type="text" name="endDate" id="endDate" class="form-control"  value="${orders.endDate}" placeholder="end_date" validate="{minlength: 1,maxlength:14,required: true}"></div></div></div><div class="form-group"><label class="col-md-3 control-label">ticket_amount<span class="required">* </span>
</label>
<div class="col-md-5">
<div class="input-group">
<span class="input-group-addon input-circle-left">
<i class="fa   fa-font"></i>
</span>
<input type="text" name="ticketAmount" id="ticketAmount" class="form-control"  value="${orders.ticketAmount}" placeholder="ticket_amount" validate="{minlength: 1,maxlength:10,required: true}"></div></div></div><div class="form-group"><label class="col-md-3 control-label">ticket_count<span class="required">* </span>
</label>
<div class="col-md-5">
<div class="input-group">
<span class="input-group-addon input-circle-left">
<i class="fa   fa-font"></i>
</span>
<input type="text" name="ticketCount" id="ticketCount" class="form-control"  value="${orders.ticketCount}" placeholder="ticket_count" validate="{minlength: 1,maxlength:0,required: true}"></div></div></div><div class="form-group"><label class="col-md-3 control-label">return_code<span class="required">* </span>
</label>
<div class="col-md-5">
<div class="input-group">
<span class="input-group-addon input-circle-left">
<i class="fa   fa-font"></i>
</span>
<input type="text" name="returnCode" id="returnCode" class="form-control"  value="${orders.returnCode}" placeholder="return_code" validate="{minlength: 1,maxlength:2,required: true}"></div></div></div>
                    </div>
                    <div class="form-actions right">
                        <button type="button" class="btn default" onclick="history.go(-1)"><i class="fa fa-rotate-left"></i> 取消</button>
                        <button type="submit" class="btn green"><i class="fa fa-check"></i> 保存</button>
                    </div>
                </form>
                <!-- END FORM-->
            </div>
        </div>
    </div>
</div>
<%@ include file="../common/library.jsp" %>
</body>
</html>


