package com.homeloan.main.admin.serviceimpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import com.homeloan.main.admin.model.Employee;
import com.homeloan.main.admin.repository.EmployeeRepository;
import com.homeloan.main.admin.service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService
{
	
	@Autowired EmployeeRepository er; 

	@Override
	public Employee saveEmployee(Employee employee) {
	return	er.save(employee);
		
	}

	@Override
	public List<Employee> getEmployee() {
		List<Employee> list= er.findAll();
		return list;
	}

	@Override
	public String deleteEmployee(int employeeId) {
		er.deleteById(employeeId);
		return "Data Deleted";
		
		
	}
	

	
}
