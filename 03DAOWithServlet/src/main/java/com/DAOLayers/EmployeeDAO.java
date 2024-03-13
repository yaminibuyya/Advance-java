package com.DAOLayers;

import java.util.List;

import com.modelClass.Employee;

public interface EmployeeDAO {
	void save (Employee employee);
	void update(Employee employee);
	List<Employee> getemployees();
	void delete(int id);
	Employee getByid(int id);
	

}
