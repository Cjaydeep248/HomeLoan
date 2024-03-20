package com.homeloan.main.loanapplication.service;


import java.util.List;

import org.springframework.web.multipart.MultipartFile;

import com.homeloan.main.loanapplication.model.Customer;

public interface LoanApplicationService {

	public Customer saveCustomerDetails(String customerDetails, String adhar, String pan,
			String passbook, String income, String photo) throws Exception;

	public List<Customer> getAllCustomerData();

	

	
}
