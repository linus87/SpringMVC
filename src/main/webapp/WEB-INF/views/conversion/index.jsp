<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Form Submission</title>
</head>
<body>
	<p>Date value: ${vo.date }</p>
	<p>Currency value: ${vo.currency} - ${vo.decimal}</p>
	
	<form class="serialize" action="conversion" method="post">
		<select name="date" id="date">
			<option value="2013/12/23">2013/12/23</option>
			<option value="2013-12-23">2013-12-23</option>
		</select>
		
		<select name="currency" id="currency">
			<option value="USN">Dollar</option>
			<option value="CNY">Ren</option>
		</select>
		
		<input type="text" name="decimal" value="12345.6789" />
		
		<div>
			<button type="submit">Submit</button>
		</div>
	</form>
	
</body>
</html>