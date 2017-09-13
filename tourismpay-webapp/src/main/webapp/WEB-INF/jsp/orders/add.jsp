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
            <i class="fa fa-plus "></i>
            <a href="#">添加</a>
        </li>
    </ul>
</div>
<div class="tab-content">
    <div class="tab-pane active" id="tab_0">
        <div class="portlet box grey-cascade">
            <div class="portlet-title">
                <div class="caption">
                    <i class="fa fa-adn"></i>添加订单
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
                <form action="/tourismpay/orders/post" class="form-horizontal">
                    <div class="form-body">
                      
<div class="form-group"><label class="col-md-3 control-label">order_no<span class="required">* </span>
</label>
<div class="col-md-5">
<div class="input-group">
<span class="input-group-addon input-circle-left">
<i class="fa   fa-font"></i>
</span>
<input type="text" name="orderNo" id="orderNo" class="form-control" placeholder="order_no" validate="{minlength: 1,maxlength:18,required: true}"></div></div></div><div class="form-group"><label class="col-md-3 control-label">pft_order_no<span class="required">* </span>
</label>
<div class="col-md-5">
<div class="input-group">
<span class="input-group-addon input-circle-left">
<i class="fa   fa-font"></i>
</span>
<input type="text" name="pftOrderNo" id="pftOrderNo" class="form-control" placeholder="pft_order_no" validate="{minlength: 1,maxlength:128,required: true}"></div></div></div><div class="form-group"><label class="col-md-3 control-label">product_sn<span class="required">* </span>
</label>
<div class="col-md-5">
<div class="input-group">
<span class="input-group-addon input-circle-left">
<i class="fa   fa-font"></i>
</span>
<input type="text" name="productSn" id="productSn" class="form-control" placeholder="product_sn" validate="{minlength: 1,maxlength:128,required: true}"></div></div></div><div class="form-group"><label class="col-md-3 control-label">order_mode<span class="required">* </span>
</label>
<div class="col-md-5">
<div class="input-group">
<span class="input-group-addon input-circle-left">
<i class="fa   fa-font"></i>
</span>
<input type="text" name="orderMode" id="orderMode" class="form-control" placeholder="order_mode" validate="{minlength: 1,required: true}"></div></div></div><div class="form-group"><label class="col-md-3 control-label">series<span class="required">* </span>
</label>
<div class="col-md-5">
<div class="input-group">
<span class="input-group-addon input-circle-left">
<i class="fa   fa-font"></i>
</span>
<input type="text" name="series" id="series" class="form-control" placeholder="series" validate="{minlength: 1,maxlength:64,required: true}"></div></div></div><div class="form-group"><label class="col-md-3 control-label">assembly<span class="required">* </span>
</label>
<div class="col-md-5">
<div class="input-group">
<span class="input-group-addon input-circle-left">
<i class="fa   fa-font"></i>
</span>
<input type="text" name="assembly" id="assembly" class="form-control" placeholder="assembly" validate="{minlength: 1,maxlength:100,required: true}"></div></div></div><div class="form-group"><label class="col-md-3 control-label">p_code<span class="required">* </span>
</label>
<div class="col-md-5">
<div class="input-group">
<span class="input-group-addon input-circle-left">
<i class="fa   fa-font"></i>
</span>
<input type="text" name="pCode" id="pCode" class="form-control" placeholder="p_code" validate="{minlength: 1,maxlength:64,required: true}"></div></div></div><div class="form-group"><label class="col-md-3 control-label">concat_id<span class="required">* </span>
</label>
<div class="col-md-5">
<div class="input-group">
<span class="input-group-addon input-circle-left">
<i class="fa   fa-font"></i>
</span>
<input type="text" name="concatId" id="concatId" class="form-control" placeholder="concat_id" validate="{minlength: 1,maxlength:64,required: true}"></div></div></div><div class="form-group"><label class="col-md-3 control-label">person_id<span class="required">* </span>
</label>
<div class="col-md-5">
<div class="input-group">
<span class="input-group-addon input-circle-left">
<i class="fa   fa-font"></i>
</span>
<input type="text" name="personId" id="personId" class="form-control" placeholder="person_id" validate="{minlength: 1,maxlength:18,required: true}"></div></div></div><div class="form-group"><label class="col-md-3 control-label">m<span class="required">* </span>
</label>
<div class="col-md-5">
<div class="input-group">
<span class="input-group-addon input-circle-left">
<i class="fa   fa-font"></i>
</span>
<input type="text" name="m" id="m" class="form-control" placeholder="m" validate="{minlength: 1,maxlength:64,required: true}"></div></div></div><div class="form-group"><label class="col-md-3 control-label">uu_order_num<span class="required">* </span>
</label>
<div class="col-md-5">
<div class="input-group">
<span class="input-group-addon input-circle-left">
<i class="fa   fa-font"></i>
</span>
<input type="text" name="uuOrderNum" id="uuOrderNum" class="form-control" placeholder="uu_order_num" validate="{minlength: 1,maxlength:64,required: true}"></div></div></div><div class="form-group"><label class="col-md-3 control-label">memo<span class="required">* </span>
</label>
<div class="col-md-5">
<div class="input-group">
<span class="input-group-addon input-circle-left">
<i class="fa   fa-font"></i>
</span>
<input type="text" name="memo" id="memo" class="form-control" placeholder="memo" validate="{minlength: 1,maxlength:200,required: true}"></div></div></div><div class="form-group"><label class="col-md-3 control-label">order_status<span class="required">* </span>
</label>
<div class="col-md-5">
<div class="input-group">
<span class="input-group-addon input-circle-left">
<i class="fa   fa-font"></i>
</span>
<input type="text" name="orderStatus" id="orderStatus" class="form-control" placeholder="order_status" validate="{minlength: 1,required: true}"></div></div></div><div class="form-group"><label class="col-md-3 control-label">response_msg<span class="required">* </span>
</label>
<div class="col-md-5">
<div class="input-group">
<span class="input-group-addon input-circle-left">
<i class="fa   fa-font"></i>
</span>
<input type="text" name="responseMsg" id="responseMsg" class="form-control" placeholder="response_msg" validate="{minlength: 1,maxlength:500,required: true}"></div></div></div><div class="form-group"><label class="col-md-3 control-label">respone_code<span class="required">* </span>
</label>
<div class="col-md-5">
<div class="input-group">
<span class="input-group-addon input-circle-left">
<i class="fa   fa-font"></i>
</span>
<input type="text" name="responeCode" id="responeCode" class="form-control" placeholder="respone_code" validate="{minlength: 1,maxlength:10,required: true}"></div></div></div><div class="form-group"><label class="col-md-3 control-label">tid<span class="required">* </span>
</label>
<div class="col-md-5">
<div class="input-group">
<span class="input-group-addon input-circle-left">
<i class="fa   fa-font"></i>
</span>
<input type="text" name="tid" id="tid" class="form-control" placeholder="tid" validate="{minlength: 1,maxlength:64,required: true}"></div></div></div><div class="form-group"><label class="col-md-3 control-label">updated<span class="required">* </span>
</label>
<div class="col-md-5">
<div class="input-group">
<span class="input-group-addon input-circle-left">
<i class="fa fa-calendar"></i>
</span>
<div class="input-group input-large date-picker input-daterange" data-date="2017-09-13" data-date-format="yyyy-mm-dd"><input type="text" name="updated" class="form-control" readonly=""><span class="input-group-btn"><button class="btn default" type="button"><i class="fa fa-calendar"></i></button></span></div></div></div></div><div class="form-group"><label class="col-md-3 control-label">lid<span class="required">* </span>
</label>
<div class="col-md-5">
<div class="input-group">
<span class="input-group-addon input-circle-left">
<i class="fa   fa-font"></i>
</span>
<input type="text" name="lid" id="lid" class="form-control" placeholder="lid" validate="{minlength: 1,maxlength:128,required: true}"></div></div></div><div class="form-group"><label class="col-md-3 control-label">created<span class="required">* </span>
</label>
<div class="col-md-5">
<div class="input-group">
<span class="input-group-addon input-circle-left">
<i class="fa fa-calendar"></i>
</span>
<div class="input-group input-large date-picker input-daterange" data-date="2017-09-13" data-date-format="yyyy-mm-dd"><input type="text" name="created" class="form-control" readonly=""><span class="input-group-btn"><button class="btn default" type="button"><i class="fa fa-calendar"></i></button></span></div></div></div></div><div class="form-group"><label class="col-md-3 control-label">tnum<span class="required">* </span>
</label>
<div class="col-md-5">
<div class="input-group">
<span class="input-group-addon input-circle-left">
<i class="fa   fa-font"></i>
</span>
<input type="text" name="tnum" id="tnum" class="form-control" placeholder="tnum" validate="{minlength: 1,required: true}"></div></div></div><div class="form-group"><label class="col-md-3 control-label">tprice<span class="required">* </span>
</label>
<div class="col-md-5">
<div class="input-group">
<span class="input-group-addon input-circle-left">
<i class="fa   fa-font"></i>
</span>
<input type="text" name="tprice" id="tprice" class="form-control" placeholder="tprice" validate="{minlength: 1,maxlength:10,required: true}"></div></div></div><div class="form-group"><label class="col-md-3 control-label">order_name<span class="required">* </span>
</label>
<div class="col-md-5">
<div class="input-group">
<span class="input-group-addon input-circle-left">
<i class="fa   fa-font"></i>
</span>
<input type="text" name="orderName" id="orderName" class="form-control" placeholder="order_name" validate="{minlength: 1,maxlength:100,required: true}"></div></div></div><div class="form-group"><label class="col-md-3 control-label">play_time<span class="required">* </span>
</label>
<div class="col-md-5">
<div class="input-group">
<span class="input-group-addon input-circle-left">
<i class="fa   fa-font"></i>
</span>
<input type="text" name="playTime" id="playTime" class="form-control" placeholder="play_time" validate="{minlength: 1,maxlength:10,required: true}"></div></div></div><div class="form-group"><label class="col-md-3 control-label">contact_tel<span class="required">* </span>
</label>
<div class="col-md-5">
<div class="input-group">
<span class="input-group-addon input-circle-left">
<i class="fa   fa-font"></i>
</span>
<input type="text" name="contactTel" id="contactTel" class="form-control" placeholder="contact_tel" validate="{minlength: 1,maxlength:20,required: true}"></div></div></div><div class="form-group"><label class="col-md-3 control-label">order_tel<span class="required">* </span>
</label>
<div class="col-md-5">
<div class="input-group">
<span class="input-group-addon input-circle-left">
<i class="fa   fa-font"></i>
</span>
<input type="text" name="orderTel" id="orderTel" class="form-control" placeholder="order_tel" validate="{minlength: 1,maxlength:11,required: true}"></div></div></div><div class="form-group"><label class="col-md-3 control-label">pay_mode<span class="required">* </span>
</label>
<div class="col-md-5">
<div class="input-group">
<span class="input-group-addon input-circle-left">
<i class="fa   fa-font"></i>
</span>
<input type="text" name="payMode" id="payMode" class="form-control" placeholder="pay_mode" validate="{minlength: 1,required: true}"></div></div></div><div class="form-group"><label class="col-md-3 control-label">sms_send<span class="required">* </span>
</label>
<div class="col-md-5">
<div class="input-group">
<span class="input-group-addon input-circle-left">
<i class="fa   fa-font"></i>
</span>
<input type="text" name="smsSend" id="smsSend" class="form-control" placeholder="sms_send" validate="{minlength: 1,required: true}"></div></div></div>
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


