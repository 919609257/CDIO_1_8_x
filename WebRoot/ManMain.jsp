<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'ManMain.jsp' starting page</title>
    <script type="text/javascript">
    function printAll(){
         var x=document.getElementById("mySelect");
         
    }
    </script>
  </head>
  
  <body >
    <h3>欢迎登入管理员界面</h3> <br>
    
    <form action="">
    <select name="managerInfo"  id="myselect">
    <option value="" selected="selected">信息管理</option>
    <option value="infoModify">用户管理</option>
    <option value="pwdModify">密码修改</option> 
    </select>
    <select name="userManagement" id="myselect1">
    <option value="" selected="selected">用户管理</option>
    <option value="adduser">增加用户</option>
    <option value="deluser">删除用户</option> 
    <option value="pwdreset">密码重置</option> 
    </select>   
    </form>
  



  </body>
</html>
