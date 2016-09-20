<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
</head>
<body>

<script type="text/javascript">
	var xmlRequest = new XMLHttpRequest();
	xmlRequest.open("POST", "json");
	xmlRequest.onload = function() {
		console.log("loaded");
	};
	xmlRequest.setRequestHeader("content-type", "application/x-www-form-urlencoded");
	//xmlRequest.send(JSON.stringify({name: "linus", english:"98"}));
	xmlRequest.send("name=linus&english=98");
</script>	
</body>
</html>