
	// $(function(){
	// 	var bannerSlider = new Slider($('#banner_tabs'), {
	// 		time: 5000,
	// 		delay: 400,
	// 		event: 'hover',
	// 		auto: true,
	// 		mode: 'fade',
	// 		controller: $('#bannerCtrl'),
	// 		activeControllerCls: 'active'
	// 	});
	// 	$('#banner_tabs .flex-prev').click(function() {
	// 		bannerSlider.prev()
	// 	});
	// 	$('#banner_tabs .flex-next').click(function() {
	// 		bannerSlider.next()
	// 	});
	// });

	
	//**导航**//
	$(function(){
		$(".nav_menu li").hover(function(){
			//$(this).addClass('on').find('.down_nav').slideDown('fast');
			$(this).find(".down_nav").show();
			if ($(this).find('.down_nav').length) $(this).addClass("on");
			// $(".mainMask").css({
			// 	"display":"block",
			// 	"opacity":"0.8"
			// });

		},function(){
			//$(this).removeAttr('class').find('.down_nav').slideUp('fast');
			$(".down_nav").hide();
			$(this).removeClass("on");
			// $(".mainMask").css({
			// 	"display":"none",
			// 	"opacity":"0"
			// })
		});
	}());

	/*版本*/
	$(function(){
		$(".version").hover(function(){
			$(this).find(".ver_down").show();
		},function(){
			$(".ver_down").hide();
		});
	}());


	$(function(){
		$(window).scroll(function(){
				var scrollTop = $(window).scrollTop();
				var winHeight = $(window).height();
				if(scrollTop > 20){
						$(".htop").css({'position':'fixed','top':'0px','left':'0px'});
				}
				else{
						$(".htop").css({'position':'relative','top':'inherit','left':'inherit'})
				}
		});
		//$('#body').fullpage();
	}());


	// 图片轮播
    picfnFun();
    function picfnFun(){
        for(var i=0;i<$(".srcbox").length;i++){
            picFun(i);
        }
        function picFun(iNum){
            var ipic=$(".srcbox").eq(iNum).find("img");
            var icon=$(".srcicon").eq(iNum).find("a");
            var timer=null;
            var ithis=0;
            var il=ipic.length-1;
            icon.hover(function(){
                if(timer){
                    clearInterval(timer);
                }
                ithis=$(this).index();
                pic();
            },function(){
                timer=setInterval(function(){
                    if(ithis<il){
                        ithis++;
                    }
                    else{
                        ithis=0;
                    }
                    pic();
                },2000)
            })
            timer=setInterval(function(){
                if(ithis<il){
                    ithis++;
                }
                else{
                    ithis=0;
                }
                pic();
            },2000)
            function pic(){
                ipic.eq(ithis).stop(true,true).fadeIn().siblings().stop(true,true).fadeOut();
                icon.eq(ithis).addClass("active").siblings().removeClass("active");
            }
        }
    }


	function skeyword(){
		var search = document.getElementById("searchput");
		if (search.value == "" || search.value == "模拟飞行") {
				alert("请输入搜索内容！");
				search.focus();
				return false;
		}else{
				window.location = "search.html?kw=" + search.value;
		}
		$(function(){
				var search = $("#searchput");
				search.keydown(function(e){
						if (e.keyCode == 13) {
							skeyword();
						}
				});
		});
	};


	var _index = 0;
	$(".flash4 ul li").mouseover(function(){
			_index = $(this).index();
			$(this).stop().stop().animate({width:860},500).siblings("li").stop().animate({width:140},500);
			$(".imgCen").eq(_index).css("display","block").siblings(".imgCen").css("display","none");
			$(".imgBtn").eq(_index).css("display","block").siblings(".imgBtn").css("display","none");
			$(".imgTop img").eq(_index).addClass("tm").siblings(".imgTop img").removeClass("tm");
	});

	$(".flash4 ul li").mouseout(function(){
			$(".imgCen").css("display","none");
			$(".imgBtn").css("display","none");
	});


	// $(".slideshow li.one").hover(function(){
	// 	$(this).find("img").css({"opacity":"1"});
	// 	$(this).siblings(".two").css({ "left":"860px"});
	// 	$(this).siblings(".three").css({ "left":"1010px"});
	// 	$(this).siblings("li").find(".desc").css({ "display":"none"});
	// 	$(this).siblings("li").find(".desc").animate({bottom:"0px"},500);
	// 	$(this).siblings("li").find("img").css({"opacity":"0.5","left":"-700px"});
	// });
	// $(".slideshow li.two").hover(function(){
	// 	$(this).css({"left":"760px"});
	// 	$(this).find("img").css({
	// 		"opacity":"1",
	// 		"left":"-610px"
	// 	});
	// 	$(this).find(".desc").css({
	// 		"display":"block"
	// 	});
	// 	$(this).find(".desc").animate({bottom:"0px"},500);
	// 	$(this).siblings(".three").css({ "left":"1010px"});
	// 	$(this).siblings(".three").find(".desc").css({ "display":"none"});
	// 	$(this).siblings(".three").find("img").css({"opacity":"0.5","left":"-700px"});
	// });
	// $(".slideshow li.three").hover(function(){
	// 	$(this).css({"left":"910px"});
	// 	$(this).find("img").css({
	// 		"opacity":"1",
	// 		"left":"-610px"
	// 	});
	// 	$(this).find(".desc").css({
	// 		"display":"block",
	// 	});
	// 	$(this).find(".desc").animate({bottom:"0px"},500);
	// 	$(this).siblings(".two").css({ "left":"760px"});
	// 	$(this).siblings(".two").find(".desc").css({ "display":"none"});
	// 	$(this).siblings(".two").find("img").css({"opacity":"0.5","left":"-700px"});
	// });


	
	