<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Manager Home</title>
</head>
<body>

	<h2>Welcome ${sessionScope.UserName}</h2>
	<a href="AddApartment">Add Apartment</a>
	<br/>
	<a href="ViewApartment">View Apartment</a>
	<br/>
	<a href="Logout">Logout</a>

</body>
</html>