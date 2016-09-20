<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<link rel="stylesheet" href="<spring:theme code='stylesheet'/>" type="text/css" />
<title>Form Submission</title>
</head>
<body>
	<p>JESSIONID: ${jessionId }</p>
	<p>HttpOnly: ${cookie.JSESSIONID.isHttpOnly() }</p>
	<p>MaxAge: ${cookie.JSESSIONID.getMaxAge() }</p>
	<p>Path: ${cookie.JSESSIONID.getPath() }</p>
	<p>Version: ${cookie.JSESSIONID.getVersion() }</p>
</body>
</html>