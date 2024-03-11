package com.homeloan.main.enquiry.service;

import java.util.List;

import com.homeloan.main.enquiry.model.UserEnquiry;

public interface UserEnquiryService {

	public UserEnquiry saveUserEnquiry(UserEnquiry userenquiry);

	public List<UserEnquiry> getuserenquiry();

}
