package com.homeloan.main.loanapplication.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Bank {

	@Id
	private long accountNo;
	private String branchAddress;
	private String bankIFSC;

}
