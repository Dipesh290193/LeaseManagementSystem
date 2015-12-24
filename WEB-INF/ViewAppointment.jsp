<%@page import="hw1.Model.Apartment"%>
<%@page import="hw1.Model.UserDetails"%>
<%@page import="hw1.Model.Application"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>View Appointment</title>
</head>
<body>
	<c:set value="${param.id}" var="apartmentID"></c:set>
	<table border="1">
		<tr>
			<th>Apartment No</th>
			<th>Type</th>
			<th>Facilities</th>
			<th>Maximum People</th>
			<th>Rent</th>
			<th>Deposits</th>
		</tr>
		<c:forEach items="${apartment }" var="apartments">
			<c:if test="${apartments.getId() eq apartmentID }">
				<tr>
					<td>${apartments.getApartmentNo() }</td>
					<td>${apartments.getType()}</td>
					<td>${ apartments.getFacilities()}</td>
					<td>${apartments.getMaximumPeople()}</td>
					<td>${ apartments.getRent()}</td>
					<td>${apartments.getDeposits()}</td>
				</tr>
			</c:if>
		</c:forEach>
	</table>
	<h2>Applications</h2>
	<table border="1">
		<tr>
			<th>Applicant Name</th>
			<th>Contact</th>
			<th>People</th>
			<th>Occupation</th>
			<th>Preferences</th>
			<th>Need For Date</th>
			<th>Status</th>
			<th>Reschedule Date</th>
			<th>Ruled Out Date</th>
			<th>Rent Out</th>
		</tr>
        <c:forEach items="${application }" var="app">
            <c:if test="${app.getApartmentID() eq apartmentID }">
                <c:forEach items="${userDetails }" var="user">
                    <c:if test="${app.getUserID() eq user.getId() }">
                        <tr>
				            <td>${user.getUserName() }</td>
				            <td>${user.getContact() }</td>
				            <td>${user.getNumpeople()}</td>
				            <td>${user.getOccupation() }</td>
				            <td>${user.getPreference()}</td>
				            <td>${user.getNeedDate() }</td>
				            <td>${app.getStatus()}</td>
				            <c:if test="${app.getStatus() ne 'Accept' }">
				                <td>
				                    <form action="ViewAppointment" method="post">
				                        <input type="text" name="RescheduleDate"/>
				                        <input type="submit" name="rescheduleDate" value="Rescheudule"/> 
				                        <input type="hidden" name="applicationID" value="${app.getApplicationID() }"/>
				                        <input type="hidden" name="apartmentID" value="${apartmentID }"/>
                                    </form>
                                </td>
				            </c:if>
				            <c:if test="${app.getStatus() eq 'Accept' }">
				                <td>Appointment On ${app.getAppointmentDate() }</td>
				            </c:if>
				     <td>${app.getRuledOutDate() }</td>
                     <td><a href="rentOut?apartmentId=${apartmentID}">Rent Out</a></td>
                     </tr>
                    </c:if>
                </c:forEach>
            </c:if>
        </c:forEach>
	</table>
</body>
</html>