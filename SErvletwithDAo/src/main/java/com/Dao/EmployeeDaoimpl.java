package com.Dao;

import java.util.ArrayList;
import java.util.List;

import com.pojo.Employee;

public class EmployeeDaoimpl implements EmployeeDao {
   private static List<Employee> employees=new ArrayList<Employee>() ;
   static {
	   employees.add(new Employee(1, "Adinarayana",300000.00, "yamini@gmsil.com"));
	   employees.add(new Employee(2,"sai",500000.00,"sai@gmail.com"));
	   employees.add(new Employee(3,"Krishna kumari",890000.00,"krshna kk@gmail.com"));
	   
   }
@Override
public void save(Employee e) {
      employees.add(e)	;
}
@Override
public List<Employee> getemployees() {

	
	
	
	return employees;
}
   
}
