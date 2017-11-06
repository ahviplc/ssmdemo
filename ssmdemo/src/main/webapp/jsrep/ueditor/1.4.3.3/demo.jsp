<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html>
<head>
<%
	String contextPath = request.getContextPath() ;
%>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>示例代码</title>
<script type="text/javascript" charset="utf-8" src="<%=contextPath%>/jsrep/jquery/jquery-1.8.3.js"></script>
<script type="text/javascript" charset="utf-8" src="<%=contextPath%>/jsrep/ueditor/1.4.3.3/ueditor.config.js"></script>
<script type="text/javascript" charset="utf-8" src="<%=contextPath%>/jsrep/ueditor/1.4.3.3/sinotn/wenshu_api.js"></script>
<!--添加按钮-->
<script type="text/javascript" charset="utf-8" src="<%=contextPath%>/jsrep/ueditor/1.4.3.3/sinotn/endorse.js"></script>
</head>
<body>
 <h1>UEditor简单功能</h1>

    <!--style给定宽度可以影响编辑器的最终宽度-->
    <script type="text/plain" id="myEditor">
        <p>这里我可以写一些输入提示</p>
    </script>
    <script type="text/javascript">
	UE.getEditor('myEditor',{
        //清空了工具栏
        toolbars:[['FullScreen']]
		//关闭字数统计
        ,wordCount:false
            //关闭elementPath
        ,elementPathEnabled:false
        ,serverUrl:'<%=contextPath%>/ueditor/timestamp.action'
        ,enableAutoSave:false
    });
    </script>
</body>
</html>