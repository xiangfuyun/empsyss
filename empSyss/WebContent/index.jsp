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
<h1>最牛逼员工管理系统</h1>

	<hr width="80%">
	
	<c:if test="${sessionScope.emp == null }">
		<a href="${pageContext.request.contextPath }/Zhuche.jsp">注册</a>
		<a href="${pageContext.request.contextPath }/login.jsp">登录</a>
	</c:if>
	
	<c:if test="${sessionScope.emp != null }">
		<a href="${pageContext.request.contextPath }/EmpListServlet">员工列表</a>
		<a href="${pageContext.request.contextPath }/LogoutServlet">安全退出</a>		
		<div>上次登录时间:${requestScope.lastTime }</div>
	</c:if>
</body>
</html>