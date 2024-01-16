package com.demo.dao;

import java.util.List;

import com.demo.model.Employee;

public interface EmpDao {

	void insertnewEmp(Employee e);

	List<Employee> getAllEmployees();

	Employee findById(int empid);

	void updateById(Employee e);

	void removeById(int empid);

}
