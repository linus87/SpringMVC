<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Form Submission</title>
</head>
<body>

	<form class="serialize" action="validation" method="post">
		<input type="text" name="username" />
		<input type="text" name="password" />
		<select name="way" id="way">
			<option value="model">Use @ModelAttribute</option>
			<option value="normal">Not use @ModelAttribute</option>
		</select>
		<div>
			<button type="submit">Submit</button>
		</div>
	</form>

	<div>
		<p>Return Message: ${message }</p>
		<p>Person Name: ${person.username }  </p>
		<p>Person password: ${person.password }  </p>
	</div>
	
	<div>
		<p>Return Message: ${message }</p>
		<p>Person Name: ${user.username }  </p>
		<p>Person password: ${user.password }  </p>
	</div>
	
	<div>
		<p><%=session.getAttribute("message") %></p>
	</div>
	
</body>
</html>