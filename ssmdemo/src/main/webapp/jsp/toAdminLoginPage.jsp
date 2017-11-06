<%@page contentType="text/html; charset=utf-8" language="java" pageEncoding="UTF-8"%>
<%@include file="../../../common/common.jsp"%>
<%@page import="java.net.URLDecoder"%>
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
	<title>ssm-demo-管理员登录</title>
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
<body class="login-body" style="background-color:#90EE90">
	<section class="main clearfix login">
		<div class="wrap-inputs">
			<div class="logo"></div>
			
			<!-- 登录部分 Begin -->
			<div id="login-content" class="content-box">
				<h2 class="white subtitle" style="color:black;">ssm-demo</h2>
				<h4 class="header lighter white"><i class="icon-user"></i>管理员登录<font color="red">${msg}</font>
				                 <font style="font-family: 楷体;font-size:large;" color="white">${regSuMsg}</font>
				</h4>
				<form name="alogin" action="<%=contextPath %>/alogin.action" method="post" id="login-form">
				
	
					
					<fieldset>
						<label class="block clearfix">
							<span class="block input-icon input-icon-right">
								<input type="text"  class="form-control" name="admusername" required="required" placeholder="管理员账号" id="admusername">
								<i class="icon-user"></i>
							</span>
							<span id="user-name-tips" class="tip-wrap white"></span>
						</label>
						<label class="block clearfix">
							<span class="block input-icon input-icon-right">
								<input type="password"  class="form-control" name="admpwd" required="required"  placeholder="管理员密码" id="admpwd">
								<i class="icon-lock"></i>
							</span>
							<span id="password-tips" class="tip-wrap white"></span>
						</label>
						
						<div class="clearfix">
							<label class="inline">
							</label>
							<button id="login-btn" class="width-100 pull-right btn btn-sm btn-primary" type="submit"><i class="icon-key"></i>登录</button>
						</div>
					</fieldset>
				</form>
				<!-- 注册隐藏 -->
			 <div class="toolbar clearfix">
					<a class="forgot-password-link pull-left" href="#" onclick="show_box('forgot-box'); return false;">
					</a>
				<!-- 	<a class="user-signup-link pull-right" href="#" onclick="show_box('signup-box'); return false;">
						教师登录
						<i class="icon-arrow-right"></i>
					</a> -->
						 
					<a class="user-signup-link pull-right" href="#"  return false;">
						<a href="<%=contextPath %>/toBackLoginStu.action">学生登录</a>
					
						<i class="icon-arrow-left"></i>
						
					</a>
					&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp	&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp
					&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp	&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp
					&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp
					<a class="user-signup-link pull-right" href="#"  return false;">
						<a href="<%=contextPath %>/toBackLoginTea.action">教师登录</a>
					
						<i class="icon-arrow-right"></i>
					</a> 
					
					 
				</div>
			</div> 
			<!-- 登录部分 End -->
			
			
			<!-- 注册 Begin -->
			<div id="signup-box" class="content-box none">
				<h2 class="white subtitle">ssm-demo</h2>
				<h4 class="header lighter white"><i class="icon-group"></i>注册</h4>
			
				<form id="register-from" action="<%=contextPath %>/addAdmin.action" method="post">
					<fieldset>
						<label class="block clearfix">
							<span class="block input-icon input-icon-right">
								<input class="form-control" name="admusername" required="required" placeholder="管理员用户名" id="admusername"/>
								<i class="icon-username"></i>
							</span>
							<span id="user-emial-tips" class="tip-wrap white"></span>
						</label>
						
					
						
						<label class="block clearfix">
							<span class="block input-icon input-icon-right">
								<input type="password" class="form-control" required="required" name="admpwd" placeholder="管理员密码" id="admpwd" />
								<i class="icon-lock"></i>
							</span>
							<span id="user-password-tips" class="tip-wrap white"></span>
						</label>
						<label class="block clearfix">
							<span class="block input-icon input-icon-right">
								<input type="password" class="form-control" name="password2" placeholder="密码确认" id="password2"/>
								<i class="icon-lock"></i>
							</span>
							<span id="password2-tips" class="tip-wrap white"></span>
						</label>
						<s:token/>
						<div class="clearfix">
							<button type="reset" class="width-30 pull-left btn btn-sm btn-primary">
								<i class="icon-refresh"></i>
								重置
							</button>
							<button id="register-btn" class="width-65 pull-right btn btn-sm btn-primary" type="submit">
								注册
								<i class="icon-arrow-right icon-on-right"></i>
							</button>
						</div>
					</fieldset>
				</form>
				<div class="toolbar center">
					<a href="#" onclick="show_box('login-content'); return false;" class="back-to-login-link">
						<i class="icon-arrow-left"></i>
						返回登陆
					</a>
				</div>
			</div>
			<!-- 注册 End -->
		</div>
	</section>
	<!--[if IE]>
	<script type="text/javascript">
	 window.jQuery || document.write("<script src='<%=contextPath %>/common/js/jquery-1.10.2.min.js'>"+"<"+"/script>");
	</script>513538
	<![endif]-->
	<!--[if !IE]> -->
	<script type="text/javascript">
		 window.jQuery || document.write("<script src='<%=contextPath %>/common/js/jquery-2.0.3.min.js'>"+"<"+"/script>");
	</script>
	<!-- <![endif]-->
	<script src="<%=contextPath %>/common/js/bootstrap.min.js"></script>
	<script src="<%=contextPath %>/common/js/verification.js"></script>
	<script type="text/javascript">
	function reRandom(o){
		o.src="<%=contextPath %>/authcodeController/loginCode.action?random="+Math.random();
	}
	
	$(function(){
		$('#login-form').on('change','[cookieSensitive]',function(){
			$('#manual').val('1');
		});
	});
	</script>
</body>
</html>
