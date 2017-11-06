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
	
	
	<script type="text/javascript">
	 function queryAllUser(pageNum, pageSize) {
		<%--  $(".table-responsive").load("<%=contextPath %>/listUser.action?pageNum=" + pageNum + "&pageSize=" + pageSize); --%>
	        window.location.href="<%=contextPath %>/listCourse.action?pageNum=" + pageNum + "&pageSize="+ pageSize;
	    }
	</script>
</head>
<body class="overflow-body">
	<div class="main-content padding-bottom100">
			<div class="breadcrumbs" id="breadcrumbs">
			<ul class="breadcrumb">
				<li><a href="javascript: top.indexlink();" target="_self"><i class="icon-home home-icon"></i>首页</a></li>
				<li><a href="listCourse.action">课程资源管理</a></li>
				<li class="action">课程资源列表</li>
			</ul>
		</div>
		
		<div class="page-content">
		<form class="form-horizontal" method="post"> 							
				<div class="form-group">
					<button type="button" class="btn btn-sm btn-info" id="chuangjian"><i class="icon-ok bigger-110"></i>创建</button>
				</div>
			</form>
			<div class="table-responsive">
				<table class="table table-striped table-bordered table-hover no-border-top">
					<thead>
						<tr>
							<th>课程标题名称</th>
							
							<th>创建时间</th> 
							<th>课程url</th>
							<th>课程类型</th>
							<th>课程描述</th>
							<th>操作</th>
						</tr>
					</thead>
					<tbody>
					<c:forEach items="${pagehelper.list}" var="course">
						<tr>
							<td><a href="">${course.crstopic}</a></td>
							
							<td><a href="">${course.crstime}</a></td>
							<td><a href="<%=contextPath %>/${course.crsurl}">${course.crsurl}</a></td>
							
							
							<c:choose>
					           <c:when test="${course.type==1 }">
					              <td><a href="">视频课程</a></td>
					            </c:when>
					            <c:otherwise>
						            <td><a href="">文档课程</a></td>
						        </c:otherwise>
					        </c:choose>
							
							<td><a href="">${course.crsdescribe}</a></td>
							<%-- <td><fmt:formatDate value="${sategory.cdate}" pattern="yyyy-MM-dd HH:mm:ss"/></td> --%>
							
							<td>
								<div class="action-buttons">
									<a class="blue" href="toModifyCourse.action?crseid=${course.crseid}">
										<i class="icon-pencil blue"></i>修改
									</a>
									<a class="blue" href="javascript:void(0)"  onclick="delCourse('${course.crseid}')">
										<i class="icon-trash blue"></i>删除
									</a>
								</div>
							</td>
						</tr>
						</c:forEach>
					</tbody>
				</table>
				
				   <div id="page_div">
				   <jsp:include page="../jsp/pagehelper.jsp"/><!--动态包含--> 
                    </div>
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
	<script src="<%=contextPath %>/layer/layer.js"></script>
	<script>
		$(function(){
			$("#chuangjian").click(function(){
				window.location.href="toAddCourse.action";
			});
		});
		function delCourse(crseid){
		    layer.confirm('确认删除？', {
			  btn: ['确认','取消'] //按钮
			}, function(index, layero){
			  window.location.href="delCourse.action?crseid="+crseid;
			});
		}
	</script>
</body>
</html>
