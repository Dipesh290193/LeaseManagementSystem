<%@page import="org.apache.jasper.tagplugins.jstl.core.ForEach"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@page import="hw1.Model.Apartment"%>
<%@page import="java.util.*"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>View Apartment</title>
</head>
<body>
	<form method="post" action="ViewApartment">
		<table border="1">
			<tr>
				<th>Apartment Id</th>
				<th>Apartment Type</th>
				<th>Facility</th>
				<th>Max People</th>
				<th>Rent</th>
				<th>Deposits</th>
				<th>Make Available</th>
				<th>View</th>
			</tr>
			<c:forEach items="${apartment}" var="apartments">
			<tr>
				<td>${apartments.getApartmentNo()}</td>
				<td>${apartments.getType() }</td>
				<td>${apartments.getFacilities() }</td>
				<td>${apartments.getMaximumPeople()}</td>
				<td>${apartments.getRent()}</td>
				<td>${apartments.getDeposits()}</td>
				<td>					
					<c:if test="${not apartments.isAvailable()}">
				        <a	href="ViewApartment?id=${apartments.getId()}"> Make Available</a>
				    </c:if>				
				</td>
				<td>
				    <c:if test="${apartments.isAvailable()}">					
					   <a  href="ViewAppointment?id=${apartments.getId()}">View</a>
				    </c:if>
				</td>
			</tr>
			</c:forEach>
		</table>
		<a href="AddApartment">Add another Apartment</a>
		<a href="ManagerHome">Manager Home</a>
		
	</form>
</body>
</html>