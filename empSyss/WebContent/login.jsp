<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>欢迎登录</h1>
<form action="${pageContext.request.contextPath}/LoginServlet" method="post">
姓名：<input type="text" name="name" id="name">
<br>
密码：<input type="password" name="password"  id="password">
<br>
<input type="checkbox"  checked="checked"  name="yon">记住用户名
<br>
验证码:<input type="text" name="validate">
			<img alt="验证码" id="validate" src="${pageContext.request.contextPath }/ValidateServlet"
				style="cursor: pointer;" onclick="changeImg()"/>	
			<font color="red">${val_msg }</font>
		<br>
${error_msg }

<br>
<input name "注册" type="button"  value="注册"  onclick="window.location.href='Zhuche.jsp' "/>




<input type="reset"  value="重置">
<input type="submit" value="登录">
</form>


</body>
</html>

