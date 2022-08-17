package com.example.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;

@ControllerAdvice
public class ExceptionHandler {

	@org.springframework.web.bind.annotation.ExceptionHandler({ CompanyNotFoundException.class,
			CompanyNotFoundExceptionTest.class })
	public ResponseEntity<String> handleException() {
		return new ResponseEntity<String>("Company not found", HttpStatus.BAD_REQUEST);
	}
}
