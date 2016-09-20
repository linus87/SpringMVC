<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Upload Research</title>
</head>
<body>
	<p>File original name is : ${originalName}</p>
	<p>File name is : ${name}</p>
	<p>File type is : ${contentType}</p>
	<p>File size is : ${fileSize}</p>

	<form action="upload" method="POST" enctype="multipart/form-data">
		<fieldset>
			<legend>mulipart/form-data</legend>
			<input type="file" id="file" name="file" /> <br /> <select id="format"
				name="format">
				<option value="XML">XML File</option>
				<option value="IMAGE">Image File</option>
			</select>
		</fieldset>
		<button type="submit">Submit</button>
	</form>

</body>
</html>