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
<legend class="c1"><h1>欢迎修改</h1></legend>
<form action="${pageContext.request.contextPath}/xiugai2" method="post" >
<c:forEach items="${sessionScope.emps }"   var="c">
编号：<input type="text" name="name"  value="${c.id }">
姓名：<input type="text" name="name"  value="${c.name }">
<br>
密码：<input type="password" name="password" value="${c.password }" >
<br>
<span>性别：<label><input type="radio" name="gender" checked="checked"   }"></label>男</span>
<span><label><input type="radio" name="gender"  ></label>女</span>
<br>
年龄：<input type="text" name="age" value="${c.age }">
<br>
薪资：<input type="text" name="salary"  value="${c.salary }">
<br>
电话：<input type="text" name="phone" value="${c.phone }">
<br>
email：<input type="text" name="email"  id="password"  value="${c.email }">
<br>
</c:forEach>
<input type="reset"  value="重置">
<input type="submit" value="修改">
</form>
</body>
</html>

