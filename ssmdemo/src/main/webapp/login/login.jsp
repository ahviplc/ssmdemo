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
	<title>登录 - ssm-demo</title>
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
			
			<!-- 登录部分 Begin -->
			<div id="login-content" class="content-box">
				<h2 class="white subtitle">法律诊所数字化教学系统</h2>
				<h4 class="header lighter white"><i class="icon-user"></i>登录</h4>
				<form name="login" action="<%=contextPath %>/login/loginIn.action" method="post" id="login-form">
				<input type="hidden" id="manual" name="manual" value="0"/>
					<%
						 String username_ = "";
						 Cookie c[]=request.getCookies();
						 if(c!=null)
						 {
						 for(int x=0;x<c.length;x++)
						 	{
							 if(c[x].getName().equals("_userAccount"))
								 {
									 //在cookie值保存时如果编码了，取cookie时就需要进行解码。
									//将cookie值取出来后，赋值给变量，用以之后的显示
									username_ = URLDecoder.decode(c[x].getValue(),"UTF-8"); 
								 }
							 } 
						 }
						 %>
					
					<fieldset>
						<label class="block clearfix">
							<span class="block input-icon input-icon-right">
								<input type="text" cookieSensitive="true" class="form-control" name="userAccount" value="<%=username_ %>" placeholder="账号" id="userId">
								<i class="icon-user"></i>
							</span>
							<span id="user-name-tips" class="tip-wrap white"></span>
						</label>
						<label class="block clearfix">
							<span class="block input-icon input-icon-right">
								<input type="password" cookieSensitive="true" class="form-control" name="passWord" value="<c:out value="${cookie._passWord.value}"/>" placeholder="密码" id="password">
								<i class="icon-lock"></i>
							</span>
							<span id="password-tips" class="tip-wrap white"></span>
						</label>
						<!-- <label class="block clearfix">
							<select name="type" cookieSensitive="true" class="width-100" id="role">
								<option value="">角色选择</option>
								<option <c:if test="${cookie._type.value=='S'}"> selected="selected"</c:if>value="S">学生</option>
								<option <c:if test="${cookie._type.value=='T'}"> selected="selected"</c:if> value="T">教师</option>
								<option <c:if test="${cookie._type.value=='A'}"> selected="selected"</c:if> value="A">管理员</option>
							</select>
							<span id="role-tips" class="tip-wrap white"></span>
						</label> -->
						<div class="clearfix">
							<label class="inline">
								<input type="checkbox" class="ace" name="checkflag" value="1"<c:if test="${!empty cookie._userAccount.value }"> checked="checked"</c:if>/>
								<span class="lbl"> 记住密码</span>
							</label>
							<button id="login-btn" class="width-35 pull-right btn btn-sm btn-primary" type="button"><i class="icon-key"></i>登录</button>
						</div>
					</fieldset>
				</form>
				<div class="toolbar clearfix">
					<a class="forgot-password-link pull-left" href="#" onclick="show_box('forgot-box'); return false;">
						<i class="icon-arrow-left"></i>
						忘记密码
					</a>
					<a class="user-signup-link pull-right" href="#" onclick="show_box('signup-box'); return false;">
						注册
						<i class="icon-arrow-right"></i>
					</a>
				</div>
			</div>
			<!-- 登录部分 End -->
			
			<!-- 密码找回 Begin -->
			<div id="forgot-box" class="content-box none">
				<h2 class="white subtitle">法律诊所数字化教学系统</h2>
				<h4 class="header lighter white"><i class="icon-key"></i>密码找回</h4>
				<form id="form-velidate-message" action="<%=contextPath %>/login/velidateMessage.action" method="post">
					<fieldset>
						<label class="block clearfix">
							<span class="block input-icon input-icon-right">
								<input type="tel" id="phone" class="form-control" name="userVo.userPhone" placeholder="手机号">
								<i class="icon-phone"></i>
							</span>
							<span id="tel-tips" class="tip-wrap white"></span>
						</label>
						<div class="clearfix" id="send_1">
							<input type="text" id="ver-code" name="verCode" class="form-control width-45 pull-left" placeholder="填写验证码" />
							<input type="button" class="width-50 pull-right btn btn-sm btn-info"  id="btn" value="获取验证码" onclick="settime(this)" /> 
							<span id="code-tips" class="tip-wrap white"></span>
						</div>
						<div class="clearfix">
							<button class="width-100 pull-center btn btn-sm btn-info" type="button" id="velidate-message-btn">
								<i class="icon-lightbulb"></i>
								确认
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
			<!-- 密码找回 End -->
			
			<!-- 注册 Begin -->
			<div id="signup-box" class="content-box none">
				<h2 class="white subtitle">法律诊所数字化教学系统</h2>
				<h4 class="header lighter white"><i class="icon-group"></i>注册</h4>
				<form id="register-from" action="<%=contextPath %>/login/registration.action" method="post">
					<fieldset>
						<label class="block clearfix">
							<span class="block input-icon input-icon-right">
								<input class="form-control" name="userVo.userPhone" placeholder="手机号" id="user-phone"/>
								<i class="icon-phone"></i>
							</span>
							<span id="user-phone-tips" class="tip-wrap white"></span>
						</label>
						<label class="block clearfix">
							<span class="block input-icon input-icon-right">
								<input type="password" class="form-control" name="userVo.userPassword" placeholder="密码" id="user-password" />
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
						<s:hidden name="userVo.userType" value="S"></s:hidden>
						<!-- <label class="block clearfix">
							<select name="userVo.userType" class="width-100" id="user-type">
								<option value="">角色选择</option>
								<option value="S">学生</option>
								<option value="T">教师</option>
							</select>
							<span id="user-type-tips" class="tip-wrap white"></span>
						</label> -->
						<s:token/>
						<div class="clearfix">
							<button type="reset" class="width-30 pull-left btn btn-sm btn-primary">
								<i class="icon-refresh"></i>
								重置
							</button>
							<button id="register-btn" class="width-65 pull-right btn btn-sm btn-primary" type="button">
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
	$(function(){
		$('#login-form').on('change','[cookieSensitive]',function(){
			$('#manual').val('1');
		});
	});
	</script>
</body>
</html>
