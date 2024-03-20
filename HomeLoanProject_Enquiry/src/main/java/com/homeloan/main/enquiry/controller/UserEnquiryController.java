package com.homeloan.main.enquiry.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.ThreadLocalRandom;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.homeloan.main.enquiry.model.CibilCheck;
import com.homeloan.main.enquiry.model.UserEnquiry;
import com.homeloan.main.enquiry.service.UserEnquiryService;

@CrossOrigin("*")
@RestController
public class UserEnquiryController {

	@Autowired
	private UserEnquiryService userEnquiryService;

	@PostMapping("/saveenquiry")
	public ResponseEntity<String> saveenquiry(@RequestBody UserEnquiry userenquiry) {

		userEnquiryService.saveUserEnquiry(userenquiry);

		return new ResponseEntity<String>("success", HttpStatus.CREATED);

	}

	@GetMapping("/getuserenquiry")
	public ResponseEntity<List<UserEnquiry>> getuserdata() {
		List<UserEnquiry> getalluserequiry = userEnquiryService.getuserenquiry();
		return new ResponseEntity<List<UserEnquiry>>(getalluserequiry, HttpStatus.OK);
	}

	@PutMapping("/updateCibil/{userEnquiryId}")
	public ResponseEntity<UserEnquiry> updateCibil(@PathVariable("userEnquiryId") int userEnquiryId,
			@RequestBody UserEnquiry userEnquiry) {
		int min = 500;
		int max = 750;
		int cibilscore = ThreadLocalRandom.current().nextInt(min, max + 1);
		userEnquiry.getCibil().setCibilScore(cibilscore);
		if (cibilscore >= 650 && cibilscore <= 950) {
			userEnquiry.getCibil().setCibilStatus("Approved");
		} else {
			userEnquiry.getCibil().setCibilStatus("Rejected");
		}
		userEnquiryService.saveUserEnquiry(userEnquiry);
		return new ResponseEntity<UserEnquiry>(userEnquiry, HttpStatus.OK);
	}

	@GetMapping("/getapproveddata")
	public ResponseEntity<List<UserEnquiry>> getApprovedUser() {
	    List<UserEnquiry> allUserEnquiries = userEnquiryService.getuserenquiry();
	    List<UserEnquiry> approvedUsers = new ArrayList<>();

	    for (UserEnquiry ue : allUserEnquiries) {
	        if (ue.getCibil().getCibilStatus().equals("Approved")) {
	            approvedUsers.add(ue);
	        }
	    }

	    if (!approvedUsers.isEmpty()) {
	        return new ResponseEntity<>(approvedUsers, HttpStatus.OK);
	    } else {
	        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
	    }
	}

	
	@GetMapping("/getRejectedUser")
	public ResponseEntity<List<UserEnquiry>> getRejectedUser() {
	    List<UserEnquiry> allUserEnquiries = userEnquiryService.getuserenquiry();
	    List<UserEnquiry> RejectUsers = new ArrayList<>();

	    for (UserEnquiry ue : allUserEnquiries) {
	        if (ue.getCibil().getCibilStatus().equals("Rejected")) {
	        	RejectUsers.add(ue);
	        }
	    }

	    if (!RejectUsers.isEmpty()) {
	        return new ResponseEntity<>(RejectUsers, HttpStatus.OK);
	    } else {
	        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
	    }
	}
}
