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
<h3>${q} You are Done with Registration with Id as ${x}</h3>

<form action="loginSuccess.obj">
<input type="hidden" name="uid" value="${uid}"/>
<input type="hidden" name="pass" value="${pass}"/>
<input type="submit" value="View Hotels"/>
</form>
</center>
</body>
</html>