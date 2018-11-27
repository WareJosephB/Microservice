package com.gareth.business.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gareth.util.LetterGenerator;
import com.gareth.util.NumberGenerator;

@Service
public class AccountNumberService implements IAccountNumberService {

	@Autowired
	NumberGenerator numberGenerator;

	@Autowired
	LetterGenerator letterGenerator;

	public String generateAccountNumber() {
		return letterGenerator.letterGenerator() + numberGenerator.accountNumberGenerator();
	}
}
