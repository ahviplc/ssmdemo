<%@page contentType="text/html; charset=utf-8" language="java"%>
<%@include file="../../../common/common.jsp"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="utf-8" />
	<title>ssm-demo</title>
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
	<style>
		.radio{float: left; width: 70px;}
	</style>
</head>
<body class="overflow-body">
	<div class="main-content padding-bottom100">
	
		<div class="page-content">
			<p class="signup_title">修改管理员登陆密码${msg}</p>
			<form class="form-horizontal width600 margin-top30"  id="form-modifyPassword" action="<%=contextPath %>/aupdatePassword.action" method="post">
				<input type="hidden" name="id" value="${admin.admid}">
				<div class="form-group margin0">
					<label class="common-label width90"> 原密码： </label>
					<div class="common-input width190">
					<input id="oldpassword" type="text" maxlength="20" name="oldpassword"  class="width-100 height35"/>
					</div>
					<label class="common-label width90"> 新密码： </label>
					<div class="common-input width190">
						<input id="admpwd" type="text" maxlength="20" name="admpwd"  class="width-100 height35"/>
					</div>
					<p class="tip-wrap common-tips width190 margin-left100"><span id="oldpassword-tips"></span></p>
					<p class="tip-wrap common-tips width190 margin-left100"><span id="newpassword-tips"></span></p>
				</div>
				
				<div class="form-group margin0">
					<label class="common-label width90"> 确认密码： </label>
					<div class="common-input width190">
						<input id="password2" type="password" name="password2"  class="width-100 height35" />
					</div>
					<p class="tip-wrap common-tips width190 margin-left100"><span id="password2-tips"></span></p>
				</div>
				<div class="width-100 margin-top30 txt-center">
					<button class="btn btn-info" type="submit" id="modifyPassword-btn">
						<i class="icon-ok bigger-110"></i>
						保 存
					</button>
					<button class="btn btn-info" type="button" id="back_1">
						<i class="icon-undo bigger-110"></i>
						<a href="<%=contextPath %>/adminIndex.action">返回</a>
					</button>
					
				</div>
				
			</form>
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
	<script src="<%=contextPath %>/common/My97DatePicker/WdatePicker.js"></script>
	<script src="<%=contextPath %>/common/js/verification.js"></script>			
	<script>
		$(function(){
			$("#back_1").click(function(){
				window.location.href="javascript:history.go(-1);";
			});
		});
	</script>
</body>
</html>
