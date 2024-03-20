package com.homeloan.main.loanapplication.serviceimpl;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.homeloan.main.loanapplication.model.Customer;
import com.homeloan.main.loanapplication.model.CustomerDocument;
import com.homeloan.main.loanapplication.repository.LoanApplicationRepository;
import com.homeloan.main.loanapplication.service.LoanApplicationService;
@Service
public class LoanApplicationServiceImpl implements LoanApplicationService{

	@Autowired private LoanApplicationRepository loanapplicationrepository;
	
	@Override
<<<<<<< HEAD
	public Customer saveCustomerDetails(String customerDetails, String adhar, String pan, String passbook, String income, String photo) throws Exception {
	    ObjectMapper mapper = new ObjectMapper();
	    Customer c = mapper.readValue(customerDetails, Customer.class);
	    CustomerDocument cd = new CustomerDocument();
	    try {
	        cd.setAdharCard(adhar.getBytes());
	        cd.setPanCard(pan.getBytes());
	        cd.setBankPassbook(passbook.getBytes());
	        cd.setCustomerPhoto(photo.getBytes());
	        cd.setIncomeCertificate(income.getBytes());
	        c.setDocument(cd);
	        return loanapplicationrepository.save(c);
	    } catch (Exception e) {
	        e.printStackTrace();
	    }
	    return c;
=======
	public Customer saveCustomerDetails(String customerDetails, MultipartFile adhar, MultipartFile pan,
			MultipartFile passbook, MultipartFile income, MultipartFile photo) throws Exception 
	{
		
		ObjectMapper mapper=new ObjectMapper();
		Customer c=mapper.readValue(customerDetails, Customer.class);
		CustomerDocument cd = new CustomerDocument(); 
		try
		{
			cd.setAdharCard(adhar.getBytes());
			cd.setPanCard(pan.getBytes());
			cd.setBankPassbook(passbook.getBytes());
			cd.setCustomerPhoto(photo.getBytes());
			cd.setIncomeCertificate(income.getBytes());
			c.setDocument(cd);
			return loanapplicationrepository.save(c);
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		return c;
		
>>>>>>> branch 'Trupti' of https://github.com/Cjaydeep248/HomeLoan.git
	}

	@Override
	public List<Customer> getAllCustomerData() {
		
		return loanapplicationrepository.findAll();
	}

}
