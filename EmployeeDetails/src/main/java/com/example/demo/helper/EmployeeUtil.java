package com.example.demo.helper;

import java.util.ArrayList;
import java.util.List;

import com.example.demo.entity.EmployeeDetails;
import com.example.demo.entity.EmployeeDetailsList;

public class EmployeeUtil {

	public static EmployeeDetailsList saveEmpDetails() {
		
		EmployeeDetailsList l = new EmployeeDetailsList();
		List<EmployeeDetails> list = new ArrayList<>();

		EmployeeDetails details = new EmployeeDetails();
		details.setEmpId(100);
		details.setEmpName("Sandeep");
		details.setEmpAddress("USA, Chicago");
		details.setEmpCompany("General Motors");
		details.setDesg("Developer");
		list.add(details);

		EmployeeDetails details1 = new EmployeeDetails();
		details1.setEmpId(101);
		details1.setEmpName("Rajesh");
		details1.setEmpAddress("USA, Mount prospect, Dempster");
		details1.setEmpCompany("General Motors pvt ltd");
		details1.setDesg("Lead");
		list.add(details1);

		EmployeeDetails details2 = new EmployeeDetails();
		details2.setEmpId(103);
		details2.setEmpName("Raj-kumar");
		details2.setEmpAddress("India, hyd");
		details2.setEmpCompany("Virtusa");
		details2.setDesg("Tester");
		list.add(details2);
		
		l.setList(list);

		return l;

	}

}
