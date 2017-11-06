<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@include file="../../../common/common.jsp"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="utf-8" />
	<link rel="stylesheet" href="<%=contextPath %>/common/css/bootstrap.min.css" />
	<link rel="stylesheet" href="<%=contextPath %>/common/css/font-awesome.min.css" />
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
	<style>
		html,body{overflow: hidden; margin: 0; padding: 0; height: 100%;}
	</style>
</head>
<body>
<div class="sidebar" id="sidebar">
               
					   <ul class="nav nav-list">
					    <c:if test="${sessionScope.admin.admusername!=null}">
						<li>
							<a href="<%=contextPath %>/adminIndex.action">
								<i class="icon-dashboard"></i>
								<span class="menu-text">管理员首页 </span>
							</a>
						</li>
						
									<li>
							<a href="<%=contextPath %>/listStudent.action" target="content">
								<i class="icon-text-width"></i>
								<span class="menu-text">学生信息管理</span>
							</a>
						</li>
						<!-- 	<li class="active"> -->
						<li >
							<a href="<%=contextPath %>/listTeacher.action" target="content">
								<i class="icon-headphones"></i>
								<span class="menu-text">教师信息管理</span>
							</a>
						</li>
						<li>
							<a href="<%=contextPath %>/listNotice.action" target="content">
								<i class="icon-group"></i>
								<span class="menu-text">公告管理</span>
							</a>
						</li>
						<li>
							<a href="<%=contextPath %>/listReply.action" target="content">
								<i class=" icon-circle"></i>
								<span class="menu-text">评论管理</span>
							</a>
						</li>
						<li>
							<a href="<%=contextPath %>/listCourse.action" target="content">
								<i class=" icon-bell-alt"></i>
								<span class="menu-text">课程管理</span>
							</a>
						</li>
						<li>
							<a href="<%=contextPath %>/listAdmin.action" target="content">
								<i class="icon-building"></i>
								<span class="menu-text">管理员信息管理</span>
							</a>
						</li>
			</c:if>	
			
			
			<!--  教师登录 session menu 列表-->
			
			  <c:if test="${sessionScope.teacher.tchloginname!=null}">
						<li>
							<a href="<%=contextPath %>/adminIndex.action">
								<i class="icon-dashboard"></i>
								<span class="menu-text">教师首页 </span>
							</a>
						</li>
	
	                 <li>
							<a href="<%=contextPath %>/listStudent.action" target="content">
								<i class="icon-text-width"></i>
								<span class="menu-text">学生信息管理</span>
							</a>
						</li>
						<li >
							<a href="<%=contextPath %>/listTeacher.action" target="content">
								<i class="icon-headphones"></i>
								<span class="menu-text">教师信息管理</span>
							</a>
						</li>
						
						<li>
							<a href="<%=contextPath %>/listAdmin.action" target="content">
								<i class="icon-building"></i>
								<span class="menu-text">管理员信息管理</span>
							</a>
						</li>
						
			</c:if>			
			
			
			
			<!--  学生登录 session menu 列表-->
			
			  <c:if test="${sessionScope.student.stuloginname!=null}">
						<li>
							<a href="<%=contextPath %>/adminIndex.action">
								<i class="icon-dashboard"></i>
								<span class="menu-text">学生首页 </span>
							</a>
						</li>
	                 <li>
							<a href="<%=contextPath %>/listStudent.action" target="content">
								<i class="icon-text-width"></i>
								<span class="menu-text">学生信息管理</span>
							</a>
						</li>
						<li >
							<a href="<%=contextPath %>/listTeacher.action" target="content">
								<i class="icon-headphones"></i>
								<span class="menu-text">教师信息管理</span>
							</a>
						</li>
						<li>
							<a href="<%=contextPath %>/listAdmin.action" target="content">
								<i class="icon-building"></i>
								<span class="menu-text">管理员信息管理</span>
							</a>
						</li>
			</c:if>	
			
	
		
					</ul><!-- /.nav-list -->
					
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
	<script src="<%=contextPath %>/common/js/ace.min.js"></script>
	
	<script>
		// 重定向网址
		function redirectUrl(url){
			window.parent.location.href = url;
		}
		
		$(".first-li").click(function(){
			if(!($(this).children().hasClass("dropdown-toggle"))){
				$(this).addClass("active").siblings().removeClass("active");
			}
		});
	 	$(".submenu li").click(function(){
	 		$(".first-li").removeClass("active");
	 		$(this).addClass("active").siblings().removeClass("active");
		});
	</script>

</body>
</html>