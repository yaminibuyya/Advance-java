
<%@page import="com.model.Employee"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2>Updating Values</h2>
<%  Employee employee=(Employee) request.getAttribute("emp"); %>
<form action="eUpdate" method="post">
<table>
<tr>
 <td> EID :</td>
 <td><input type="text" name="id" readonly="readonly" value=<%= employee.getId() %>></td>
 </tr>
 
<tr>
<td>Ename :</td>
<td><input type="text" name="name" value=<%= employee.getName() %>></td>
</tr>

<tr>
<td>Esal:</td>
<td><input type="text" name="salary" value=<%= employee.getSalary() %>> </td>
</tr>

<tr>
<td>Email:</td>
<td><input type="text" name="email" value=<%= employee.getEmail()  %>></td>
</tr>
<tr>
<td><input type="submit" value="Update"></td>
</tr>


</table>


		<%-- EID: <input type="text" name="id" readonly="readonly" value=<%= employee.getId() %>><br> 
		Ename: <input type="text" name="name" value=<%= employee.getName() %>><br>
		Esal: <input type="text" name="salary" value=<%= employee.getSalary() %>> <br> 
		Email: <input type="text" name="email" value=<%= employee.getEmail()  %>> <br> 
		<input type="submit" value="Save">
		<input type="reset">--%>
</form>
</body>
</html>