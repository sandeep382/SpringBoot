package com.example.exception;

public class CompanyNotFoundException extends RuntimeException {
	
	public CompanyNotFoundException(String message) {
		super(message);
	}

}
