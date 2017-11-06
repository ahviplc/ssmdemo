<%@page contentType="text/html; charset=utf-8" language="java"%>
<%@include file="../../../common/common.jsp"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="utf-8" />
	<title>公告信息管理 - ssm-demo</title>
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
	        window.location.href="<%=contextPath %>/listReply.action?pageNum=" + pageNum + "&pageSize="+ pageSize;
	    }
	</script>
</head>
<body class="overflow-body">
	<div class="main-content padding-bottom100">
			<div class="breadcrumbs" id="breadcrumbs">
			<ul class="breadcrumb">
				<li><a href="javascript: top.indexlink();" target="_self"><i class="icon-home home-icon"></i>首页</a></li>
				<li><a href="listReply.action">评论信息管理</a></li>
				<li class="action">评论列表</li>
			</ul>
		</div>
		
		<div class="page-content">
		<form class="form-horizontal" method="post"> 							
				<!-- <div class="form-group">
					<button type="button" class="btn btn-sm btn-info" id="chuangjian"><i class="icon-ok bigger-110"></i>创建</button>
				</div> -->
			</form>
			<div class="table-responsive">
				<table class="table table-striped table-bordered table-hover no-border-top">
					<thead>
						<tr>
							<th>评论课程ID</th>
							<th>公告内容</th>
							<th>评论人ID（学生）</th> 
							<th>评论时间</th>
							<th>操作</th>
						</tr>
					</thead>
					
					<tbody>
					<c:forEach items="${pagehelper.list}" var="reply">
						<tr>
							<td><a href="">${reply.replyid}</a></td>
							<td><a href="">${reply.content}</a></td>
							<td><a href="">${reply.stuid}</a></td>
							<td><a href="">${reply.replytime}</a></td>
							
							
						<%-- 	<c:choose>
					           <c:when test="${reply.replyid==1 }">
					              <td><a href="#" >管理员</a></td>
					            </c:when>
					         <c:otherwise>
					         <td><a href="#" >${reply.replyid}</a></td>
					         
					         </c:otherwise>
					        </c:choose> --%>
							
							
							
							<%-- <td><fmt:formatDate value="${sategory.cdate}" pattern="yyyy-MM-dd HH:mm:ss"/></td> --%>
							
							<td>
								<div class="action-buttons">
								<%-- 	<a class="blue" href="toModifyReply.action?replyid=${reply.replyid}">
										<i class="icon-pencil blue"></i>修改
									</a> --%>
									<a class="blue" href="javascript:void(0)"  onclick="delReply('${reply.replyid}')">
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
				window.location.href="toAddReply.action";
			});
		});
		function delReply(replyid){
		    layer.confirm('确认删除？', {
			  btn: ['确认','取消'] //按钮
			}, function(index, layero){
			  window.location.href="delReply.action?replyid="+replyid;
			});
		}
	</script>
</body>
</html>
