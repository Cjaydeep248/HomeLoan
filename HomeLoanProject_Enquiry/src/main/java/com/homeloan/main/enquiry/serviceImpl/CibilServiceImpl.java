package com.homeloan.main.enquiry.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.homeloan.main.enquiry.repository.CibilRepository;
import com.homeloan.main.enquiry.service.CibilService;

@Service
public class CibilServiceImpl implements CibilService{

	@Autowired private CibilRepository cibilRepository;
}
