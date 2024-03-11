package com.homeloan.main.enquiry.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class UserEnquiry {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int userEnquiryId;

	private String enquiryName;
	private String email;
	private String panCard;
	private long mobileNo;
	private String address;
	private String gender;
	private boolean enquiryStatus;
	@OneToOne
	private Cibil cibilCheck;

}
