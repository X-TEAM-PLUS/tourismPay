<!DOCTYPE html>
<%@ page language="java" pageEncoding="UTF-8" %>
<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/assets/global/css/index.css">
    <script src="/resources/js/push.js"></script>
    <script src="/resources/js/jquery-1.js"></script>
    <%@ include file="../common/head.jsp" %>
</head>
<body>
<script>
    var interval;
    window.onload=function show2dBarCode(){
        $("#imageId").attr("src","getImage?out_trade_no=${out_trade_no}");

        interval = setInterval("checkstatus()",1000);
    }
    function checkstatus(){
        var out_trade_no = '${out_trade_no}';
        $.ajax({
            type: "get",
            url: "/tourismpay/getrq/checkStatus",
            data: "out_trade_no=" + out_trade_no,
            success: function (result) {
                if (result.status == "0"){
                    alert("支付成功，订单已经发到您的手机号，请注意查收!");
                    clearInterval(interval);
                    window.close();
                }
            }
        });
    }

    var sh=window.screen.height;
    var sw=window.screen.width;
    console.log(sh);
    console.log(sw);
    document.cookie="sh="+sh;
    document.cookie="sw="+sw;


</script>


</body>


<body id="bcont">



<div class="indcont">


    <div id="head">
        <div class="warp">
            <div class="lfogo"><img src="/resources/assets/global/images/lfogo.png">随州炎帝故里文化旅游区&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;国家5A级景区即将为您呈现</div>
            <div class="js-tourist">
                <span>景区浏览人数</span>
                <span class="now-num">1363</span>
                <span>未来接待游客</span>
                <div class="visitor">
                    <span class="drop-text">第一天</span>
                    <div class="visitor-more top-on">
                        <a class=" js-visitor" data-value="1130" href="#">第一天</a>
                        <a class=" js-visitor" data-value="1529" href="#">第二天</a>
                        <a class=" js-visitor" data-value="1329" href="#">第三天</a>
                    </div>
                </div>
                <span id="visitorNum">1130</span>
            </div>


            <div class="version fr">
                <a href="http://www.szydgl.com/?language=zh-cn" class="en">简体中文<i class="icon_tr"></i></a>
                <div class="ver_down hide">
                    <a href="http://www.szydgl.com/?language=en-us">English</a>    						<a href="http://www.szydgl.com/?language=jp-jp">日本語の</a>    						<a href="http://www.szydgl.com/?language=kor-kor">한국어</a>
                </div>
            </div>
            <div class="weather fr">
                <iframe style=" margin-top: 12px;" scrolling="no" allowtransparency="true" src="http://i.tianqi.com/index.php?c=code&id=1&color=%23FFFFFF&icon=1&py=suizhou&wind=0&num=1" width="260" height="20" frameborder="0"></iframe>
            </div>
        </div>
    </div>
    <script>
        $('.visitor').mouseover(function(e) {
            e.stopPropagation();
        });
        $('body').mouseover(function() {
            $('.visitor-more').addClass('top-on');
            $('.visitor').removeClass('visitor-a');
        });
        $('.drop-text').mousemove(function() {
            $('.visitor-more').removeClass('top-on');
            $('.visitor').addClass('visitor-a');
        });
        $(".js-visitor").click(function () {
            $(".top-on").removeClass("top-on");
            var self = $(this);
            $("#visitorNum").text(self.attr("data-value"));
            $(".visitor").find(".drop-text").text(self.text());
        });



    </script>

    <div class="navwarp">
        <ul class="nav_menu">
            <li style="width:150px">
                <a href="http://www.szydgl.com/index.html" class="item ">
                    <span>首页</span><s class="inblock"></s>
                </a>
            </li>
            <li style="width:150px">
                <a href="http://www.szydgl.com/Index/News/index" class="item ">
                    <span>景区资讯</span><s class="inblock"></s>
                </a>
                <div class="down_nav clearfix" style="display: none;">
                    <dl>
                        <dt></dt>
                        <dd><a id="1" href="http://www.szydgl.com/index/news/listList/id/1">景区公告</a></dd><dd><a id="2" href="http://www.szydgl.com/index/news/listList/id/2">景区新闻</a></dd><dd><a id="3" href="http://www.szydgl.com/index/news/listList/id/3">特色活动</a></dd><dd><a id="4" href="http://www.szydgl.com/index/news/listList/id/4">5A专栏</a></dd><dd><a id="5" href="http://www.szydgl.com/index/news/listList/id/5">景区荣誉</a></dd>	                	</dl>
                </div>
            </li>
            <li style="width:150px">
                <a href="http://www.szydgl.com/index/Spotsurvey/index" class="item ">
                    <span>景区概况</span><s class="inblock"></s>
                </a>
                <div class="down_nav clearfix" style="display: none;">
                    <dl>
                        <dt></dt>
                        <dd><a href="http://www.szydgl.com/index/Spotsurvey/spotsDes" class="cur">景区介绍</a></dd>							<dd><a href="http://www.szydgl.com/Index/Service/voice">语音导游</a></dd>
                        <dd><a id="11" href="http://www.szydgl.com/index/Spotsurvey/listList/id/11">美图赏析</a></dd><dd><a id="12" href="http://www.szydgl.com/index/Spotsurvey/listList/id/12">视频赏析</a></dd>	                	</dl>
                </div>
            </li>
            <li style="width:150px">
                <a href="http://www.szydgl.com/Index/Areaculture/index" class="item">
                    <span>景区文化</span><s class="inblock"></s>
                </a>
                <div class="down_nav clearfix" style="display: none;">
                    <dl>
                        <dt></dt>
                        <dd><a id="7" href="http://www.szydgl.com/index/Areaculture/listList/id/7">专题介绍</a></dd><dd><a id="8" href="http://www.szydgl.com/index/Areaculture/listList/id/8">世界华人炎帝故里寻根节</a></dd><dd><a id="9" href="http://www.szydgl.com/index/Areaculture/listList/id/9">炎帝文化</a></dd><dd><a id="10" href="http://www.szydgl.com/index/Areaculture/listList/id/10">曾随文化</a></dd><dd><a href="http://www.szydgl.com/index/Areaculture/onlineHope" class="cur">网上祭拜</a></dd>	                	</dl>
                </div>
            </li>
            <li style="width:150px" class="">
                <a href="http://www.szydgl.com/Index/travelguides/index" class="item ">
                    <span>旅游攻略</span><s class="inblock"></s>
                </a>
                <div class="down_nav clearfix" style="display: none;">
                    <dl>
                        <dt></dt>
                        <dd><a id="14" href="http://www.szydgl.com/index/travelguides/listList/id/14">交通路线</a></dd><dd><a id="15" href="http://www.szydgl.com/index/travelguides/listList/id/15">美食推荐</a></dd><dd><a id="16" href="http://www.szydgl.com/index/travelguides/listList/id/16">住宿酒店</a></dd><dd><a id="17" href="http://www.szydgl.com/index/travelguides/listList/id/17">民俗特产</a></dd><dd><a id="18" href="http://www.szydgl.com/index/travelguides/listList/id/18">休闲娱乐</a></dd><dd><a id="19" href="http://www.szydgl.com/index/travelguides/listList/id/19">导游服务</a></dd>
                    </dl>
                </div>
            </li>

            <li style="width:150px">
                <a href="http://demo.3shui.com/thb/szydgl/" target="_blank" class="item ">
                    <span>虚拟景区</span><s class="inblock"></s>
                </a>

            </li>
            <li style="width:150px">
                <a href="#" class="item ">
                    <span>电子商务</span><s class="inblock"></s>
                </a>
                <div class="down_nav clearfix" style="display: none;">
                    <dl>
                        <dt></dt>
                        <dd><a href="http://www.szydgl.com/Index/Service/orderReserList">门票预订</a></dd>
                        <dd><a href="http://www.szydgl.com/Index/Service/orderdyList">导游预订</a></dd>
                        <dd><a href="http://www.szydgl.com/Index/Service/orderRvdpc">电瓶车预订</a></dd>
                        <dd><a href="http://www.szydgl.com/Index/Service/orderyuleList">表演预订</a></dd>
                    </dl>
                </div>
            </li>
            <li style="width:150px">
                <a href="http://www.szydgl.com/wenda/" target="_blank" class="item ">
                    <span>互动交流</span><s class="inblock"></s>
                </a>

            </li>
        </ul>
    </div>


    <image id="imageId" src="" width="90%" style="max-width: 400px;">
        <br/>
        <small style="color: gray">扫一扫上面二维码进行支付</small>


    <div class="btmlink btp">
        <div class="warp clearfix">
            <span class="links">友情链接</span>
            <div class="linkebox">
                <a href="http://www.gov.cn/" target="_blank">中国政府网</a><a href="http://www.people.com.cn/" target="_blank">人民网</a><a href="http://www.cnta.gov.cn/" target="_blank">国家旅游局</a><a href="http://www.hubeitour.gov.cn/" target="_blank">湖北省旅游发展委员会</a><a href="http://www.suizhou.gov.cn/" target="_blank">随州市政府</a><a href="http://www.sztour.gov.cn/" target="_blank">随州旅游网</a><a href="http://szbwg.net/" target="_blank">随州博物馆</a><a href="http://www.dhs.gov.cn/" target="_blank">随州.大洪山</a>
            </div>
        </div>
    </div>
    <div class="ftbp">





        <div class="footer">
            <div class="foot-box">
                <div class="footer-list clearfix">
                    <div class="footer-item">
                        <div class="footer-item_img">
                            <div class="footer-item_img_box">
                                <img src="/resources/assets/global/images/foot-pic_1.png" alt="海峡两岸交流基地">
                            </div>
                        </div>
                        <p>海峡两岸交流基地</p>
                    </div>

                    <div class="footer-item">
                        <div class="footer-item_img">
                            <div class="footer-item_img_box">
                                <img src="/resources/assets/global/images/foot-pic_2.png" alt="中国华侨国际文化交流基地">
                            </div>
                        </div>
                        <p>中国华侨国际文化交流基地</p>
                    </div>

                    <div class="footer-item">
                        <div class="footer-item_img">
                            <div class="footer-item_img_box">
                                <img src="/resources/assets/global/images/foot-pic_3.png" alt="国家非物质文化遗产">
                            </div>
                        </div>
                        <p>国家非物质文化遗产</p>
                    </div>

                    <div class="footer-item">
                        <div class="footer-item_img">
                            <div class="footer-item_img_box">
                                <img src="/resources/assets/global/images/foot-pic_4.png" alt="国家AAAA级旅游景区">
                            </div>
                        </div>
                        <p>国家AAAA级旅游景区</p>
                    </div>

                    <div class="footer-item">
                        <div class="footer-item_img">
                            <div class="footer-item_img_box">
                                <img src="/resources/assets/global/images/foot-pic_5.png" alt="灵秀湖北十大旅游名片">
                            </div>
                        </div>
                        <p>灵秀湖北十大旅游名片</p>
                    </div>

                    <div class="footer-item">
                        <div class="footer-item_img">
                            <div class="footer-item_img_box">
                                <img src="/resources/assets/global/images/foot-pic_6.png" alt="湖北省爱国主义教育基地">
                            </div>
                        </div>
                        <p>湖北省爱国主义教育基地</p>
                    </div>

                    <div class="footer-item">
                        <div class="footer-item_img">
                            <div class="footer-item_img_box">
                                <img src="/resources/assets/global/images/foot-pic_7.png" alt="省青年最喜欢的鄂西景区">
                            </div>
                        </div>
                        <p>省青年最喜欢的鄂西景区</p>
                    </div>
                </div>
                <p>
                    <span>炎帝故里咨询热线：</span>
                    <b>0722-3339333&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</b>
                    <span>售票热线：</span>
                    <b>0722-4574616</b>
                </p>
                <p>
                    <span>随州博物馆热线：&nbsp;&nbsp;&nbsp;</span>
                    <b>0722-3810518&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</b>
                    <span>曾侯乙墓：</span>
                    <b>0722-3817227</b>
                </p>
                <p>
                    <span>地&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;址：湖北省随州市厉山镇神农大道83号&nbsp;&nbsp;&nbsp;</span>
                    <span>景区传真：0722-3339939&nbsp;&nbsp;&nbsp;</span>
                    <span>QQ咨询：1912068863</span>
                </p>
            </div>
        </div>







    </div>

