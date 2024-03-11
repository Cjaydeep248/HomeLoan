package com.homeloan.main.enquiry.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.homeloan.main.enquiry.model.Cibil;

@Repository
public interface CibilRepository extends JpaRepository<Cibil, Integer>{

}
