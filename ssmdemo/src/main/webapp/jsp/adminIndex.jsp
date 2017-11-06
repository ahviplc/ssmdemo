<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@include file="../../../common/common.jsp"%>
<!DOCTYPE html>
<html lang="zh-cn">
<head>
	<meta charset="utf-8" />
	<meta http-equiv="Content-Type" content="tex/html;charset=UTF-8">
	<link href="<%=contextPath %>/common/images/zfdx.ico" rel="shortcut icon" type="image/x-icon" media="screen">
	<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
	<meta name="viewport" content="width=device-width, initial-scale=1.0" />
	<title>ssm-demo-后台管理</title>
	<link href="<%=contextPath %>/common/css/bootstrap.min.css" rel="stylesheet" />
	<link rel="stylesheet" href="<%=contextPath %>/common/css/font-awesome.min.css" />
	<!--[if IE 7]>
	  <link rel="stylesheet" href="<%=contextPath %>/common/css/font-awesome-ie7.min.css" />
	<![endif]-->
	<!--[if lte IE 8]>
	  <link rel="stylesheet" href="<%=contextPath %>/common/css/ace-ie.min.css" />
	<![endif]-->
	<link rel="stylesheet" href="<%=contextPath %>/common/css/ace.min.css" />
	<link rel="stylesheet" href="<%=contextPath %>/common/css/ace-rtl.min.css" />
	<link rel="stylesheet" href="<%=contextPath %>/common/css/ace-skins.min.css" />
	<link rel="stylesheet" href="<%=contextPath %>/common/css/common.css" />
	<!--[if lt IE 9]>
		<script src="<%=contextPath %>/common/js/html5shiv.js"></script>
		<script src="<%=contextPath %>/common/js/respond.min.js"></script>
	<![endif]-->
	
	<!--[if IE 7]>
		<link rel="stylesheet" href="<%=contextPath %>/common/css/font-awesome-ie7.min.css" />
	<![endif]-->
		<!--[if lte IE 8]>
		  <link rel="stylesheet" href="<%=contextPath %>/common/css/ace-ie.min.css" />
	<![endif]-->
</head>
<body>
 	<iframe id="top-iframe" src="<%=contextPath %>/login/top.jsp" name="top"></iframe>
	<iframe id="menu-iframe" src="<%=contextPath %>/login/menu.jsp" name="menu"></iframe>
	<iframe id="content-iframe" src="<%=contextPath %>/login/content.jsp" name="content"></iframe>
	
	<!--[if IE]>
	<script type="text/javascript">
	 window.jQuery || document.write("<script src='<%=contextPath %>/common/js/jquery-1.10.2.min.js'>"+"<"+"/script>");
	</script>
	<![endif]-->
	<!--[if !IE]> -->
	<script type="text/javascript">
		 window.jQuery || document.write("<script src='<%=contextPath %>/common/js/jquery-2.0.3.min.js'>"+"<"+"/script>");
	</script>
	<!-- <![endif]-->
	<script src="<%=contextPath %>/common/js/bootstrap.min.js"></script>
	<script>
		// 初始化宽度
		contentWidth();
		$(window).resize(function(){
			contentWidth();
		});
		function contentWidth(){
			var width = $("body").width();
			var menuWidth = $("#menu-iframe").width();
			var contentWidth = width - menuWidth-1;
			$("#content-iframe").width(contentWidth);
		}
		
		
		/**
		 *  更新iframe方法
		 * @param method 方法
		 * @param lazy 时间毫秒
		 */
		function updateIframe(method,lazy){
			var time = lazy ? lazy : 1;
			setTimeout(function(){
				$('#top-iframe')[0].contentWindow.api('message');
				<%-- $('#top-iframe').attr('src','<%=contextPath %>/login/top.jsp?rn='+(new Date()).getTime()); 刷新头部--%>
			},time*1000);
		}
		
		// 首页链接
		function indexlink(){
			$('#content-iframe').attr('src','<%=contextPath %>/login/content.jsp?rn='+(new Date()).getTime());
		}
	</script>
	
</body>
</html>

