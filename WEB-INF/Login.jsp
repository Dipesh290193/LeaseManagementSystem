<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login</title>
</head>
<body>
<div style="color:red">${error}</div>
	<form action="Login" method="post">
		<table border="1">
			<tr>
				<td>EmailId:</td>
				<td><input type='text' name='email'/></td>
			</tr>
			<tr>
		        <td>Password:</td>
		        <td><input type='password' name='password'></td>
			</tr>
			<tr>
			     <td><input type='submit' value='Submit'></td>
			     <td><input type='reset' value='Clear'></td>
			</tr>
			
		</table>
		<a href='RegisterResident'>SingUp</a>
	</form>
</body>
</html>