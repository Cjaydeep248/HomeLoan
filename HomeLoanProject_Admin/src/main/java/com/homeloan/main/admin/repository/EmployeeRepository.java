package com.homeloan.main.admin.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import com.homeloan.main.admin.model.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer>{




}
