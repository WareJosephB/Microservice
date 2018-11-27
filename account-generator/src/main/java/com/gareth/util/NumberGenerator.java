package com.gareth.util;

import org.springframework.stereotype.Component;

@Component
public class NumberGenerator {
	public String RandomNumberGenerator() {
		return Long.toString(System.currentTimeMillis() / 1000L);
	}
	
	public String accountNumberGenerator() {
	
				return RandomNumberGenerator().substring(4, 10);
		}
	
}
