package com.homeloan.main.enquiry.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.homeloan.main.enquiry.service.MailEnquiryService;

@RestController
public class EnquiryMailController {
	
	@Autowired MailEnquiryService mailenquiryserive;
	
	@GetMapping("/sendmail/{userEnquiryId}")
	public ResponseEntity<String> EnquiryMail(@PathVariable int userEnquiryId)
	{
		
		mailenquiryserive.getmail(userEnquiryId);
		return new ResponseEntity<String>("Mail Send to the Enquiry Person",HttpStatus.OK);
		
	}

}
