package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.EmployeeDetails;
import com.example.demo.entity.EmployeeDetailsList;
import com.example.demo.service.EmployeeService;

@RestController
public class EmployeeController {

	@Autowired
	private EmployeeService empService;

	@GetMapping(value = "/emp/details/{id}")
	public ResponseEntity<EmployeeDetailsList> getEmployeeDetails(@PathVariable Integer id) {
		System.err.println("the given id is " + id);
		EmployeeDetailsList fetchAllEmpDetails = empService.fetchAllEmpDetails();
		return new ResponseEntity<EmployeeDetailsList>(fetchAllEmpDetails, HttpStatus.OK);
	}

}
