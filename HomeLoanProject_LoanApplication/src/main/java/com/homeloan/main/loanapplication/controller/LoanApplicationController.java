package com.homeloan.main.loanapplication.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.homeloan.main.loanapplication.model.Customer;
import com.homeloan.main.loanapplication.service.LoanApplicationService;

@CrossOrigin("*")
@RestController
public class LoanApplicationController {
	
	@Autowired private LoanApplicationService loanapplicationservice;
	
	@PostMapping("/saveCustomerDetails")
<<<<<<< HEAD
	public ResponseEntity<Customer> saveCustomerData(@RequestPart("customer") String customerDetails,
	                                                  @RequestPart("adhar") String adhar,
	                                                  @RequestPart("pan") String pan,
	                                                  @RequestPart("passbook") String passbook,
	                                                  @RequestPart("income") String income,
	                                                  @RequestPart("photo") String photo) throws Exception {
	    Customer list = loanapplicationservice.saveCustomerDetails(customerDetails, adhar, pan, passbook, income, photo);
	    return new ResponseEntity<Customer>(list, HttpStatus.OK);
	}

=======
	public ResponseEntity<Customer> saveCustomerData(@RequestPart ("customer") String customerDetails,
			                                       @RequestPart ("adharCard") MultipartFile adhar,
			                                       @RequestPart ("panCard") MultipartFile pan,
			                                       @RequestPart ("bankPassbook") MultipartFile passbook,
			                                       @RequestPart ("incomeCertificate") MultipartFile income,
			                                       @RequestPart ("customerPhoto") MultipartFile photo) throws Exception
	{
		Customer list=loanapplicationservice.saveCustomerDetails(customerDetails,adhar,pan,passbook,income,photo);
		return new ResponseEntity<Customer>(list,HttpStatus.OK);
	}
>>>>>>> branch 'Trupti' of https://github.com/Cjaydeep248/HomeLoan.git
	@GetMapping("/getCustomerDetails")
	public ResponseEntity<List<Customer>> getAllCustomerData()
	{
		List<Customer> list=loanapplicationservice.getAllCustomerData();
		return new ResponseEntity<List<Customer>>(list,HttpStatus.OK);
		
	}

}
