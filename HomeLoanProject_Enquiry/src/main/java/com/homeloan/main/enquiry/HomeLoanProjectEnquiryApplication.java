package com.homeloan.main.enquiry;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.client.RestTemplate;


@EnableDiscoveryClient
@SpringBootApplication
public class HomeLoanProjectEnquiryApplication {

	public static void main(String[] args) {
		SpringApplication.run(HomeLoanProjectEnquiryApplication.class, args);
	}
	
	

}
