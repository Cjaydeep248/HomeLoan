package com.homeloan.main.admin.service;

import java.util.List;
import java.util.Optional;


import com.homeloan.main.admin.model.Employee;

public interface EmployeeService {

	public Employee saveEmployee(Employee employee);

	public List<Employee> getEmployee();

	public String deleteEmployee(int employeeId);

	

	
}
