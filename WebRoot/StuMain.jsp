
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN"
 "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<%@ include file="/MyJsp.jsp" %>
<html>
<head>
 <meta http-equiv="Content-type" content="text/html;charset=UTF-8" />
 <style type="text/css">
 *{margin:0; padding: 0;}
 body { background:#444;}
 #navcont { background: #fff; width: 100%;}
 #nav { font-family: helvetica; position:relative; width:377px; height:56px; font-size:14px; color:#999; 
margin: 0 auto; }
 #nav ul { list-style-type:none; }
 #nav ul li { float:left; position: relative;}
 #nav ul li a { border-right:1px solid #e9e9e9; padding:20px; display:block; text-decoration:none; text-align:center; color:#999;}
 #nav ul li ul {display: none;}
 #nav ul li:hover ul {display: block; position: absolute; top:56px; min-width:190px; left:0;} 
 #nav ul li:hover ul li a {display:block; background:#12aeef; color:#ffffff; width: 110px; text-align: 
center; border-bottom: 1px solid #f2f2f2; border-right: none;}
 #nav ul li:hover ul li a:hover { background:#6dc7ec; color:#ffffff; }
 .borderleft {border-left: 1px solid #e9e9e9;}
 .top { border-top: 1px solid #f2f2f2;}
 /*  This piece of code is for a third level drop down menu and is not included in this tutorial  #nav ul 
li:hover ul li ul {display:none;}
 #nav ul li:hover ul li:hover ul {display:block; position: absolute; top:-1px; left: 151px;}*/
 /* Ignore this last piece of code */

 
 </style>
</head>
<body>
<br/>
<br/>
<div id="navcont"> 
<div id="nav"> 
<ul>
 <li class="borderleft"><a href="http://www.jb51.net" target="_blank">Home</a></li>
 <li><a href="http://www.jb51.net" target="_blank">Portfolio</a>
  <ul>
   <li class="top"><a href="http://www.jb51.net" target="_blank">Web</a></li>
   <li><a href="http://www.jb51.net" target="_blank">Print</a></li>
   <li><a href="http://www.jb51.net" target="_blank">The Rest</a></li>
  </ul>
 </li> 
 <li><a href="http://www.jb51.net" target="_blank">Contact</a>
   <ul>
    <li class="top"><a href="http://www.jb51.net" target="_blank">Web</a></li>
    <li><a href="http://www.jb51.net" target="_blank">Print</a></li>
    <li><a href="http://www.jb51.net" target="_blank">The Rest</a></li>
   </ul>
 </li>
</ul>
</div>
</div>
</body>
</html>

