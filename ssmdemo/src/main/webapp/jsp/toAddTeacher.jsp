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
		<div class="breadcrumbs" id="breadcrumbs">
			<ul class="breadcrumb">
				<li><a href="javascript: top.indexlink();" target="_self"><i class="icon-home home-icon"></i>首页</a></li>
				<li><a href="listTeacher.action">教师信息管理</a></li>
				<li class="action">添加</li>
			</ul>
		</div>
		<div class="page-content">
			<p class="signup_title">教师添加</p>
			<form class="form-horizontal width600 margin-top30"  id="form-modifyteacher" action="<%=contextPath %>/addTeacher.action" method="post">
				<div class="form-group margin0">
					<label class="common-label width90"> 教师用户名： </label>
					<div class="common-input width300">
					<input id="tchloginname" type="text" required="required" maxlength="20" placeholder="请输入用户名" name="tchloginname"  class="width-100 height35"/>
					</div>
					<p class="tip-wrap common-tips margin-left100"><span id="tchloginname-tips"></span></p>
				</div>
				
				<div class="form-group margin0">
					<label class="common-label width90">教师姓名：</label>
					<div class="common-input width300">
					<input id="tchname" type="text" required="required" maxlength="12" placeholder="请输入姓名" name="tchname"  class="width-100 height35"/>
					</div>
					<p class="tip-wrap common-tips margin-left100"><span id="tchname-tips"></span></p>
				</div>
				
				<div class="form-group margin0">
					<label class="common-label width90">教师密码：</label>
					<div class="common-input width300">
					<input id="tchpwd" type="password" required="required" maxlength="20" name="tchpwd"  placeholder="请输入登陆密码" class="width-100 height35"/>
					</div>
					<p class="tip-wrap common-tips margin-left100"><span id="tchpwd-tips"></span></p>
				</div>
					
				<div class="width-100 margin-top30 txt-center">
					<button class="btn btn-info" type="submit" id="modifyteacher-btn">
						<i class="icon-ok bigger-110"></i>
						保 存
					</button>
					<button class="btn btn-info" type="button" id="back_1">
						<i class="icon-undo bigger-110"></i>
						返  回
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
