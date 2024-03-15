package com.homeloan.main.enquiry.service;

import java.util.List;
import java.util.Optional;
import java.util.concurrent.ThreadLocalRandom;

import com.homeloan.main.enquiry.model.CibilCheck;
import com.homeloan.main.enquiry.model.UserEnquiry;

public interface UserEnquiryService {

	public String saveUserEnquiry(UserEnquiry userenquiry);

	public List<UserEnquiry> getuserenquiry();

	

}
