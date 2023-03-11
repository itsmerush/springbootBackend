package com.example.demo.service.impl;

import org.springframework.stereotype.Service;

import com.example.demo.model.Employee;
import com.example.demo.repository.EmployeeRepository;
import com.example.demo.service.EmployeeService;


@Service
public class EmplyeeServiceImpl implements EmployeeService{
	
	
	
	private EmployeeRepository  employeeRepository;

	public EmplyeeServiceImpl(EmployeeRepository employeeRepository) {
		super();
		this.employeeRepository = employeeRepository;
	}

	@Override
	public Employee SaveEmployee(Employee employee) {
		// TODO Auto-generated method stub
		
		
		
		return employeeRepository.save(employee);
	}


}
