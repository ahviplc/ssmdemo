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
	
	
	
	<link rel="stylesheet" type="text/css" href="<%=contextPath %>/js/jquery-easyui-v1.5/themes/default/easyui.css">
	<link rel="stylesheet" type="text/css" href="<%=contextPath %>/js/jquery-easyui-v1.5/themes/icon.css">
	<link rel="stylesheet" type="text/css" href="<%=contextPath %>/js/jquery-easyui-v1.5/demo/demo.css">
	<script type="text/javascript" src="<%=contextPath %>/js/jquery-easyui-v1.5/jquery.min.js"></script>
	<script type="text/javascript" src="<%=contextPath %>/js/jquery-easyui-v1.5/jquery.easyui.min.js"></script>
	
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
				<li><a href="listCourse.action">课程资源管理</a></li>
				<li class="action">修改</li>
			</ul>
		</div>
		<div class="page-content">
			<p class="signup_title">课程资源修改</p>
			<form class="form-horizontal width600 margin-top30" enctype="multipart/form-data"  id="form-modifycourse" action="<%=contextPath %>/updateCourse.action" method="post">
				<input type="hidden" name="crseid" value="${course.crseid}">
					<div class="form-group margin0">
					<label class="common-label width90"> 课程标题： </label>
					<div class="common-input width300">
					<input id="crstopic" type="text" required="required" maxlength="20" value="${course.crstopic}" placeholder="请输入课程标题" name="crstopic"  class="width-100 height35"/>
					</div>
					<p class="tip-wrap common-tips margin-left100"><span id="crstopic-tips"></span></p>
				</div>
				
				<div class="form-group margin0">
					<label class="common-label width90">课程url：</label>
					<div class="common-input width300">
					<input id="crsurl" type="file"  value="${course.crsurl}"  maxlength="12" placeholder="请输入课程url" name="file"  class="width-100 height35"/>
					</div>
					<p class="tip-wrap common-tips margin-left100"><span id="crsurl-tips"></span></p>
				</div>
				
				
					<div class="form-group margin0">
					<label class="common-label width90">课程类型：</label>
					<div class="common-input width300">
						
					<select name="type" id="type" class="width-100 height22">   
                           <c:choose>
					           <c:when test="${course.type==1 }">
					             <option selected="selected" value="1">视频课程</option>
					              <option value="2">文档课程</option>      
					            </c:when>
					            <c:otherwise>
                                    <option value="2" selected="selected">文档课程</option>  
                                    <option  value="1">视频课程</option> 
						        </c:otherwise>
					        </c:choose>        
                    </select>  
					</div>
			
					<p class="tip-wrap common-tips margin-left100"><span id="type-tips"></span></p>
				</div>
				
				
				
				
			
			<div class="form-group margin0">
					<label class="common-label width90">创建时间：</label>			
					<div class="easyui-panel form-group margin0" style="width:100%;max-width:450px;padding:30px 60px;">
		<div style="margin-bottom:20px">
			<input  type="datetime"  readonly="readonly" value="${course.crstime}"  name="crstime" id="crstime" style="width:100%;">
	    
		</div>
		                 </div>
					<p class="tip-wrap common-tips margin-left100"><span id="crstime-tips"></span></p>
				</div>

			<div class="form-group margin0">
					<label class="common-label width90">课程描述：</label>
					<div class="common-textarea width210">
						<textarea id="crsdescribe"   maxlength="100" class="width-70" rows="8" placeholder="请输入课程描述" name="crsdescribe">${course.crsdescribe}</textarea>
				
					
					</div>
					<p class="tip-wrap common-tips margin-left100"><span id="crsdescribe-tips"></span></p>
				</div>
					
					
				<div class="width-100 margin-top30 txt-center">
					<button class="btn btn-info" type="submit" id="modifycourse-btn">
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
