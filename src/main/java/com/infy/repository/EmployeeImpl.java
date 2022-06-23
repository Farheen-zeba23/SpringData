package com.infy.repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.infy.dto.Employee;
@Repository
public class EmployeeImpl implements IEmployee{
	@PersistenceContext
	EntityManager em;

	@Override
      public Employee findEmp(int eno) {
		// TODO Auto-generated method stub
	   Employee e=em.find(Employee.class,eno);
		
		return e;
	}
	
	public boolean addEmp(Employee e) {
		em.persist(e);
	
		return true;
	}
	
}
