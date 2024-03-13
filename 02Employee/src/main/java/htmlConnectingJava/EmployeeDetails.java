package htmlConnectingJava;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class EmployeeDetails extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
     
		PrintWriter writer=resp.getWriter();
		
		int id=Integer.parseInt(req.getParameter("id"));
      String name=req.getParameter("name");
      String email=req.getParameter("email");
      double salary=Double.parseDouble(req.getParameter("salary"));
      //here we are connecting with html.file
//      writer.println(id);
//      writer.println(name);
//      writer.println(email);
//      writer.println(salary);
	
	//here we are connecting variables with model class
      EmployeeModelClass e=new EmployeeModelClass(id,name,email,salary);
     //or we can write EmployeeModelClass e=new EmployeeModelClass(1,"yamini","yamini@gmail.com",70000);
     
      System.out.println(e);
      writer.println(e);
      
	
	
	
	}
	

}
