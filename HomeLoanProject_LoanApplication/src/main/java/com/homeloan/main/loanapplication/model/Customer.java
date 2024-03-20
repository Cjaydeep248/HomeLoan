package com.homeloan.main.loanapplication.model;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Customer {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int customerId;
	private String customerName;
	private String address;
	@Column(unique = true)
	private long mobileNo;
	@Column(unique = true)	
	private String email;
	@Column(unique = true)
<<<<<<< HEAD
	private String username;
=======
	private String userName;
>>>>>>> branch 'Trupti' of https://github.com/Cjaydeep248/HomeLoan.git
	private String password;
	   @OneToOne(cascade = CascadeType.ALL)
	private Bank bank;
	     @OneToOne(cascade = CascadeType.ALL)
	private CustomerDocument document;

}
//{
//	"customerName":"Jaydeep",
//	"address":"pune",
//	"mobileNo":9878665577,
//	"email":"cjaydeep248@gmail.com",
//	"username":"jaydeep123",
//	"password":"jay@123"
//}
