;(function($,undefined) {

/*
 逻辑参数配置,属性列表如下：
 	serverCtx：服务请求上下文根
 */
var setting={}
;

function heartbeat(){
	var url=setting.serverCtx+'/heartbeat.action?rn='+(new Date()).getTime();
	var postValue='userId='+setting.userId;
	$.post(url,postValue,function(data){
		if(data.state==1){
			top.document.location.href=setting.serverCtx;
		}
	},'json');
}
/*
脚本逻辑主入口
@options 考试参数，参数属性参考setting说明
*/
$.sso={
	/*初始化*/
	init:function(options){
		$.extend(true, setting, options);
		setTimeout(function(){
			$(top).focus(function(){
				heartbeat();
			});
		},3000);
	}
};
})(jQuery);
