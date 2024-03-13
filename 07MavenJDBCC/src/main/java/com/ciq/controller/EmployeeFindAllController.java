 package com.ciq.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.Dao.EmployeeDaoImpl;
import com.google.gson.Gson;
import com.model.Employee;





public class EmployeeFindAllController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		EmployeeDaoImpl dao=new EmployeeDaoImpl();
		//writing data in json
		List<Employee> gsonusage=new ArrayList<Employee>();
		gsonusage=dao.getemployees() ;//saving data in some ref
		Gson gson=new Gson();
		String userJson=gson.toJson(gsonusage);//that ref with data is stored in gson and we get the data in gson format
		request.setAttribute("gsnn", userJson);
		
		
		
		request.setAttribute("list", dao.getemployees());
		request.getRequestDispatcher("list-emp.jsp").forward(request, response);
		
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		doGet(request, response);
	}

}
