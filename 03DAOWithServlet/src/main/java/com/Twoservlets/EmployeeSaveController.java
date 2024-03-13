package com.Twoservlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.DAOLayers.EmployeeDaoimpl;
import com.modelClass.Employee;

public class EmployeeSaveController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
      response.setContentType("text/html");
      EmployeeDaoimpl dao=new EmployeeDaoimpl();
      PrintWriter writer=response.getWriter();
      int id=Integer.parseInt(request.getParameter("id"));
      String name=request.getParameter("name");
      double salary=Double.parseDouble(request.getParameter("salary"));
      String email=request.getParameter("email");
      
      Employee employee=new Employee(id,name,salary,email);
		
		dao.save(employee);
		
		request.getRequestDispatcher("findall").forward(request, response);
		writer.close();
		
	}
	

}
