package com.homeloan.main.enquiry.serviceImpl;

import java.util.List;
import java.util.Optional;
import java.util.concurrent.ThreadLocalRandom;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.homeloan.main.enquiry.model.CibilCheck;
import com.homeloan.main.enquiry.model.UserEnquiry;
import com.homeloan.main.enquiry.repository.UserEnquiryRepository;
import com.homeloan.main.enquiry.service.UserEnquiryService;

@Service
public class UserEnquiryServiceImpl implements UserEnquiryService{

	@Autowired private UserEnquiryRepository enquiryRepository;

	@Override
	public String saveUserEnquiry(UserEnquiry userenquiry) {
		enquiryRepository.save(userenquiry);
		return "Saved";
		
	}

	@Override
	public List<UserEnquiry> getuserenquiry() {

		return enquiryRepository.findAll();
	}
		
	

	

	
}
