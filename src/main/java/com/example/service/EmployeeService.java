package com.example.service;

import java.util.List;
import com.example.entity.Employee;

public interface EmployeeService 
{
	String addEmployee(Employee employee);
	String deleteEmployee(String empId);
	List<Employee> displayAll();
	String updateEmployee(Employee employee);
	Employee displayById(String empId);
	
}