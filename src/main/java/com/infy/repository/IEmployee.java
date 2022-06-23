package com.infy.repository;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.infy.dto.Employee;

public interface IEmployee {

	public Employee findEmp(int eno);
	
	public boolean addEmp(Employee e);

}