</div>


<div class="fr fbc">
    <div><img src="/resources/assets/global/images/code.png"></div>
    <div>
        <p>扫码关注</p>
        <p>炎帝故里微信公众号</p>
    </div>
</div>


<script src="/resources/js/main.js"></script>

<script>
    (function(){
        var bp = document.createElement('script');
        var curProtocol = window.location.protocol.split(':')[0];
        if (curProtocol === 'https') {
            bp.src = 'https://zz.bdstatic.com/linksubmit/push.js';
        }
        else {
            bp.src = 'http://push.zhanzhang.baidu.com/push.js';
        }
        var s = document.getElementsByTagName("script")[0];
        s.parentNode.insertBefore(bp, s);
    })();
</script>




<script src="js/index.js"></script>

<script>
    $(".links").click(function () {
        $(this).toggleClass("linkcur");
        $(".linkebox").slideToggle();

    });
    jQuery(".tabmain").slide({ mainCell:".bd ul",delayTime:0,triggerTime:0,autoPlay:true });
    $(".notist").myScroll({visible:1});
</script>

<script>
    $(document).ready(function() {
        $('.slideInner').load("/index/index/getSlider",function(){

            $(".slideInner").slide({
                slideContainer: $('.slideInner a'),
                effect: 'easeOutCirc',
                autoRunTime: 9000,
                slideSpeed: 500,
                nav: true,
                autoRun: true,
                prevBtn: $('a.prev'),
                nextBtn: $('a.next')
            })
        });



    })
</script>

<script>
    (function(){
        var bp = document.createElement('script');
        var curProtocol = window.location.protocol.split(':')[0];
        if (curProtocol === 'https') {
            bp.src = 'https://zz.bdstatic.com/linksubmit/push.js';
        }
        else {
            bp.src = 'http://push.zhanzhang.baidu.com/push.js';
        }
        var s = document.getElementsByTagName("script")[0];
        s.parentNode.insertBefore(bp, s);
    })();
</script>


<script>
    $('.visitor').mouseover(function(e) {
        e.stopPropagation();
    });
    $('body').mouseover(function() {
        $('.visitor-more').addClass('top-on');
        $('.visitor').removeClass('visitor-a');
    });
    $('.drop-text').mousemove(function() {
        $('.visitor-more').removeClass('top-on');
        $('.visitor').addClass('visitor-a');
    });
    $(".js-visitor").click(function () {
        $(".top-on").removeClass("top-on");
        var self = $(this);
        $("#visitorNum").text(self.attr("data-value"));
        $(".visitor").find(".drop-text").text(self.text());
    });



</script></body>

<%@ include file="../common/library.jsp" %>
</html>


