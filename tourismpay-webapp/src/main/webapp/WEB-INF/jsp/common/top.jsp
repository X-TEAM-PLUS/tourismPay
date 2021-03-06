<%--
  Created by IntelliJ IDEA.
  User: yankun
  Date: 2015/6/24 0024
  Time: 15:07
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<script src="/resources/assets/global/plugins/jquery.min.js" type="text/javascript"></script>
<div class="page-header navbar navbar-fixed-top">
    <!-- BEGIN HEADER INNER -->
    <div class="page-header-inner">
        <!-- BEGIN LOGO -->
        <%--<div class="page-logo">--%>
            <%--&lt;%&ndash;<a href="javascript:;">&ndash;%&gt;--%>
                <%--&lt;%&ndash;<li class="fa fa-desktop  fa-5x"></li>统一管理平台&ndash;%&gt;--%>
            <%--&lt;%&ndash;</a>&ndash;%&gt;--%>
            <%--&lt;%&ndash;<div class="menu-toggler sidebar-toggler hide">&ndash;%&gt;--%>
                <%--&lt;%&ndash;<li class="fa fa-desktop  fa-5x"></li>统一管理平台&ndash;%&gt;--%>
            <%--&lt;%&ndash;</div>&ndash;%&gt;--%>

        <%--</div>--%>
        <div class="page-logo ">
            <a href="/index" target="_top" class="logo-default">
                <%--<img src="/resources/assets/admin/layout/img/logo.png" alt="logo"/>--%>
                <%--li class="fa fa-desktop  font-red "></li>--%><span style="font-size: 24px;"><b>统一管理平台</b></span>
            </a>
            <div class="menu-toggler sidebar-toggler">
            </div>
        </div>

        <!-- END LOGO -->

        <!-- BEGIN RESPONSIVE MENU TOGGLER -->
        <a href="javascript:;" class="menu-toggler responsive-toggler" data-toggle="collapse" data-target=".navbar-collapse">
        </a>
        <!-- END RESPONSIVE MENU TOGGLER -->
        <!-- BEGIN TOP NAVIGATION MENU -->
        <div class="top-menu">
            <ul class="nav navbar-nav pull-right">
                <!-- BEGIN USER LOGIN DROPDOWN -->
                <!-- DOC: Apply "dropdown-dark" class after below "dropdown-extended" to change the dropdown styte -->
                <li class="dropdown dropdown-user">
                    <a href="javascript:;" class="dropdown-toggle" data-toggle="dropdown" data-hover="dropdown" data-close-others="true">
                        <img alt="" class="img-circle" src="/resources/assets/admin/layout/img/user.png"/>
					<span class="username username-hide-on-mobile" id="userNameSpan">
					Nick </span>
                        <i class="fa fa-angle-down"></i>
                    </a>
                    <ul class="dropdown-menu dropdown-menu-default">
                        <li>
                            <a href="" id="editUserInfoId">
                                <i class="icon-user"></i> 修改资料 </a>
                        </li>
                        <li>
                            <a href="" id="editPwdId">
                                <i class="icon-key"></i> 修改密码 </a>
                        </li>
                    </ul>
                </li>
                <!-- END USER LOGIN DROPDOWN -->
                <!-- BEGIN QUICK SIDEBAR TOGGLER -->
                <!-- DOC: Apply "dropdown-dark" class after below "dropdown-extended" to change the dropdown styte -->
                <li>
                    <a href="#" data-toggle="control-sidebar" title="退出系统" onclick="window.location.href='/logout'"><i class="fa  fa-power-off"></i>退出</a>
                </li>
                <!-- END QUICK SIDEBAR TOGGLER -->
            </ul>
        </div>
        <!-- END TOP NAVIGATION MENU -->
    </div>
    <!-- END HEADER INNER -->
</div>
<script>
    $(document).ready(function () {
        jQuery.ajax({
            type: "post",
            async: true,
            url: contextPath + "/umplatform/user/getUserInfoFormCookie",
            success: function(result){
                $("#userNameSpan").text(result.data.userName);
                $("#editUserInfoId").attr("href","/umplatform/user/toEditBasicInfo?id="+result.data.id);
                $("#editPwdId").attr("href","/umplatform/user/toEditPsw?id="+result.data.id);

            }
        });
    });
</script>