<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>SignUp</title>
</head>
<body>
<div style="color:red">${error }</div>
	<form action="RegisterResident" method="post">
		<table border="1">
			<tr>
				<th colspan='2' align='center'>SignUp</th>
			</tr>
			<tr>
				<td>User Name</td>
				<td><input type='text' name='username' /></td>
			</tr>
			<tr>
				<td>Email</td>
				<td><input type='text' name='email' /></td>
			</tr>
			<tr>
				<td>Password</td>
				<td><input type='password' name='password' /></td>
			</tr>
			<tr>
				<td>Confirm Password</td>
				<td><input type='password' name='confirmPassword' /></td>
			</tr>
			<tr>
				<td>Contact</td>
				<td><input type='text' name='contact' /></td>
			</tr>
			<tr>
				<td>People</td>
				<td><input type='text' name='people' /></td>
			</tr>
			<tr>
				<td>Occupation</td>
				<td><input type='radio' name='occupation' value='Student'>Student<br>
					<input type='radio' name='occupation' value='Family'>Family<br>
					<input type='radio' name='occupation' value='Business'>Business</td>
			</tr>
			<tr>
				<td>Type</td>
				<td><input type='radio' name='type' value='1BHK'>1BHK<br>
					<input type='radio' name='type' value='2BHK-1Bath'>2BHK-1Bath<br>
					<input type='radio' name='type' value='2BHK-2Bath'>2BHK-2Bath</td>
			</tr>
			<tr>
				<td>Preferences</td>
				<td><textarea name='preference'></textarea></td>
			</tr>
			<tr>
				<td>Need For Date</td>
				<td><input type="date" name='needDate' /></td>
			</tr>
			<tr>
				<td><input type='submit' value='Submit' /></td>
				<td><input type='reset' value='Clear' /></td>
			</tr>
		</table>
	</form>
</body>
</html>