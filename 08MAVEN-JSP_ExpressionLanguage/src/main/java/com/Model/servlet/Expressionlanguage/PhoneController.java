package com.Model.servlet.Expressionlanguage;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class PhoneController
 */
public class PhoneController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	Phone p=new Phone("Iphone",90000,"RED");
	request.setAttribute("phonedata", p);
	request.getRequestDispatcher("phone.jsp").forward(request, response);
	
	
	}

	

}
