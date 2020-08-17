<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<center>
<h1>Available Hotels</h1>

<%@taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>
<table border="1" bgcolor="#D0D0D0">
<tr>
<th bgcolor="bisque">Hotel Id</th>
<th bgcolor="bisque">Hotel Name</th>
<th bgcolor="bisque">City</th>
<th bgcolor="bisque">Address</th>
<th bgcolor="bisque">Description</th>
<th bgcolor="bisque">Average Rate Per Night</th>
<th bgcolor="bisque">Phone Number1</th>
<th bgcolor="bisque">Phone Number2</th>
<th bgcolor="bisque">Rating</th>
<th bgcolor="bisque">Email</th>
<th bgcolor="bisque">Fax</th>
<th bgcolor="bisque"></th>
</tr>
<c:forEach var="t" items="${list}">
<tr>
<td>${t.hotelId}</td>
<td>${t.hotelName}</td>
<td>${t.city}</td>
<td>${t.address}</td>
<td>${t.description}</td>
<td>${t.avgRatePerNight}</td>
<td>${t.phone1}</td>
<td>${t.phone2}</td>
<td>${t.rating}</td>
<td>${t.email}</td>
<td>${t.fax}</td>
<td>
<form action="viewrooms.obj">
<input type="hidden" name="hid" value="${t.hotelId}"/>
<input type="hidden" name="uid" value="${uid}"/>
<input type="hidden" name="pass" value="${pass}"/>
			<input type="submit" value="View Rooms"/>
</form>
</td>
</tr>
</c:forEach>
</table>
<br/><a href="home.obj">HomePage</a>

</center>
</body>
</html>