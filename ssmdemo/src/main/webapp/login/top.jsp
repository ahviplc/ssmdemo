<%@page contentType="text/html; charset=utf-8" language="java"%>
<%@include file="../../../common/common.jsp"%>
<!DOCTYPE html>
<html>
<head>
 	<meta charset="utf-8" />
 	<meta http-equiv="Content-Type" content="tex/html;charset=UTF-8">
	<link href="<%=contextPath %>/common/images/zfdx.ico" rel="shortcut icon" type="image/x-icon" media="screen">
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
	<script src="<%=contextPath %>/jsrep/jquery/sinotn/sso.js"></script>
	<style>
		body{overflow-y: hidden; margin: 0; padding: 0; height: 45px;}
	</style>
 </head>
<body>
	<section class="navbar navbar-default" id="navbar">
		<div class="pull-left">
			<a id="index-logo" href="javascript:redirectUrl('../adminIndex.action')" title="首页" >
				<i class="icon-legal"></i>
				ssm-demo
			 </a>
		</div>
			<a href="#" title="登录" onclick="redirectUrl('../toAdminLoginPage.action');">1<i class="icon-on"></i>登录去</a>
		<div class="pull-right margin-right20">
		<!-- 管理员 -->
		<c:if test="${sessionScope.admin.admusername!=null}">
		
			<ul class="nav ace-nav">
				<li class="light-blue">
			 <a href="#" onclick="redirectUrl('../jsp/toModifyPassword.jsp');" title="用户信息" target="content"><i class="icon-user"></i>${sessionScope.admin.admusername}</a>
					
			 <c:choose>
			 <c:when test="${sessionScope.admin.admusername!=null}">
			    
				<a href="#" title="退出" onclick="redirectUrl('../alogout.action');"><i class="icon-off"></i>退出</a>
			 </c:when>
			 <c:otherwise>
			 <a href="#" title="登陆" onclick="redirectUrl('../toAdminLoginPage.action');"><i class="icon-off"></i>登陆</a>
			 </c:otherwise>
			 </c:choose>
				</li>
			</ul>
		</c:if>
		<!-- 教师 -->
		<c:if test="${sessionScope.teacher.tchloginname!=null}">
		
			<ul class="nav ace-nav">
				<li class="light-blue">
				<!--href="#" onclick="redirectUrl('#');" title="教师信息" target="content"  -->
			 <a ><i class="icon-user"></i>${sessionScope.teacher.tchname}</a>
					
			 <c:choose>
			 <c:when test="${sessionScope.teacher.tchloginname!=null}">
			    
				<a href="#" title="退出" onclick="redirectUrl('../tlogout.action');"><i class="icon-off"></i>退出</a>
			 </c:when>
			 <c:otherwise>
			 <a href="#" title="登陆" onclick="redirectUrl('../toAdminLoginPage.action');"><i class="icon-off"></i>登陆</a>
			 </c:otherwise>
			 </c:choose>
				</li>
			</ul>
		</c:if>
		<!-- 学生 -->
		<c:if test="${sessionScope.student.stuloginname!=null}">
		
			<ul class="nav ace-nav">
				<li class="light-blue">
				<!--href="#" onclick="redirectUrl('../jsp/toModifyPassword.jsp');" title="用户信息" target="content"-->
			 <a><i class="icon-user"></i>${sessionScope.student.stuname}</a>
					
			 <c:choose>
			 <c:when test="${sessionScope.student.stuloginname!=null}">
			    
				<a href="#" title="退出" onclick="redirectUrl('../slogout.action');"><i class="icon-off"></i>退出</a>
			 </c:when>
			 <c:otherwise>
			 <a href="#" title="登陆" onclick="redirectUrl('../toAdminLoginPage.action');"><i class="icon-off"></i>登陆</a>
			 </c:otherwise>
			 </c:choose>
				</li>
			</ul>
		</c:if>
		
			
		
			
		</div>
	</section>
  
	<script>
		// 重定向网址
		function redirectUrl(url){
			window.parent.location.href = url;
		}
		$(function(){
			$.sso.init({serverCtx:'<%=contextPath %>',userId:'<s:property value="#session.userVo.id"/>'});
		});
		
		
		// 定义一个API对象
		var ApiHandle={
			// 更新头部信息方法
			message:function(){
				$.ajax({
					url : "toCheckMessageList.action",
					async : true,
					success:function(data){
						if(data.state == 0){
							$("#message").text(data.size);
						}
					},
					error:function(){
						alert("异常！");
					}
				});
			}
		};
		
		// api接口方法
		function api(method){
			if(ApiHandle[method]){
				ApiHandle[method]();
			}
		}
	</script>
  </body>
</html>
