<!DOCTYPE html>
<%@ page language="java" pageEncoding="UTF-8" %>
<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <%@ include file="../common/head.jsp" %>
</head>
<body class="page-content">
<!-- BEGIN PAGE HEADER-->
<div class="page-bar">
    <ul class="page-breadcrumb">
        <li>
            <i class="fa fa-home"></i>
            <a href="/welcome">首页</a>
            <i class="fa fa-angle-right"></i>
        </li>
        <li>
            <a href="#">订单管理</a>
            <i class="fa fa-cube"></i>
        </li>

    </ul>
</div>
<div class="page-content">
    <!-- END PAGE HEADER-->
    <!-- BEGIN PAGE CONTENT-->
    <div class="row">
        <div class="col-md-12">
            <!-- BEGIN EXAMPLE TABLE PORTLET-->
            <div class="portlet box grey-cascade">
                <div class="portlet-title">
                    <div class="caption">
                        <i class="icon-user"></i>订单管理
                    </div>
                    <div class="tools">
                        <a href="javascript:;" class="collapse">
                        </a>
                        <a href="#portlet-config" data-toggle="modal" class="config">
                        </a>
                        <a href="javascript:;" class="reload">
                        </a>
                    </div>
                </div>
                <div class="portlet-body" id="ordersTable" >
                    <div class="table-toolbar">
                        <div class="row">
                            <div class="col-md-10">

                            </div>
                            <div class="col-md-2 pull-right">
                                <form id="ordersTableForm" onsubmit="init();return false;">
                                    <div class="input-group">
                                        <div class="input-icon">
                                            <i class="icon-magnifier"></i>
                                            <input class="form-control" type="text" name="orderNo" placeholder="order_no"/>
                                        </div>
												<span class="input-group-btn">
												<button class="btn btn-success" type="submit" ><i class="fa fa-arrow-left fa-fw"/></i> 搜索</button>
												</span>
                                    </div>
                                </form>
                            </div>
                        </div>
                    </div>
                    <table class="table table-striped table-bordered templatemo-user-table">
                        <thead>
                        <tr>
                            <th column="orderNo">订单号</th>
                            <th column="pftOrderNo">票付通订单号</th>
                            <th column="orderStatus" dataType="enum" dataValue="{0:'未支付',1:'已支付',2:'票付通下单成功',3:'已出票'}">订单状态</th>
                            <th column="lid">景区id</th>
                            <th column="tid">门票id</th>
                            <th column="productSn">产品ID</th>
                            <th column="orderMode" dataType="enum" dataValue="{0:'正常下单'}">下单方式</th>
                            <th column="m">供应商id</th>
                            <th column="tnum">数量</th>
                            <th column="tprice">价格</th>
                            <th column="playTime">游玩日期</th>
                            <th column="orderTel">手机号</th>
                            <th column="payMode" dataType="enum" dataValue="{0:'使用账户余额',2:'使用供应商授信支付',4:'现场支付'}">扣款方式</th>
                            <th column="smsSend" dataType="enum" dataValue="{0:'发送',1:'不发送'}">是否发送短信</th>
                            <th column="updated">更新时间</th>
                            <th column="created">创建时间</th>
<th action="true">操作</th>
                        </tr>
                        </thead>
                        <tbody>
                        </tbody>
                    </table>
                    <div class="table-toolbar pagination-toolbar">
                    </div>

                </div>
            </div>
            <!-- END EXAMPLE TABLE PORTLET-->
        </div>
    </div>
</div>
<%@ include file="../common/library.jsp" %>
<script src="/resources/js/PagingGrid.js"></script>
<script>
    function  init() {
        $("#ordersTable").pagingGrid(
                {
                    dataUrl: '/tourismpay/orders/list'
                    ,pageSize: 10
                    ,dockedItems: [{
                    name: '修改'
                    , iconClass: 'fa fa-edit'
                    , action: '/tourismpay/orders/edit'
                    , confirm: true
                    , parmaName: 'id'
                    , column: 'id'
                }
                    , {
                        name: '删除'
                        , iconClass: 'glyphicon glyphicon-trash'
                        , action: '/tourismpay/orders/delete'
                        , ajax:true
                        , confirm: true
                        , parmaName: 'id'
                        , column: 'id'
                    }
                ]
                    , pagingtoolbar: {
                    displayInfo: true
                }
                }
        );
    }

    //初始化
    init();


</script>


</body>
</html>


