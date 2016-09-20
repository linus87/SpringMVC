<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Form Submission</title>
</head>
<body>

	<div style="float: right; width: 500px;">
		<h2>Request Infos</h2>
		<ul>
			<li>Content-Type: ${contentType }</li>
			<li></li>
			<li></li>
		</ul>
		
		<h2>Form Data</h2>
		<p>Post Result: ${body }</p>
		<p>Select: ${param.single }  </p>
		<p>Textarea: ${param.content }  </p>
		<p>Multiple: ${param.multiple }  </p>
		<p>Checkbox: ${paramValues }  </p>
		<p>Radio: ${param.radio }  </p>
		<p>File: ${param.file }  </p>
	</div>
	
	<h2>application/x-www-form-urlencoded</h2>
	<form class="serialize" action="entity" method="post">
		<select name="single">
			<option>Single</option>
			<option>Single2</option>
		</select>
		
		<textarea name="content" id="" cols="30" rows="10">Hello, world</textarea>
		
		<select name="multiple" multiple="multiple">
			<option selected="selected">Multiple</option>
			<option>Multiple2</option>
			<option selected="selected">Multiple3</option>
		</select><br />
		
		 <input type="checkbox" name="check" value="check1" checked="checked"/> check1 
		 <input	type="checkbox" name="check" value="check2" checked="checked" /> check2
		  
		 <input type="radio" name="radio" value="radio1" checked="checked" /> radio1
		 <input type="radio" name="radio" value="radio2" /> radio2
		 
		 <div>
		 	<button type="submit">Submit</button>
		 </div>
	</form>
	
	<h2>multipart/form-data</h2>
	<form class="serialize" action="entity" method="post" enctype="multipart/form-data">
		<select name="single">
			<option>Single</option>
			<option>Single2</option>
		</select>
		
		<textarea name="content" id="" cols="30" rows="10">Hello, world</textarea>
		
		<select name="multiple" multiple="multiple">
			<option selected="selected">Multiple</option>
			<option>Multiple2</option>
			<option selected="selected">Multiple3</option>
		</select><br />
		
		 <input type="checkbox" name="check" value="check1" checked="checked"/> check1 
		 <input	type="checkbox" name="check" value="check2" checked="checked" /> check2
		  
		 <input type="radio" name="radio" value="radio1" checked="checked" /> radio1
		 <input type="radio" name="radio" value="radio2" /> radio2
		 
		 <input type="file" name="file" />
		 
		 <div>
		 	<button type="submit">Submit</button>
		 </div>
	</form>
</body>
</html>