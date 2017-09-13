<!DOCTYPE html>
<%@ page language="java" pageEncoding="UTF-8" %>
<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <%@ include file="../common/head.jsp" %>
</head>
<body>
<script>
    window.onload=function show2dBarCode(){
        $("#imageId").attr("src","getImage?out_trade_no=${out_trade_no}");
    }
</script>

<div align="center">
    <image id="imageId" src="" width="90%" style="max-width: 400px;">
        <br/>
        <small style="color: gray">扫一扫上面二维码进行支付</small>
</div>
</body>
<%@ include file="../common/library.jsp" %>
</html>


