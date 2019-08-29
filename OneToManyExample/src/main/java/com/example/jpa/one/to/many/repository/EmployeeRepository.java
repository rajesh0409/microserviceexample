package com.example.jpa.one.to.many.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.jpa.one.to.many.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
