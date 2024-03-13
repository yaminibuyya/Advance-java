package com.Dao;

import java.util.List;

import com.pojo.Employee;

public interface EmployeeDao {
	
	void save(Employee e);
	List<Employee> getemployees();
}
