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
<%@taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>
<h1>Hotels Available</h1>
<table border="1" bgcolor="#D0D0D0">
<tr>
<th bgcolor="bisque">Hotel Id</th>
<th bgcolor="bisque">Room Id</th>
<th bgcolor="bisque">Room Number</th>
<th bgcolor="bisque">Room Type</th>
<th bgcolor="bisque">Per Night Rate</th>
<th bgcolor="bisque">Availability</th>
<th bgcolor="bisque"></th>
</tr>
<c:forEach var="t" items="${rlist}">
<tr>
<td>${t.hotelId}</td>
<td>${t.roomId}</td>
<td>${t.roomNo}</td>
<td>${t.roomType}</td>
<td>${t.perNightRate}</td>
<td>${t.availability}</td>
<td>
<form action="bookroom.obj">

<input type="hidden" name="uid" value="${uid}"/>
<input type="hidden" name="pass" value="${pass}"/>
<input type="hidden" name="hid" value="${t.hotelId}"/>
<input type="hidden" name="rid" value="${t.roomId}"/>
			<input type="submit" value="Book Room"/>
</form>
</td>
</tr>
</c:forEach>
</table>
<br/>

<form action="loginSuccess.obj">
<input type="hidden" name="uid" value="${uid}"/>
<input type="hidden" name="pass" value="${pass}"/>
<input type="submit" value="GoBack"/>
</form>

</center>

</body>
</html>