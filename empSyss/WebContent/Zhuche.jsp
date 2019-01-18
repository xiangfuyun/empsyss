<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<legend class="c1"><h1>欢迎注册</h1></legend>
<form action="${pageContext.request.contextPath}/zhuche" method="post" >
<fieldset >
姓名：<input type="text" name="name" >
<br>
密码：<input type="password" name="password"  >
<br>
<span>性别：<label><input type="radio" name="gender" checked="checked"  value="男"></label>男</span>
<span><label><input type="radio" name="gender" value="女" ></label>女</span>
<br>
年龄：<input type="text" name="age" >
<br>

薪资：<input type="text" name="salary"  >
<br>
电话：<input type="text" name="phone" >
<br>
email：<input type="text" name="email"  id="password">
<br>
<input type="reset"  value="重置">
<input type="submit" value="注册">
</fieldset>
</form>
</body>
</html>
