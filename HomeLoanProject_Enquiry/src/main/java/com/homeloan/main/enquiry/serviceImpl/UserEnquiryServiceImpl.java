package com.homeloan.main.enquiry.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.homeloan.main.enquiry.repository.UserEnquiryRepository;
import com.homeloan.main.enquiry.service.UserEnquiryService;

@Service
public class UserEnquiryServiceImpl implements UserEnquiryService{

	@Autowired private UserEnquiryRepository enquiryRepository;
}
