package com.homeloan.main.eurekaserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;


@EnableEurekaServer
@SpringBootApplication
public class HomeLoanProjectEurekaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(HomeLoanProjectEurekaServerApplication.class, args);
	}

}
