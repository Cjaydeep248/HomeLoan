package com.homeloan.main.enquiry.model;

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
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class UserEnquiry {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int userEnquiryId;
    
	private String enquiryName;
	@Column(unique = true)
	private String email;
	@Column(unique = true)
	private String panCard;
	@Column(unique = true)
	private long mobileNo;
	private String address;
	private String gender;
	@OneToOne(cascade = CascadeType.ALL)
	private CibilCheck cibil;
	

}
