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
<h1 style="color:red">${error}</h1>
<form action="bookroom.obj">
<input type="hidden" name="uid" value="${uid}"/>
<input type="hidden" name="pass" value="${pass}"/>
<input type="hidden" name="hid" value="${hid}"/>
<input type="hidden" name="rid" value="${rid}"/>
<input type="submit" value="GoBack"/>
</form>
</center>
</body>
</html>