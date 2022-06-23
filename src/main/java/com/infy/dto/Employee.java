package com.infy.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="employee")
public class Employee {
	@Id
	@Column(name="eno")
	int empNo;
	@Column(name="ename")
	String empName;
	@Column(name="addr")
	String empAddress;
	@Column(name="sal")
	int empSal;
	
	public Employee() {
		super();

	}
	public Employee(int empNo, String empName, String empAddress, int empSal) {
		super();
		this.empNo = empNo;
		this.empName = empName;
		this.empAddress = empAddress;
		this.empSal = empSal;
	}
	public int getEmpNo() {
		return empNo;
	}
	public void setEmpNo(int empNo) {
		this.empNo = empNo;
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
	public int getEmpSal() {
		return empSal;
	}
	public void setEmpSal(int empSal) {
		this.empSal = empSal;
	}
	@Override
	public String toString() {
		return "Employee [empNo=" + empNo + ", empName=" + empName + ", empAddress=" + empAddress + ", empSal=" + empSal
				+ "]";
	}
	
	
	
	

}
