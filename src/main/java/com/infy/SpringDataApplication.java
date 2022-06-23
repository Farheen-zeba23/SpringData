package com.infy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.infy.dto.Employee;
import com.infy.service.EmployeeServiceImpl;

@SpringBootApplication
public class SpringDataApplication implements CommandLineRunner {
	@Autowired
	EmployeeServiceImpl service;
	
	
	public static void main(String[] args) {
		SpringApplication.run(SpringDataApplication.class, args);
		
		
		}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		//Employee e=service.findEmp(1);
		//System.out.println(e);
		addEmp();
		
	}
	
	public void addEmp() {
	Employee e=new Employee(2,"Hena","Hydrabad",40000);
	service.addEmp(e);
	
	
	
	
	
	}
	

}
