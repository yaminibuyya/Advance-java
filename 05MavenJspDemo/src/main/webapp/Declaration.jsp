<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<!-- declaring fields -->
<%! int i=50; %>
<%= "value of the variable is:"+i %>


<!--  declaring methods -->
<%! int mul(int n){
	return n*n*n;
}
	%>
	<%= "multiplication of this:"+mul(5) %>




</body>
</html>