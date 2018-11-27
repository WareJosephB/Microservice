package com.gareth.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gareth.business.service.IAccountNumberService;


@RestController
public class AccountNumberEndpoint {
	
	@Autowired
	IAccountNumberService service;
	
	
	@RequestMapping("${rest.baseURL}")
    public String accountNumber() {
		return service.generateAccountNumber();
    }
}
