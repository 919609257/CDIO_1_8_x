<%@ page language="java" import="java.util.*" pageEncoding="Utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'ManagerInfo.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
  
  <body>
  <form method="post" name="managerInfo" action="saveManagerInfo">
    <div><span>工号：</span>
    <input type="text" name="MId">
    </div>
    <div><span>姓名：</span>
    <input type="text" name="MName">
    </div>
    <div><span>性别：</span>
    <input type="text" name="MSex">
    </div>
    <div><span>政治面貌：</span>
    <input type="text" name="MPC">
    </div>
    <div><span>籍贯：</span>
    <input type="text" name="MNP">
    </div>
    <div><span>民族：</span>
    <input type="text" name="MNation">
    </div>
    <div><span>出生日期：</span>
    <input type="text" name="MBD">
    </div>
    <div><span>身份证号码：</span>
    <input type="text" name="MICN">
    </div>
    <div><span>家庭地址：</span>
    <input type="text" name="MBP">
    </div>
    <div><span>电话号码：</span>
    <input type="text" name="MTel">
    </div>
    <div>
    <input type="image" name="MImage">
    <p>照片</p>
    </div>
    </form>
  </body>
</html>
