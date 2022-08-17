package com.example.demo.controller;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class GetEmpDetails {

	@GetMapping("/get")
	public ResponseEntity<EmployeeDetailsList> getEmpDetails() {
		RestTemplate restTemplate = new RestTemplate();
		HttpHeaders headers = new HttpHeaders();
		headers.set("id", "100");
		HttpEntity<Integer> entity = new HttpEntity<Integer>(headers);
		ResponseEntity<EmployeeDetailsList> exchange = restTemplate.exchange("http://localhost:1111/emp/details/90",
				HttpMethod.GET, entity, EmployeeDetailsList.class);
		EmployeeDetailsList body = exchange.getBody();
		System.out.println("data got fetched ");
		HttpStatus statusCode = exchange.getStatusCode();
		System.out.println("the status code is " + statusCode);
		return new ResponseEntity<EmployeeDetailsList>(body, HttpStatus.OK);

	}

}
