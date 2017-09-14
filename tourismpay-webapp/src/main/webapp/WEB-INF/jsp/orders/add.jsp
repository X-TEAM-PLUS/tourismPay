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

                        <div class="form-group"><label class="col-md-3 control-label">product_sn<span class="required">* </span>
                        </label>
                            <div class="col-md-5">
                                <div class="input-group">
<span class="input-group-addon input-circle-left">
<i class="fa   fa-font"></i>
</span>
                                    <input type="text" name="productSn" id="productSn" class="form-control" placeholder="product_sn" value="2803" validate="{minlength: 1,maxlength:128,required: true}"></div>
                            </div>
                        </div>
                        <div class="form-group"><label class="col-md-3 control-label">order_mode<span class="required">* </span>
                        </label>
                            <div class="col-md-5">
                                <div class="input-group">
<span class="input-group-addon input-circle-left">
<i class="fa   fa-font"></i>
</span>
                                    <input type="text" name="orderMode" id="orderMode" class="form-control" placeholder="order_mode" validate="{minlength: 1,required: true}" value="0"></div>
                            </div>
                        </div>



                        <div class="form-group"><label class="col-md-3 control-label">concat_id<span class="required">* </span>
                        </label>
                            <div class="col-md-5">
                                <div class="input-group">
<span class="input-group-addon input-circle-left">
<i class="fa   fa-font"></i>
</span>
                                    <input type="text" name="concatId" id="concatId" class="form-control" placeholder="concat_id" ></div>
                            </div>
                        </div>
                        <div class="form-group"><label class="col-md-3 control-label">person_id<span class="required">* </span>
                        </label>
                            <div class="col-md-5">
                                <div class="input-group">
<span class="input-group-addon input-circle-left">
<i class="fa   fa-font"></i>
</span>
                                    <input type="text" name="personId" id="personId" class="form-control" placeholder="person_id" ></div>
                            </div>
                        </div>
                        <div class="form-group"><label class="col-md-3 control-label">m<span class="required">* </span>
                        </label>
                            <div class="col-md-5">
                                <div class="input-group">
<span class="input-group-addon input-circle-left">
<i class="fa   fa-font"></i>
</span>
                                    <input type="text" name="m" id="m" class="form-control" placeholder="m" validate="{minlength: 1,maxlength:64,required: true}" value="113"></div>
                            </div>
                        </div>
                        <div class="form-group"><label class="col-md-3 control-label">order_status<span class="required">* </span>
                        </label>
                            <div class="col-md-5">
                                <div class="input-group">
<span class="input-group-addon input-circle-left">
<i class="fa   fa-font"></i>
</span>
                                    <input type="text" name="orderStatus" id="orderStatus" class="form-control" placeholder="order_status" value="0"></div>
                            </div>
                        </div>

                        <div class="form-group"><label class="col-md-3 control-label">tid<span class="required">* </span>
                        </label>
                            <div class="col-md-5">
                                <div class="input-group">
<span class="input-group-addon input-circle-left">
<i class="fa   fa-font"></i>
</span>
                                    <input type="text" name="tid" id="tid" class="form-control" placeholder="tid" value="5715"></div>
                            </div>
                        </div>
                        <div class="form-group"><label class="col-md-3 control-label">lid<span class="required">* </span>
                        </label>
                            <div class="col-md-5">
                                <div class="input-group">
<span class="input-group-addon input-circle-left">
<i class="fa   fa-font"></i>
</span>
                                    <input type="text" name="lid" id="lid" class="form-control" placeholder="lid" value="2633"></div>
                            </div>
                        </div>

                        <div class="form-group"><label class="col-md-3 control-label">tnum<span class="required">* </span>
                        </label>
                            <div class="col-md-5">
                                <div class="input-group">
<span class="input-group-addon input-circle-left">
<i class="fa   fa-font"></i>
</span>
                                    <input type="text" name="tnum" id="tnum" class="form-control" placeholder="tnum" value="2"></div>
                            </div>
                        </div>
                        <div class="form-group"><label class="col-md-3 control-label">tprice<span class="required">* </span>
                        </label>
                            <div class="col-md-5">
                                <div class="input-group">
<span class="input-group-addon input-circle-left">
<i class="fa   fa-font"></i>
</span>
                                    <input type="text" name="tprice" id="tprice" class="form-control" placeholder="tprice" value="2"></div>
                            </div>
                        </div>
                        <div class="form-group"><label class="col-md-3 control-label">order_name<span class="required">* </span>
                        </label>
                            <div class="col-md-5">
                                <div class="input-group">
<span class="input-group-addon input-circle-left">
<i class="fa   fa-font"></i>
</span>
                                    <input type="text" name="orderName" id="orderName" class="form-control" placeholder="order_name"  value="测试下单专员"></div>
                            </div>
                        </div>
                        <div class="form-group"><label class="col-md-3 control-label">play_time<span class="required">* </span>
                        </label>
                            <div class="col-md-5">
                                <div class="input-group">
<span class="input-group-addon input-circle-left">
<i class="fa   fa-font"></i>
</span>
                                    <input type="text" name="playTime" id="playTime" class="form-control" placeholder="play_time" value="2017-11-13"></div>
                            </div>
                        </div>
                        <div class="form-group"><label class="col-md-3 control-label">contact_tel<span class="required">* </span>
                        </label>
                            <div class="col-md-5">
                                <div class="input-group">
<span class="input-group-addon input-circle-left">
<i class="fa   fa-font"></i>
</span>
                                    <input type="text" name="contactTel" id="contactTel" class="form-control" placeholder="contact_tel" value="13701312791"></div>
                            </div>
                        </div>
                        <div class="form-group"><label class="col-md-3 control-label">order_tel<span class="required">* </span>
                        </label>
                            <div class="col-md-5">
                                <div class="input-group">
<span class="input-group-addon input-circle-left">
<i class="fa   fa-font"></i>
</span>
                                    <input type="text" name="orderTel" id="orderTel" class="form-control" placeholder="order_tel"  value="13701312791"></div>
                            </div>
                        </div>
                        <div class="form-group"><label class="col-md-3 control-label">pay_mode<span class="required">* </span>
                        </label>
                            <div class="col-md-5">
                                <div class="input-group">
<span class="input-group-addon input-circle-left">
<i class="fa   fa-font"></i>
</span>
                                    <input type="text" name="payMode" id="payMode" class="form-control" placeholder="pay_mode" value="2" ></div>
                            </div>
                        </div>
                        <div class="form-group"><label class="col-md-3 control-label">sms_send<span class="required">* </span>
                        </label>
                            <div class="col-md-5">
                                <div class="input-group">
<span class="input-group-addon input-circle-left">
<i class="fa   fa-font"></i>
</span>
                                    <input type="text" name="smsSend" id="smsSend" class="form-control" placeholder="sms_send"  value="1"></div>
                            </div>
                        </div>
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


