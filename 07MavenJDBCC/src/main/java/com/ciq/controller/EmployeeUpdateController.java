package com.ciq.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.Dao.EmployeeDaoImpl;
import com.model.Employee;

/**
 * Servlet implementation class EmployeeUpdateController
 */
public class EmployeeUpdateController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		EmployeeDaoImpl dao=new EmployeeDaoImpl();
		int id=Integer.parseInt(request.getParameter("id"));
	    Employee employee=dao.getByid(id);
	    request.setAttribute("emp", employee);
	    request.getRequestDispatcher("emp-update.jsp").forward(request, response);
	
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 EmployeeDaoImpl dao=new EmployeeDaoImpl();
	      PrintWriter writer=response.getWriter();
	      int id=Integer.parseInt(request.getParameter("id"));
	      String name=request.getParameter("name");
	      double salary=Double.parseDouble(request.getParameter("salary"));
	      String email=request.getParameter("email");
	      
	      Employee employee=new Employee(id,name,salary,email);
			dao.update(employee);
			request.getRequestDispatcher("FindAll").forward(request, response);	
		
		
		
	}

}
