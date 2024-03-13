package com.ciq.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class GenericServletimpl extends GenericServlet{

	@Override
	public void service(ServletRequest req, ServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		PrintWriter writer=resp.getWriter();
		writer.println("<h1 style='font:bold'>first do your thing then the god will see you</h1>");
		writer.println("<h2 style='color:green'>HOPE IS THE BEST CHOICE</h2>");
		writer.close();
		
	}

}
