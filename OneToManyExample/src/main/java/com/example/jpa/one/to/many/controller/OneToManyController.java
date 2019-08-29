package com.example.jpa.one.to.many.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.jpa.one.to.many.entity.Employee;
import com.example.jpa.one.to.many.service.EmployeeService;
@Component
@RestController
public class OneToManyController {
	@Autowired
	EmployeeService employeeService;

	
	@GetMapping(value = "/onetomany")
	public String Hello() {
		return "Hello";
	}
	@GetMapping("/getValues")
	public String Hai() {
		return "Hai";
	}
	
	@GetMapping(value = "/getEmployeeDetails")
	public List<Employee> getEmployeeDetails() {
		return employeeService.getEmployeeDetails();
	}
	
}
