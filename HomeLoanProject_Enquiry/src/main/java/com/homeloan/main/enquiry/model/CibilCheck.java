package com.homeloan.main.enquiry.model;

import org.springframework.stereotype.Component;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Component
public class CibilCheck {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int cibilId;
	private int cibilScore;
	private String cibilStatus;
	
	
	
	
	
}
