package com.homeloan.main.enquiry.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.homeloan.main.enquiry.model.UserEnquiry;
import com.homeloan.main.enquiry.service.UserEnquiryService;

@CrossOrigin("*")
@RestController
public class UserEnquiryController {

	@Autowired private UserEnquiryService userEnquiryService;
	
	@PostMapping("/save")
	public ResponseEntity<UserEnquiry> saveenq(@RequestBody UserEnquiry us)
	{
		
		userEnquiryService.saveUserEnquiry(us);
		
		return null;
		
	}
}
