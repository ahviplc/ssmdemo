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
				<li><a href="listStudent.action">学生管理</a></li>
				<li class="action">添加</li>
			</ul>
		</div>
		<div class="page-content">
			<p class="signup_title">学生添加</p>
			<form class="form-horizontal width600 margin-top30"  id="form-modifystudent" action="<%=contextPath %>/addStudent.action" method="post">
				<div class="form-group margin0">
					<label class="common-label width90"> 学生用户名： </label>
					<div class="common-input width300">
					<input id="stuloginname" type="text" required="required" maxlength="20" placeholder="请输入学生用户名" name="stuloginname"  class="width-100 height35"/>
					</div>
					<p class="tip-wrap common-tips margin-left100"><span id="stuloginname-tips"></span></p>
				</div>
				
				<div class="form-group margin0">
					<label class="common-label width90">学生姓名：</label>
					<div class="common-input width300">
					<input id="stuname" type="text" required="required" maxlength="12" placeholder="请输入学生姓名" name="stuname"  class="width-100 height35"/>
					</div>
					<p class="tip-wrap common-tips margin-left100"><span id="stuname-tips"></span></p>
				</div>
				<div class="form-group margin0">
					<label class="common-label width90"> 学生学号： </label>
					<div class="common-input width300">
					<input id="stunumber" type="text" required="required" maxlength="20" placeholder="请输入学生学号" name="stunumber"  class="width-100 height35"/>
					</div>
					<p class="tip-wrap common-tips margin-left100"><span id="stuloginname-tips"></span></p>
				</div>
				
				<div class="form-group margin0">
					<label class="common-label width90">学生手机号：</label>
					<div class="common-input width300">
					<input id="stuphone" type="text" required="required" maxlength="12" placeholder="请输入学生手机号" name="stuphone"  class="width-100 height35"/>
					</div>
					<p class="tip-wrap common-tips margin-left100"><span id="stuname-tips"></span></p>
				</div>
				<div class="form-group margin0">
					<label class="common-label width90"> 学生QQ号： </label>
					<div class="common-input width300">
					<input id="stuqq" type="text" required="required" maxlength="20" placeholder="请输入学生QQ号" name="stuqq"  class="width-100 height35"/>
					</div>
					<p class="tip-wrap common-tips margin-left100"><span id="stuloginname-tips"></span></p>
				</div>
				
				<div class="form-group margin0">
					<label class="common-label width90">学生专业方向：</label>
					<div class="common-input width300">
					<input id="stumajor" type="text" required="required" maxlength="12" placeholder="请输入学生专业方向" name="stumajor"  class="width-100 height35"/>
					</div>
					<p class="tip-wrap common-tips margin-left100"><span id="stuname-tips"></span></p>
				</div>
				
				<div class="form-group margin0">
					<label class="common-label width90">学生登陆密码：</label>
					<div class="common-input width300">
					<input id="stupwd" type="password" required="required" maxlength="20" name="stupwd"  placeholder="请输入学生登陆密码" class="width-100 height35"/>
					</div>
					<p class="tip-wrap common-tips margin-left100"><span id="stupwd-tips"></span></p>
				</div>
					
				<div class="width-100 margin-top30 txt-center">
					<button class="btn btn-info" type="submit" id="modifystudent-btn">
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
