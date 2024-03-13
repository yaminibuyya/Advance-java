package com.implicit;

import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class implictobject
 */
public class implictobject extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		ServletContext context = request.getServletContext();
		context.setAttribute("app", "applicationScope");
		HttpSession session = request.getSession();
		session.setAttribute("season", "summer");
		request.getRequestDispatcher("imp-obj.jsp").forward(request, response);
		
		
		
		
	}

}
