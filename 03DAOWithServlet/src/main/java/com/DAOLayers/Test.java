package com.DAOLayers;

import com.modelClass.Employee;

public class Test {

	public static void main(String[] args) {

		EmployeeDaoimpl dao=new EmployeeDaoimpl();
		Employee e1= new Employee(100, "sahasra", 120000.00, "sahasrayamini@gmail.com");
	//	Employee e1= new Employee(2, "yamini", 500, null)
		dao.save(e1);
		
		
		
	}

}
