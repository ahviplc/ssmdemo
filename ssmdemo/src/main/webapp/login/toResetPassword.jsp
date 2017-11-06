<%@page contentType="text/html; charset=utf-8" language="java" pageEncoding="UTF-8"%>
<%@include file="../../../common/common.jsp"%>
<!DOCTYPE html>
<html lang="zh-cn">
<head>
	<meta charset="utf-8">
	<meta http-equiv="Content-Type" content="tex/html;charset=UTF-8">
	<link href="<%=contextPath %>/common/images/zfdx.ico" rel="shortcut icon" type="image/x-icon" media="screen">
    <meta http-equiv="X-UA-Compatible" content="IE=edge"/>
    <meta http-equiv="Expires" content="0">
    <meta http-equiv="Cache-Control" content="no-cache">
    <meta http-equiv="Pragma" content="no-cache">
    <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no">
    <meta name="renderer" content="webkit">
    <meta name="baidu-site-verification" content="gjQdVKptVG" />
	<title>登录 - 法律诊所数字化教学系统</title>
	<link rel="stylesheet" type="text/css" href="<%=contextPath %>/common/css/bootstrap.min.css" />
	<link rel="stylesheet" type="text/css" href="<%=contextPath %>/common/css/font-awesome.min.css" />
	<link rel="stylesheet" type="text/css" href="<%=contextPath %>/common/css/ace.min.css" />
	<link rel="stylesheet" type="text/css" href="<%=contextPath %>/common/css/ace-rtl.min.css" />
	<link rel="stylesheet" type="text/css" href="<%=contextPath %>/common/css/common.css" />
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
<body class="login-body">
	<section class="main clearfix login">
		<div class="wrap-inputs">
			<div class="logo"><img alt="logo" src="<%=contextPath %>/common/images/logo.png"></div>
			<div id="login-content" class="content-box">
				<h2 class="white subtitle">法律诊所数字化教学系统</h2>
				<h4 class="header lighter white"><i class="icon-lock"></i>密码重置</h4>
				<form class="form-horizontal" id="form-reset-password" action="resetPassword.action" method="post">
					<s:hidden name="userVo.id"/>
					<label class="block clearfix">
						<span class="block input-icon input-icon-right">
							<input type="password" class="form-control" name="passWord" id="password" placeholder="请输入密码">
							<i class="icon-lock"></i>
						</span>
						<span id="password-tips" class="tip-wrap white"></span>
					</label>
					<label class="block clearfix">
						<span class="block input-icon input-icon-right">
							<input type="password" class="form-control" name="userVo.userPassword" id="password-again" placeholder="请再次输入密码">
							<i class="icon-lock"></i>
						</span>
						<span id="password-again-tips" class="tip-wrap white"></span>
					</label>
					<div class="clearfix">
						<button id="reset-password-btn" type="button" class="width-40 pull-left btn btn-sm btn-primary">
							<i class="icon-ok"></i>
							保 存
						</button>
						<button id="back_1" class="width-40 pull-right btn btn-sm btn-primary" type="button">
							返回
							<i class="icon-arrow-right icon-on-right"></i>
						</button>
					</div>
				</form>
			</div>
		</div>
	</section>
	
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
	<script src="<%=contextPath %>/common/js/verification.js"></script>
	<script >
		$(function(){
			$("#back_1").click(function(){
				history.go(-1);
			});
		});
	</script>
</body>
</html>
