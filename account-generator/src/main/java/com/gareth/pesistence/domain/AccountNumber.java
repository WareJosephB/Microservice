package com.gareth.pesistence.domain;

public class AccountNumber {
	private String accountNumber;
	

	public AccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	@Override
	public String toString() {
		return "AccountNumber [accountNumber=" + accountNumber + "]";
	}
	
	
}
