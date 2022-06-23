package com.infy.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.infy.dto.Employee;
import com.infy.repository.EmployeeImpl;
@Service
public class EmployeeServiceImpl implements IEmployeeService {
	@Autowired
	EmployeeImpl empDao;

	@Override
	public Employee findEmp(int eno) {
		// TODO Auto-generated method stub
		Employee e=empDao.findEmp(eno);
		return e;
	}

	

	public boolean addEmp(Employee e) {
		// TODO Auto-generated method stub
		empDao.addEmp(e);
		return true;
		

	}




	
}
