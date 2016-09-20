<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Form Submission</title>
</head>
<body>
	<p>${message }</p>
	<form action="param" method="POST">
		<select name="role" id="role">
			<option value="GUEST">Guest</option>
			<option value="MEMBER">Member</option>
			<option value="MODERATOR">Moderato</option>
			<option value="ADMIN">Admin</option>
		</select>
		<select name="action">
			<option value="ADD">Add User</option>
			<option value="DELETE">Delete User</option>
			<option value="DISABLE">Disable User</option>
		</select>
		
		<button type="submit">Submit</button>
	</form>
</body>
</html>