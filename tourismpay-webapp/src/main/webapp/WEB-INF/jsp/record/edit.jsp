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
            <a href="index">门票消费记录管理</a>
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
                    <i class="fa fa-adn"></i>编辑门票消费记录
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
                <form action="/tourismpay/record/put" class="form-horizontal">
                    <input type="hidden" name="id" id="id" value="${application.id}">
                    <div class="form-body">
                        
<div class="form-group"><label class="col-md-3 control-label">action_time<span class="required">* </span>
</label>
<div class="col-md-5">
<div class="input-group">
<span class="input-group-addon input-circle-left">
<i class="fa   fa-font"></i>
</span>
<input type="text" name="actionTime" id="actionTime" class="form-control"  value="${record.actionTime}" placeholder="action_time" validate="{minlength: 1,maxlength:20,required: true}"></div></div></div><div class="form-group"><label class="col-md-3 control-label">updated<span class="required">* </span>
</label>
<div class="col-md-5">
<div class="input-group">
<span class="input-group-addon input-circle-left">
<i class="fa fa-calendar"></i>
</span>
<div class="input-group input-medium date date-picker" data-date="${record.updated}" data-date-format="yyyy-mm-dd" data-date-viewmode="years"><input type="text" name="updated" class="form-control" readonly=""><span class="input-group-btn"><button class="btn default"  value="${record.updated}" type="button"><i class="fa fa-calendar"></i></button></span></div></div></div></div><div class="form-group"><label class="col-md-3 control-label">created<span class="required">* </span>
</label>
<div class="col-md-5">
<div class="input-group">
<span class="input-group-addon input-circle-left">
<i class="fa fa-calendar"></i>
</span>
<div class="input-group input-medium date date-picker" data-date="${record.created}" data-date-format="yyyy-mm-dd" data-date-viewmode="years"><input type="text" name="created" class="form-control" readonly=""><span class="input-group-btn"><button class="btn default"  value="${record.created}" type="button"><i class="fa fa-calendar"></i></button></span></div></div></div></div><div class="form-group"><label class="col-md-3 control-label">order_state<span class="required">* </span>
</label>
<div class="col-md-5">
<div class="input-group">
<span class="input-group-addon input-circle-left">
<i class="fa   fa-font"></i>
</span>
<input type="text" name="orderState" id="orderState" class="form-control"  value="${record.orderState}" placeholder="order_state" validate="{minlength: 1,maxlength:2,required: true}"></div></div></div><div class="form-group"><label class="col-md-3 control-label">tnumber<span class="required">* </span>
</label>
<div class="col-md-5">
<div class="input-group">
<span class="input-group-addon input-circle-left">
<i class="fa   fa-font"></i>
</span>
<input type="text" name="tnumber" id="tnumber" class="form-control"  value="${record.tnumber}" placeholder="tnumber" validate="{minlength: 1,maxlength:20,required: true}"></div></div></div><div class="form-group"><label class="col-md-3 control-label">source<span class="required">* </span>
</label>
<div class="col-md-5">
<div class="input-group">
<span class="input-group-addon input-circle-left">
<i class="fa   fa-font"></i>
</span>
<input type="text" name="source" id="source" class="form-control"  value="${record.source}" placeholder="source" validate="{minlength: 1,maxlength:1,required: true}"></div></div></div><div class="form-group"><label class="col-md-3 control-label">all_check_num<span class="required">* </span>
</label>
<div class="col-md-5">
<div class="input-group">
<span class="input-group-addon input-circle-left">
<i class="fa   fa-font"></i>
</span>
<input type="text" name="allCheckNum" id="allCheckNum" class="form-control"  value="${record.allCheckNum}" placeholder="all_check_num" validate="{minlength: 1,maxlength:20,required: true}"></div></div></div><div class="form-group"><label class="col-md-3 control-label">refund_type<span class="required">* </span>
</label>
<div class="col-md-5">
<div class="input-group">
<span class="input-group-addon input-circle-left">
<i class="fa   fa-font"></i>
</span>
<input type="text" name="refundType" id="refundType" class="form-control"  value="${record.refundType}" placeholder="refund_type" validate="{minlength: 1,maxlength:1,required: true}"></div></div></div><div class="form-group"><label class="col-md-3 control-label">action<span class="required">* </span>
</label>
<div class="col-md-5">
<div class="input-group">
<span class="input-group-addon input-circle-left">
<i class="fa   fa-font"></i>
</span>
<input type="text" name="action" id="action" class="form-control"  value="${record.action}" placeholder="action" validate="{minlength: 1,maxlength:1,required: true}"></div></div></div><div class="form-group"><label class="col-md-3 control-label">id<span class="required">* </span>
</label>
<div class="col-md-5">
<div class="input-group">
<span class="input-group-addon input-circle-left">
<i class="fa   fa-font"></i>
</span>
<input type="text" name="id" id="id" class="form-control"  value="${record.id}" placeholder="id" validate="{minlength: 1,maxlength:18,required: true}"></div></div></div><div class="form-group"><label class="col-md-3 control-label">refund_amount<span class="required">* </span>
</label>
<div class="col-md-5">
<div class="input-group">
<span class="input-group-addon input-circle-left">
<i class="fa   fa-font"></i>
</span>
<input type="text" name="refundAmount" id="refundAmount" class="form-control"  value="${record.refundAmount}" placeholder="refund_amount" validate="{minlength: 1,maxlength:18,required: true}"></div></div></div><div class="form-group"><label class="col-md-3 control-label">remark<span class="required">* </span>
</label>
<div class="col-md-5">
<div class="input-group">
<span class="input-group-addon input-circle-left">
<i class="fa fa-comment"></i>
</span>
<input type="text" name="remark" id="remark" class="form-control"  value="${record.remark}" placeholder="remark" validate="{minlength: 1,maxlength:200,required: true}"></div></div></div><div class="form-group"><label class="col-md-3 control-label">pft_order_no<span class="required">* </span>
</label>
<div class="col-md-5">
<div class="input-group">
<span class="input-group-addon input-circle-left">
<i class="fa   fa-font"></i>
</span>
<input type="text" name="pftOrderNo" id="pftOrderNo" class="form-control"  value="${record.pftOrderNo}" placeholder="pft_order_no" validate="{minlength: 1,maxlength:128,required: true}"></div></div></div><div class="form-group"><label class="col-md-3 control-label">order_no<span class="required">* </span>
</label>
<div class="col-md-5">
<div class="input-group">
<span class="input-group-addon input-circle-left">
<i class="fa   fa-font"></i>
</span>
<input type="text" name="orderNo" id="orderNo" class="form-control"  value="${record.orderNo}" placeholder="order_no" validate="{minlength: 1,maxlength:18,required: true}"></div></div></div><div class="form-group"><label class="col-md-3 control-label">refund_fee<span class="required">* </span>
</label>
<div class="col-md-5">
<div class="input-group">
<span class="input-group-addon input-circle-left">
<i class="fa   fa-font"></i>
</span>
<input type="text" name="refundFee" id="refundFee" class="form-control"  value="${record.refundFee}" placeholder="refund_fee" validate="{minlength: 1,maxlength:18,required: true}"></div></div></div>
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


