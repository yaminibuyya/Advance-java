package com.ciq.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class ServletInterfaceimpl implements Servlet {

	@Override
	public void destroy() {
		System.out.println("destory");
	}

	@Override
	public ServletConfig getServletConfig() {
		return null;
	}

	@Override
	public String getServletInfo() {
		return null;
	}

	@Override
	public void init(ServletConfig arg0) throws ServletException {
		
	}

	@Override
	public void service(ServletRequest req, ServletResponse resp) throws ServletException, IOException {
		 resp.setContentType("text/html");
		 PrintWriter writer= resp.getWriter();
		 writer.println("Dont let any one to be make u r decisions");
		 writer.println("<br></br>");
		 writer.println("<h1 style='color:purple'>Dad Mom i love u</h1>");
		 writer.println(998);
		 writer.close();
	}
	

}
