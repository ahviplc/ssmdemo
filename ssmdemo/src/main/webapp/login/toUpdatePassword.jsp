<%@page contentType="text/html; charset=utf-8" language="java"%>
<%@include file="../../../common/common.jsp"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="utf-8" />
	<title>报名管理 - 法律诊所数字化教学系统</title>
	<meta http-equiv="Content-Type" content="tex/html;charset=UTF-8">
	<link href="<%=contextPath %>/common/images/zfdx.ico" rel="shortcut icon" type="image/x-icon" media="screen">
	<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
	<meta name="viewport" content="width=device-width, initial-scale=1.0" />
	<link rel="stylesheet" href="<%=contextPath %>/common/css/bootstrap.min.css" />
	<link rel="stylesheet" href="<%=contextPath %>/common/css/font-awesome.min.css" />
	<link rel="stylesheet" href="<%=contextPath %>/common/css/ace.min.css" />
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
	<style>.form-group{margin:0;}</style>
</head>
<body class="overflow-body">
	<div class="main-content padding-bottom100">
		<div class="breadcrumbs" id="breadcrumbs">
			<ul class="breadcrumb">
				<li><a href="javascript: top.indexlink();" target="_self"><i class="icon-home home-icon"></i>首页</a></li>
				<li class="action">密码修改</li>
			</ul>
		</div>
		<div class="page-content">
			<p class="signup_title">密码修改</p>
			<form class="form-horizontal common-width"  action="updatePassword.action" method="post" id="form-updatePassword">
				<s:hidden name="userVo.id"/>
				<div class="form-group margin-bottom22">
					<label class="common-label">账号： </label>
					<div class="common-input">
						<input type="text" value='<s:property value="userVo.userAccount"/>' class="width-100 height35" disabled="disabled" placeholder="账号">
					</div>
				</div>
				<div class="form-group">
					<label class="common-label">原密码： </label>
					<div class="common-input">
						<input type="password" name="password2" id="password2" class="width-100 height35" placeholder="请输入原密码" autofocus>
					</div>
					<p class="tip-wrap common-tips"><span id="password2-tips"></span></p>
				</div>
				<div class="form-group">
					<label class="common-label">新密码： </label>
					<div class="common-input">
						<input type="password" name="userVo.userPassword" id="userPassword" class="width-100 height35" placeholder="请输入新密码" >
					</div>
					<p class="tip-wrap common-tips"><span id="userPassword-tips"></span></p>
				</div>
				<div class="form-group">
					<label class="common-label">再次输入密码： </label>
					<div class="common-input">
						<input type="password" name="passWord" id="password" class="width-100 height35" placeholder="请再次输入新密码" >
					</div>
					<p class="tip-wrap common-tips"><span id="password-tips"></span></p>
				</div>
			</form>
			<div class="width-100 margin-top30 txt-center">
				<button class="btn btn-info margin-right20" type="button" id="updatePassword">
					<i class="icon-ok bigger-110"></i>
					保 存
				</button>
				<button class="btn btn-info" type="button" id="go-back">
					<i class="icon-undo bigger-110"></i>
					返 回
				</button>
			</div>
		</div>
	</div>
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
</body>
</html>
