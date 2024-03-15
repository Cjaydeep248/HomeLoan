package com.homeloan.main.loanapplication.service;


import java.util.List;

import org.springframework.web.multipart.MultipartFile;

import com.homeloan.main.loanapplication.model.Customer;

public interface LoanApplicationService {

	public Customer saveCustomerDetails(String customerDetails, MultipartFile adhar, MultipartFile pan,
			MultipartFile passbook, MultipartFile income, MultipartFile photo) throws Exception;

	public List<Customer> getAllCustomerData();

	

	
}
