package com.homeloan.main.enquiry.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.homeloan.main.enquiry.model.UserEnquiry;
import com.homeloan.main.enquiry.service.UserEnquiryService;

@CrossOrigin("*")
@RestController
public class UserEnquiryController {

	@Autowired private UserEnquiryService userEnquiryService;
	
	@PostMapping("/saveenquiry")
	public ResponseEntity<UserEnquiry> saveenquiry(@RequestBody UserEnquiry userenquiry)
	{
		
	UserEnquiry userenq	=userEnquiryService.saveUserEnquiry(userenquiry);
		
		return new ResponseEntity<UserEnquiry>(userenquiry, HttpStatus.CREATED);
		
	}
	
	
	@GetMapping("/getuserenquiry")
	public ResponseEntity <List<UserEnquiry>> getuserdata()
	{
		List<UserEnquiry> getalluserequiry=userEnquiryService.getuserenquiry();
		return new ResponseEntity<List<UserEnquiry>>(getalluserequiry,HttpStatus.OK);
		
		
	}
}
