<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Form Submission</title>
</head>
<body>
	<p>Request content is : ${content }</p>
	<p>Request content is : ${role } - ${action }</p>
	<form action="requestbody" method="POST">
		<fieldset>
			<legend>mulipart/x-www-form-urlencoded</legend>
			<select name="role" id="role">
				<option value="GUEST">Guest</option>
				<option value="MEMBER">Member</option>
				<option value="MODERATOR">Moderato</option>
				<option value="ADMIN">Admin</option>
			</select> <select name="action">
				<option value="ADD">Add User</option>
				<option value="DELETE">Delete User</option>
				<option value="DISABLE">Disable User</option>
			</select> <br /> 
			
			<input type="file" id="file" name="file" accept="text/html, application/xml"/> <br /> 
			
			<select id="format"
				name="format">
				<option value="STRING">String</option>
				<option value="BYTE_ARRAY">Byte Array</option>
				<option value="FORM">Form</option>
			</select>
		</fieldset>

		<button type="submit">Submit</button>
	</form>

	<form action="requestbody/multipart" method="POST" enctype="multipart/form-data">
		<fieldset>
			<legend>mulipart/form-data</legend>
			<input type="file" id="file" name="file" /> <br /> <select id="format"
				name="format">
				<option value="BYTE_ARRAY">Byte Array</option>
				<option value="SOURCE">XML File</option>
			</select>
		</fieldset>
		<button type="submit">Submit</button>
	</form>

</body>
</html>