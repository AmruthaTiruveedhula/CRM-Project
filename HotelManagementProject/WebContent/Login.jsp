<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
   <%@taglib prefix="f" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<center>
<h1>
Hotel Bookings Management System
</h1>

<form action="loginSuccess.obj">
Enter UserId:
<input type="number" name="uid" required="true"/>
<br/>
<br/>
Enter Password:
<input type="password" name="pass" required="true"/>
<br/>
<br/>
<input type="submit" value="Login"/>
</form>
</center>
</body>
</html>