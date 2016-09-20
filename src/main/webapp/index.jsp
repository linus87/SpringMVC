<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
</head>
<body>
	hello, this is a spring project <br />
	<p>Current working directory: <%=System.getProperty("user.dir") %></p>
	<p>Context path: <%=this.getServletContext().getContextPath() %></p>
	<%=this.getServletContext().getRealPath("/main") %>
</body>
</html>