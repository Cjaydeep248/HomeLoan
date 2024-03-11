package com.homeloan.main.enquiry.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.homeloan.main.enquiry.model.UserEnquiry;
import com.homeloan.main.enquiry.repository.UserEnquiryRepository;
import com.homeloan.main.enquiry.service.UserEnquiryService;

@Service
public class UserEnquiryServiceImpl implements UserEnquiryService{

	@Autowired private UserEnquiryRepository enquiryRepository;

	@Override
	public UserEnquiry saveUserEnquiry(UserEnquiry userenquiry) {
		return enquiryRepository.save(userenquiry);
		
	}

	@Override
	public List<UserEnquiry> getuserenquiry() {

		return enquiryRepository.findAll();
	}
}
