package com.homeloan.main.loanapplication;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class HomeLoanProjectLoanApplication {

	public static void main(String[] args) {
		SpringApplication.run(HomeLoanProjectLoanApplication.class, args);
	}

}
