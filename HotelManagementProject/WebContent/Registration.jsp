<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%@taglib prefix="f" uri="http://www.springframework.org/tags/form" %>

<center>
		<h1 style="color: #0066CC">Hotel Management Registration Form</h1>
<f:form action="registeruser.obj" modelAttribute="t">

<table border="1">
<%-- <f:hidden path="query_id"  value="${qid1}"/> --%>
 <tr>
<td>Enter UserName :<span style="color: red;">*</span></td>
<td ><f:input path="userName" />
<f:errors cssStyle="color:red" path="userName"/>
</td>
</tr> 

<tr>
<td>Enter Password :<span style="color: red;">*</span></td>
<td ><f:input path="password"/>
<f:errors cssStyle="color:red" path="password"/>
</td>
</tr>

<tr>
<td>Enter Role :<span style="color: red;">*</span></td>
<td><f:select   path="role">
<f:option value="Please Select">Please Select</f:option>
<f:option value="Admin">Admin</f:option>
<f:option value="User">User</f:option>
<f:option value="Employee">Employee</f:option>

</f:select>
</td>
</tr>

<tr>
<td>Enter MobileNumber :<span style="color: red;">*</span></td>
<td ><f:input path="mobile"/>
<f:errors cssStyle="color:red" path="mobile"/>
</td>
</tr>

<tr>
	<td>Enter Address :<span style="color:red;">*</span></td>
	<td><f:textarea path="address" rows="4" cols="15" placeholder="Enter Address" ></f:textarea>
	<f:errors cssStyle="color:red" path="address"/>
	</td>
</tr>

<tr>
<td>Enter EmailId :<span style="color: red;">*</span></td>
<td ><f:input path="email"/>
<f:errors cssStyle="color:red" path="email"/>
</td>
</tr>


<tr>
<td>Enter PhoneNumber(Landline) :<span style="color: red;">*</span></td>
<td ><f:input path="phone"/>
<f:errors cssStyle="color:red" path="phone"/>
</td>
</tr>

<tr><td  colspan="2"><input type="submit" value="Register"></td></tr>
</table>
</f:form>
</center>

</body>
</html>