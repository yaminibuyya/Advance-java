package com.Dao;

import com.model.Employee;

public class Test { 
	public static void main (String[] args) {
		
	
   Employee employee1=new Employee(1,"sahasra",6000.00,"sahasra@gmail.com");
	
   EmployeeDaoImpl testimpl=new EmployeeDaoImpl();
   
   //testimpl.save(employee1);//for inserting values
   
  System.out.println( testimpl. getemployees());   //for getting all values
   
  Employee employee2=new Employee(1,"sahana",709000.00,"sahana@gmail.com");
  testimpl.update(employee2);//for updating values
	
  
  
		 EmployeeDaoImpl impl=new EmployeeDaoImpl();
		System.out.println( impl.getByid(1));
  
		
		
		EmployeeDaoImpl test=new EmployeeDaoImpl();
		test.delete(1);
		
}
}