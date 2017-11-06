
//图片放大

$(function(){
	
	/* 图片放大 */
	$(".picList li").click(function(){
		var src = $(this).find("img").attr("src");
	    $("#flow_pohto").fadeIn();
	    $("#mask").show();
	    $('#big_image').attr('src',src);
	    
	    var browserHeight = parseInt($(window).height());//获取浏览器的高度
	    var realHeight = $("#big_image").height(); // 图片真实高度
	    var boxHeight = $("#flow_pohto").height(); // 盒子高度
	    var marTop = (boxHeight - realHeight)/2; // 图片距离盒子顶部距离
	    var boxMarTop = (browserHeight - boxHeight)/2 - 20; // 盒子距离浏览器顶部距离
	    if(realHeight < boxHeight){ // 图片真实高度小于盒子高度
	    	$("#big_image").css({"margin-top" : marTop + 'px'});
	    	$("#flow_pohto").css({"overflow-y": "auto","top" : boxMarTop + 'px'});
	    }else{
	    	$("#flow_pohto").css({"overflow-y": "scroll","top" : boxMarTop + 'px'});
	    	$("#big_image").css({"margin-top":'0px'});
	    }
	});
	$("#close_flow_pohto,#mask").click(function(){
	    $("#flow_pohto").hide();
	    $("#mask").hide();
	});
	
});