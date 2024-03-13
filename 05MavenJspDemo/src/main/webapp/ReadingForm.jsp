<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<% String id=request.getParameter("id");
String name=request.getParameter("name");
String fees=request.getParameter("fees");

out.println("emp id: "+id+ "<br>");
out.println("emp name: "+name+ "<br>");
out.println("emp fees: "+fees+ "<br>");


String [] merits =request.getParameterValues("percentage");
for(String M:merits){
	out.println(M+"<br>");
	
}

String gender=request.getParameter("gender");
//String gender1=request.getParameter("female");
out.println("Gender is: "+gender);
//out.println("Gender is: "+gender1);



%>

</body>
</html>