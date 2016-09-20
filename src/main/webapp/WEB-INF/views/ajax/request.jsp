<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
</head>
<body>

<h2>application/x-www-form-urlencoded</h2>
<p>Request: "name=linus&english=98"</p>
<p>Response: <span id="form"></span></p>

<script type="text/javascript">
	var xmlRequest = new XMLHttpRequest();
	xmlRequest.open("POST", "ajax/form");
	xmlRequest.onload = function(event) {
		document.getElementById("form").innerHTML = this.response;
	};
	xmlRequest.setRequestHeader("content-type", "application/x-www-form-urlencoded");
	//xmlRequest.send(JSON.stringify({name: "linus", english:"98"}));
	xmlRequest.send("name=linus&english=98");
</script>

<h2>multipart/form-data</h2>
<p>Request: "name=linus&english=98"</p>
<p>Response: <span id="form2"></span></p>

<script type="text/javascript">
	var xmlRequest2 = new XMLHttpRequest();
	xmlRequest2.open("POST", "ajax/form");
	xmlRequest2.onload = function(event) {
		document.getElementById("form2").innerHTML = this.response;
	};
	//xmlRequest2.setRequestHeader("content-type", "multipart/form-data");
	//xmlRequest.send(JSON.stringify({name: "linus", english:"98"}));
	
	var formData = new FormData();
	formData.append("name", "linus");
	formData.append("english", "98");
	xmlRequest2.send(formData);
	
	//xmlRequest2.send("name=linus&english=98");
</script>

</body>
</html>