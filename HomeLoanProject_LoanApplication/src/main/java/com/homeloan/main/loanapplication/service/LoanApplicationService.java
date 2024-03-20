package com.homeloan.main.loanapplication.service;


import java.util.List;

import org.springframework.web.multipart.MultipartFile;

import com.homeloan.main.loanapplication.model.Customer;

public interface LoanApplicationService {

<<<<<<< HEAD
	public Customer saveCustomerDetails(String customerDetails, String adhar, String pan,
			String passbook, String income, String photo) throws Exception;
=======
	public Customer saveCustomerDetails(String customerDetails, MultipartFile adhar, MultipartFile pan,
			MultipartFile passbook, MultipartFile income, MultipartFile photo) throws Exception;
>>>>>>> branch 'Trupti' of https://github.com/Cjaydeep248/HomeLoan.git

	public List<Customer> getAllCustomerData();

	

	
}
