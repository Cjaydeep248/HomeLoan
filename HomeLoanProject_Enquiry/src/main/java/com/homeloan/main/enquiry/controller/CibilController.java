package com.homeloan.main.enquiry.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;

import com.homeloan.main.enquiry.service.CibilService;

@CrossOrigin("*")
@RestController
public class CibilController {

	@Autowired private CibilService cibilService;
}
