<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<% 
//pagecontext obj should be written only in jsp shouldn't write in java
//pageContext.setAttribute("attr", "attr_value",PageContext.APPLICATION_SCOPE);

String app=(String)application.getAttribute("app");//context
                  //in built obj.

  // String user=config.getInitParameter("myuser"); 

//String aps=application.getInitParameter("applicationScope");

String season=(String)session.getAttribute("season");
//pageContext.getAttribute("attr");

System.out.println(app);
//System.out.println(user);
//System.out.println(aps);
System.out.println(season);

 %>

<%=app%>
<%--  <%=user %> --%>
<%=season%>





</body>
</html>