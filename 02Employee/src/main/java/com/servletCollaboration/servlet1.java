package com.servletCollaboration;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class servlet1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
         
		
		PrintWriter writer=response.getWriter();
		writer.println("sahasra yamini");
		String msg=request.getParameter("msg");
		writer.println("-----------");
		
		//acheiving servletcollaboration by send redirect
		//response.sendRedirect("welcome.html");
		
		
		//acheiving servlet collaboration by req dispatch servlet  &  BY USING "INCLUDE"
//	RequestDispatcher dispatcher=request.getRequestDispatcher("welcome.html");
//	 dispatcher.include(request, response);
//	 
	 
		//acheiving servlet collaboration with SERVLET2 by  req dispatch servlet  &  BY USING "INCLUDE"
	       request.getRequestDispatcher("two").include(request, response);
	 
	       
	     //acheiving servlet collaboration with SERVLET2 by  req dispatch servlet  &  BY USING "FORWARD"
	     //  request.getRequestDispatcher("two").forward(request, response);
	
	}

}
