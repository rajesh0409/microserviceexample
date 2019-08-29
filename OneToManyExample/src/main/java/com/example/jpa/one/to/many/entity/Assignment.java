
package com.example.jpa.one.to.many.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "assignment")
@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
public class Assignment implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long assigId;

	@Column(name = "name")
	private String name;

	@Column(name = "grade")
	private int grade;

	@ManyToOne(fetch = FetchType.LAZY, optional = false)
	@JoinColumn(name = "employee_id", nullable = false)
	@JsonIgnore
	private Employee employee;

	public Assignment() {
	}

	public Assignment(Long assigId,String name, int grade) {
		this.assigId = assigId;
		this.name = name;
		this.grade = grade;
	}

	public void setAssigId(Long assigId) {
		this.assigId = assigId;
	}

	public Long getAssigId() {
		return this.assigId;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return this.name;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}

	public int getGrade() {
		return this.grade;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	public Employee getEmployee() {
		return this.employee;
	}
}
