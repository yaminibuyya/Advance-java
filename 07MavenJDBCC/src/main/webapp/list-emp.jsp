<%@page import="com.model.Employee"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>
#Employees {
  font-family: Arial, Helvetica, sans-serif;
  border-collapse: collapse;
  width: 100%; 
}

#Employees td, #Employees th {
  border: 1px solid #ddd;
  padding: 8px;
}

#Employees tr:nth-child(even){background-color: #f2f2f2;}

#Employees tr:hover {background-color: #ddd;}

#Employees th {
  padding-top: 12px;
  padding-bottom: 12px;
  text-align: left;
  background-color: #04AA6D;
  color: white;
}
</style>
</head>

<body>
<h1> get All</h1>
<h3> <a href="emp-save.jsp"> Add Employee</a></h3>

<%  List<Employee> employees=(List<Employee>)request.getAttribute("list"); 
      out.println(employees); %>
      
    <% String s=(String)request.getAttribute("gsnn"); 
    out.println(s);
    %>

<table  id="Employees"> 
<tr>
    <th> EID</th>
    <th> Ename</th>
    <th> salary</th>
    <th>Email</th>
    <th>Action</th>
    
   </tr>
   
   
<%  for (Employee employee:employees){  %>
	<tr>
	<td> <%= employee.getId() %></td>
	<td> <%= employee.getName() %></td>
	<td> <%= employee.getSalary() %></td>
	<td> <%= employee.getEmail() %></td>
	<td> <a href="eUpdate?id=<%=employee.getId() %>">UPDATE</a>  <a href="delete?id=<%=employee.getId() %>">
	 DELETE </a></td>
	
	
	</tr>
	
<% } %>

    </table>
    
</body>
</html>
    