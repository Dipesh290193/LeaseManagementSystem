<%@page import="org.apache.jasper.tagplugins.jstl.core.ForEach"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@page import="hw1.Model.*"%>
<%@page import="java.util.*"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>LookUp Apartment</title>
</head>
<body>
	<h2>welcome ${sessionScope.UserName }</h2>
	<table border="1">
		<tr>
			<th>Apartment No</th>
			<th>Apartment Type</th>
			<th>Facility</th>
			<th>Maximum People</th>
			<th>Rent</th>
			<th>Deposits</th>
			<th>Operation</th>
			<th>Appointment Date(By Manager)</th>
			<th>Accept/Deny</th>
		</tr>
		<c:forEach items="${apartment }" var="apartments" >
		  <c:if test="${apartments.isAvailable() }">
		      <tr>
				<td>${apartments.getApartmentNo() }</td>
				<td>${apartments.getType()}</td>
				<td>${apartments.getFacilities() }</td>
				<td>${apartments.getMaximumPeople()}</td>
				<td>${apartments.getRent()}</td>
				<td>${apartments.getDeposits()}</td>
				<c:set value="false" var="flag" scope="page"></c:set>
				<c:forEach items="${application }" var="app">
				    <c:if test="${app.getApartmentID() eq apartments.getId() and app.getUserID() eq sessionScope.userID }">
				        <c:set var="flag" value="true"></c:set>
				        <c:if test="${app.getStatus() eq 'Requested' }">
				            <td>Request Sent!</td>
                            <td></td>
                            <td></td>
				        </c:if>
				        <c:if test="${app.getStatus() eq 'Scheduled' }">
                            <td>Request Sent!</td>
                            <td>${app.getAppointmentDate() }</td>
                             <td>
                                <form action="AppointmentAcceptDeny" method="post">
				                    <input type="hidden" name="id" value="${app.getApplicationID()}"> 
				                    <input type="submit" name="decision" value="Accept"> 
				                    <input  type="submit" name="decision" value="Deny">
                                </form>
                             </td>
                        </c:if>
                        <c:if test="${app.getStatus() eq 'Accept' }">
                            <td>Scheduled</td>
                            <td>${app.getAppointmentDate() }</td>
                            <td>Accepted!</td>
                        </c:if>
                        <c:if test="${app.getStatus() eq 'Deny' }">
                            <td>Request Sent!</td>
                            <td>${app.getAppointmentDate() }</td>
                            <td>Denied!</td>
                        </c:if>
				    </c:if>			
				</c:forEach>
				<c:if test="${flag eq 'false'}">
					<td>
					   <a href="AddApplication?apartmentID=${apartments.getId()}">Request for Apartment</a>
					</td>
	                <td></td>
	                <td></td>
				</c:if>
		</tr>
            </c:if>
        </c:forEach>
	</table>

	<a href="Logout">Logout</a>
</body>
</html>