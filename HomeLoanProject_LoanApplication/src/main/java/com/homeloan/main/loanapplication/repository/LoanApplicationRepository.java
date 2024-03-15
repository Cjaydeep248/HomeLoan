package com.homeloan.main.loanapplication.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.homeloan.main.loanapplication.model.Customer;

@Repository
public interface LoanApplicationRepository extends JpaRepository<Customer, Integer>{

}
