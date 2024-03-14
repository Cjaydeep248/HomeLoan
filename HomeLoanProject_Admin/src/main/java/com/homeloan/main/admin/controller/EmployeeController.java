package com.homeloan.main.admin.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.homeloan.main.admin.model.Employee;
import com.homeloan.main.admin.service.EmployeeService;

@RestController
public class EmployeeController {
	
	@Autowired EmployeeService es;
	
	@PostMapping("/employee")
	public ResponseEntity<Employee> insert_Employee(@RequestBody Employee e)
	{
	  es.saveEmployee(e);
	  return new ResponseEntity<Employee>(HttpStatus.CREATED);
	}
	
	
	@GetMapping("/getemployee")
	public ResponseEntity<List<Employee>> get_Employee()
	{
	  List<Employee> list=es.getEmployee();
	  return new ResponseEntity<List<Employee>>(list,HttpStatus.OK);
	}
	
	
	@PutMapping("/update/{employeeId}")
	public ResponseEntity<Employee> Update_Employee(@RequestBody Employee e, @PathVariable int employeeId)
	{
		es.saveEmployee(e);
	  return new ResponseEntity<Employee>(HttpStatus.OK);
	}
	
	@DeleteMapping("/deleteEmployee/{employeeId}")
	public ResponseEntity<String> Delete_Employee(@PathVariable int employeeId)
	{
		es.deleteEmployee(employeeId);
		return new ResponseEntity<String>("Employee Deleted",HttpStatus.OK);
	}

	
	

	
	
	

}
