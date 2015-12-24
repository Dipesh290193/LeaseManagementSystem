<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Add Apartment</title>
</head>
<body>
<div style="color:red">${error}</div>
	<form action='AddApartment' method='post'>
		<table border='1'>
			<tr>
				<td>Apartment#</td>
				<td><input type='text' name='apartment' /></td>
			</tr>
			<tr>
				<td>Type</td>
				<td><input type='radio' name='type' value='1BHK'>1BHK<br>
					<input type='radio' name='type' value='2BHK-1Bath'>2BHK-1Bath<br>
					<input type='radio' name='type' value='2BHK-2Bath'>2BHK-2Bath</td>
			</tr>
			<tr>
				<td>Facilities</td>
				<td><textarea name='facilities' rows='5'></textarea></td>
			</tr>
			<tr>
				<td>Maximum People</td>
				<td><input type='text' name='people' /></td>
			</tr>
			<tr>
				<td>Rent</td>
				<td><input type='text' name='rent' /></td>
			</tr>
			<tr>
				<td>Deposits</td>
				<td><input type='text' name='deposits' /></td>
			</tr>
			<tr>
				<td><input type='submit' value='Submit' /></td>
				<td><input type='reset' value='Clear' /></td>
			</tr>
		</table>
	</form>
</body>
</html>