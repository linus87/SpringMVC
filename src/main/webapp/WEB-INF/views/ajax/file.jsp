<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
</head>
<body>

<h2>File Upload</h2>
<input type="file" id="file" />
<p>Response: <span id="form"></span></p>

<script type="text/javascript">
	var xmlRequest = new XMLHttpRequest();
	xmlRequest.open("POST", "file");
	xmlRequest.onload = function(event) {
		document.getElementById("form").innerHTML = this.response;
	};
	var formData = new FormData();
	
	function sendData() {
		formData.append("file", document.getElementById("file").files[0]);
		xmlRequest.send(formData);
	}
</script>

<button onclick="javascript: sendData();">Ajax Submit</button>
</body>
</html>