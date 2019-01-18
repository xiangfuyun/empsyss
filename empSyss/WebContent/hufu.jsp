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
<table border="1" width="700" cellspacing="0">	
		<thead>
			<tr>
				<th>id</th>
				<th>姓名</th>
				<th>密码</th>
				<th>性别</th>
				<th>年龄</th>
				<th>入职日期</th>
				<th>薪资</th>
				<th>电话</th>
				<th>邮箱</th>
				<th colspan="1">操作</th>
			</tr>
		</thead>
		<c:forEach items="${requestScope.list2 }" var="e">
			<tr>
				<td>${e.id }</td>
				<td>${e.name }</td>
				<td>${e.password }</td>
				<td>${e.gender }</td>
				<td>${e.age }</td>
				<td>${e.hiredate }</td>
				<td>${e.salary }</td>
				<td>${e.phone }</td>
				<td>${e.email }</td>
				<td><a href="${pageContext.request.contextPath }/emp3shan?id=${e.id}">恢复</a></td>
				
			    
			</tr>
		</c:forEach>	
		<br>
		 <input name "员工列表" type="button"  value="员工列表"  onclick="window.location.href='EmpListServlet' "/> 
		
	</table>
</body>
</html>