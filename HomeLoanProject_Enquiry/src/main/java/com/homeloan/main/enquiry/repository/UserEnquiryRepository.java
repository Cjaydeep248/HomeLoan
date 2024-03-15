package com.homeloan.main.enquiry.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.homeloan.main.enquiry.model.CibilCheck;
import com.homeloan.main.enquiry.model.UserEnquiry;

@Repository
public interface UserEnquiryRepository extends JpaRepository<UserEnquiry, Integer>{

	//int save(int cibil);

//	void save(CibilCheck cibil);

}
