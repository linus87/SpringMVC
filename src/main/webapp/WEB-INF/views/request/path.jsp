<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Form Submission</title>
</head>
<body>
	<ul>
		<li>Test "path/{userId}/pet/{petId}: path/linus/pets/tiger;  <strong>Get userId = ${requestScope.userId}, petId = ${requestScope.petId }, <%=request.getAttribute("userId") %></strong></li>
		<li>Test "path/{userId}/: path/linus/;  <strong>Get userId = ${requestScope.userId}, <%=request.getAttribute("userId") %></strong></li>
		<li>Test "path/: path/;  <strong>Get userId = ${requestScope.userId}, petId = ${requestScope.petId }, <%=request.getAttribute("userId") %></strong></li>
	</ul>	
</body>
</html>