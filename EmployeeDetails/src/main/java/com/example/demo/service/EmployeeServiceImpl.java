package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.EmployeeDetails;
import com.example.demo.entity.EmployeeDetailsList;
import com.example.demo.helper.EmployeeUtil;
import com.example.demo.jpa.EmployeeRepository;

@Service
public class EmployeeServiceImpl implements EmployeeService {
	
	@Autowired
	private EmployeeRepository employeeRepository;

	@Override
	public void saveEmployeeDetails() {
		EmployeeDetailsList list = EmployeeUtil.saveEmpDetails();
		List<EmployeeDetails> saveEmpDetails = list.getList();
		for (EmployeeDetails details : saveEmpDetails) {
			employeeRepository.save(details);
		}
	}

	@Override
	public EmployeeDetailsList fetchAllEmpDetails() {
		EmployeeDetailsList list = new EmployeeDetailsList();
		saveEmployeeDetails();
		List<EmployeeDetails> lists = employeeRepository.findAll();
		list.setList(lists);
		return list;
	}

}