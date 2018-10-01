<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!-- <%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%> -->
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<!--<base href="<%=basePath%>">-->
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>后台管理</title>
<link href="static/loginSource/css/font-awesome.min.css" rel="stylesheet" media="all" />
<link href="static/loginSource/css/loginMy.css" rel="stylesheet" media="all" />
<script type="text/javascript" src="static/Js/jquery-2.2.3.min.js"></script>
</head>
<body>
<div class="main">
	<div class="center">
		<i class="fa fa-user Cone"> | </i>
		<input type="text" name="uer" id="username" placeholder="用户名 "/>
		<span id="user_pass"></span>
		<br/>
		<i class="fa fa-key Cone"> | </i>
		<input type="password" name="pwd" id="password" placeholder="密码" />
		<span id="pwd_pass"></span>
		<br/>
		<input value="登录" style="width:100%;" type="button" onclick="doL();">
		<br/>
	</div>
</div>
</body>
<script type="text/javascript">
$(function () {});
function doL() {
	class UserParam {
		constructor(userName, password) {
			this.userName = userName;
			this.password = password;
		}
	};
	var userinfoRef = new UserParam($("#username").val(), $("#password").val());
	var jsonString = JSON.stringify(userinfoRef);
	//console.log(jsonString);
	$.ajax({  
        url : "login/doLogin.do",  
        type: "POST",
        dataType: "json",
        contentType: "application/json", //必须有
        data:jsonString, 
        success : function(data) {
        	if(data.state == 0){
        		location.href="index/index.do";
        	}else{alert(data.data)}
        },  
        error : function(data) {  
            console.log(data);
        }  
    });  
}
</script>
</html>