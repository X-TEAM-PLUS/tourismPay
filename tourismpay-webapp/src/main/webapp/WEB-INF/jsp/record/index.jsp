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
            <a href="#">门票消费记录管理</a>
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
                        <i class="icon-user"></i>门票消费记录管理
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
                <div class="portlet-body" id="recordTable" >
                    <div class="table-toolbar">
                        <div class="row">
                            <div class="col-md-10">
                                <div class="btn-group">
                                    <button id="newRecordButton" class="btn green" onclick="location.href = 'add';">
                                        添加门票消费记录 <i class="fa fa-plus"></i>
                                    </button>
                                </div>
                            </div>
                            <div class="col-md-2 pull-right">
                                <form id="recordTableForm" onsubmit="init();return false;">
                                    <div class="input-group">
                                        <div class="input-icon">
                                            <i class="icon-magnifier"></i>
                                            <input class="form-control" type="text" name="id" placeholder="id"/>
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
                            
<th column="id" checkbox="true"><input type="checkbox" name="allCheckBox"></th>
<th column="actionTime">action_time</th>
<th column="updated">updated</th>
<th column="created">created</th>
<th column="orderState">order_state</th>
<th column="tnumber">tnumber</th>
<th column="source">source</th>
<th column="allCheckNum">all_check_num</th>
<th column="refundType">refund_type</th>
<th column="action">action</th>
<th column="id">id</th>
<th column="refundAmount">refund_amount</th>
<th column="remark">remark</th>
<th column="pftOrderNo">pft_order_no</th>
<th column="orderNo">order_no</th>
<th column="refundFee">refund_fee</th>
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
        $("#recordTable").pagingGrid(
                {
                    dataUrl: '/tourismpay/record/list'
                    ,pageSize: 10
                    ,dockedItems: [{
                    name: '修改'
                    , iconClass: 'fa fa-edit'
                    , action: '/tourismpay/record/edit'
                    , confirm: true
                    , parmaName: 'id'
                    , column: 'id'
                }
                    , {
                        name: '删除'
                        , iconClass: 'glyphicon glyphicon-trash'
                        , action: '/tourismpay/record/delete'
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


