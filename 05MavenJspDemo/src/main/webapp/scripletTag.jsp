<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1> ScripletTag</h1>
<% out.println("<h1>" +new Date() +"</h1>"+"<br>");
out.println(new String("hello sahasra"+"<br>"));
%>
<% int a=10;
out.println(a+"<br>");
%>

<%  for(int i=1;i<=5;i++){
	out.println("<h3>"+"create Technologies"+"<h3>"+"<br>");
}

if(a>=19){
	out.println("a is greater than 10");
}
else{
	out.println("a is less than 10");
	
}
	%>
</body>
</html>