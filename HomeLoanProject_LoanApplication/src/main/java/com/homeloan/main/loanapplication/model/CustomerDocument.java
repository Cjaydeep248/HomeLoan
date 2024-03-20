package com.homeloan.main.loanapplication.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class CustomerDocument {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int documentId;
	@Lob
	@Column(length = 999999999)
	private byte[] adharCard;
	@Lob
	@Column(length = 999999999)
	private byte[] panCard;
	@Lob
	@Column(length = 999999999)
	private byte[] bankPassbook;
	@Lob
	@Column(length = 999999999)
	private byte[] incomeCertificate;
	@Lob
	@Column(length = 999999999)
	private byte[] customerPhoto;

}
