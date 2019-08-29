package com.example.jpa.one.to.many.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.jpa.one.to.many.entity.Employee;
import com.example.jpa.one.to.many.repository.EmployeeRepository;
@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	EmployeeRepository employeeRepository;


	@Override
	public List<Employee> getEmployeeDetails() {
		return (List<Employee>) employeeRepository.findAll();
	}


}
