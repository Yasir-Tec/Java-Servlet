package com.demo.service;

import java.util.List;

import com.demo.model.Employee;

public interface EmpService {

	void addnewemp(Employee e);

	List<Employee> findAllEmployees();
	
	Employee getById(int empid);

	void modifyemp(Employee e);

	void deleteById(int empid);

}
