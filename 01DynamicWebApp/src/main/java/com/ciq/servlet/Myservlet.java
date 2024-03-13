package com.ciq.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Myservlet extends HttpServlet {
 @Override
protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	 resp.setContentType("text/html");
	 PrintWriter writer= resp.getWriter();
	 writer.println("hi sahasra be strong");
	 writer.println("<br></br>");
	 writer.println("<h1 style='color:red'>Dad Mom i love u</h1>");
	 writer.println(143);
	 writer.close();
	 
	 
	 
	 
}
}
