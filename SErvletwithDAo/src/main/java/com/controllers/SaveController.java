package com.controllers;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.Dao.EmployeeDaoimpl;
import com.pojo.Employee;

/**
 * Servlet implementation class SaveController
 */
public class SaveController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

      EmployeeDaoimpl dao=new EmployeeDaoimpl();
      PrintWriter writer=response.getWriter();
      int id=Integer.parseInt(request.getParameter("id"));
      String name=request.getParameter("name");
      double salary=Double.parseDouble(request.getParameter("salary"));
      String email=request.getParameter("email");
      
      
		
		Employee e=new Employee(id, name, salary, email);
		dao.save(e);
		request.getRequestDispatcher("findall").forward(request, response);
	
	
	
	
	
	}


	

}
