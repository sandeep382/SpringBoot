package com.example.demo.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class EmployeeDetails {

	@Id
	private Integer empId;
	private String empName;
	private String empAddress;
	private String empCompany;
	private String desg;

	public void setDesg(String desg) {
		this.desg = desg;
	}

	public String getDesg() {
		return desg;
	}

	public Integer getEmpId() {
		return empId;
	}

	public void setEmpId(Integer empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getEmpAddress() {
		return empAddress;
	}

	public void setEmpAddress(String empAddress) {
		this.empAddress = empAddress;
	}

	public String getEmpCompany() {
		return empCompany;
	}

	public void setEmpCompany(String empCompany) {
		this.empCompany = empCompany;
	}

}
