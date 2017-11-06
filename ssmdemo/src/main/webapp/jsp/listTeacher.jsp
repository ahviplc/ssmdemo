<%@page contentType="text/html; charset=utf-8" language="java"%>
<%@include file="../../../common/common.jsp"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="utf-8" />
	<title>教师信息管理 - ssm-demo</title>
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
	        window.location.href="<%=contextPath %>/listTeacher.action?pageNum=" + pageNum + "&pageSize="+ pageSize;
	    }
	</script>
</head>
<body class="overflow-body">
	<div class="main-content padding-bottom100">
			<div class="breadcrumbs" id="breadcrumbs">
			<ul class="breadcrumb">
				<li><a href="javascript: top.indexlink();" target="_self"><i class="icon-home home-icon"></i>首页</a></li>
				<li><a href="listTeacher.action">教师信息管理</a></li>
				<li class="action">教师列表</li>
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
							<th>教师姓名</th>
							<th>教师用户名</th>
							<th>教师工号</th>
							<th>教师手机</th>
							<th>教师邮箱</th>
							<th>教师研究方向</th>
							<!-- <th>创建时间</th> -->
							<th>操作</th>
						</tr>
					</thead>
					<tbody>
					<c:forEach items="${pagehelper.list}" var="teacher">
						<tr>
							<td><a href="">${teacher.tchname}</a></td>
							<td><a href="">${teacher.tchloginname}</a></td>
							<td><a href="">${teacher.tchnumber}</a></td>
							<td><a href="">${teacher.tchphone}</a></td>
							<td><a href="">${teacher.tchmail}</a></td>
							<td><a href="">${teacher.tchresearch}</a></td>
							<%-- <td><fmt:formatDate value="${sategory.cdate}" pattern="yyyy-MM-dd HH:mm:ss"/></td> --%>
							
							<td>
								<div class="action-buttons">
									<a class="blue" href="toModifyTeacher.action?tchid=${teacher.tchid}">
										<i class="icon-pencil blue"></i>修改
									</a>
									<a class="blue" href="javascript:void(0)"  onclick="delTeacher('${teacher.tchid}')">
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
				window.location.href="toAddTeacher.action";
			});
		});
		function delTeacher(tchid){
		    layer.confirm('确认删除？', {
			  btn: ['确认','取消'] //按钮
			}, function(index, layero){
			  window.location.href="delTeacher.action?tchid="+tchid;
			});
		}
	</script>
</body>
</html>
