<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body style="background-color:cyan">
<%@ taglib prefix="f" uri="http://www.springframework.org/tags/form" %>
<center>
<f:form action="bookingSuccess.obj" modelAttribute="bdetails">
<h1>Please Fill the Details to Book a Room</h1>
<table border="1" bgcolor="#D0D0D0">

<%-- <tr>
<td>User Id : </td>
<td><f:input path="userId" readonly="true" value="${uid}"/></td>
</tr> --%>

<tr>
<td>Hotel Id : </td>
<td><f:input path="hotelId" readonly="true" value="${hid}"/></td>
</tr>

<tr>
<td>Select Room Id: <font color="red">*</font> </td>
<td>

 <f:input path="roomId" readonly="true" value="${rid}"/> 
</td>
</tr>

<tr>
<td>From Date :(yyyy-MM-dd) <font color="red">*</font> </td>
<td><f:input path="bookedFrom" name="bookedFrom"/>
</td>
</tr>

<tr>
<td>To Date :(yyyy-MM-dd) <font color="red">*</font> </td>
<td><f:input path="bookedTo" name="bookedTo"/>
</td>
</tr>

<tr>
<td>No of Adults : <font color="red">*</font> </td>
<td><f:input path="noOfAdults"/>
</td>
</tr>

<tr>
<td>No of children : </td>
<td><f:input path="noOfChildren"/>
</td>
</tr>

<tr>
<td colspan="2"><center>
<input type="hidden" name="hid" value="${hid}"/>
<input type="hidden" name="pass" value="${pass}"/>
<input type="hidden" name="rid" value="${rid}"/>
<input type="hidden" name="uid" value="${uid}"/>
<input type="submit" value="Confirm Booking"/></center>
</tr>
</table>
</f:form>
<br/><font color="red">All (*) Fields are Mandatory</font>
<br/><br/>
<form action="loginSuccess.obj">
<input type="hidden" name="uid" value="${uid}"/>
<input type="hidden" name="pass" value="${pass}"/>
<input type="submit" value="GoBack"/>
</form>
</center>



</body>
</html>