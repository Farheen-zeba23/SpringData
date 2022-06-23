package com.infy.service;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.infy.dto.Employee;


@Transactional
public interface IEmployeeService {

	public Employee findEmp(int eno);


	public boolean addEmp(Employee e);

}