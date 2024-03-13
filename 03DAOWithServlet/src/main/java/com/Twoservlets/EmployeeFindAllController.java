 package com.Twoservlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.DAOLayers.EmployeeDaoimpl;
import com.modelClass.Employee;

public class EmployeeFindAllController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter writer=response.getWriter();
	     writer.println("find all controller");
	     
	     EmployeeDaoimpl dao=new EmployeeDaoimpl();
	   List<Employee>employees= dao.getemployees();
	   writer.println(employees);
	   writer.println("</html");
	   writer.println("<body>");
	   writer.println("<table border=1px>");
	   writer.println("<tr><th>EID</th><th>Ename</th><th>Esal</th><th>Email</th></tr>");
	   for(Employee employee:employees) {
		   writer.print("<tr>");
		   writer.print("<td>" +employee.getId() +"</td>");
		   writer.print("<td>" +employee.getName() +"</td>");
		   writer.print("<td>" +employee.getSalary() +"</td>");
		   writer.print("<td>" +employee.getEmail() +"</td>");
		   writer.print("</tr>");
		   
	   }
	   writer.println("</table>");
	   writer.println("</body>");
	   writer.println("</html");
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    doGet(req,resp);
	}

}
