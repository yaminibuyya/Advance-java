package htmlConnectingJava;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class NumbersAdding extends HttpServlet {
@Override
protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//       resp.setContentType("");
	int  num1= Integer.parseInt(req.getParameter("number1"));
	int num2= Integer.parseInt(req.getParameter("number2"));
	
	System.out.println(num1 +num2);
	PrintWriter writer = resp.getWriter();
	writer.println(num1+num2);
	
	






}

	}


