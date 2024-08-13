package com.model;

import lombok.ToString;

@ToString
public class Employee {

	private int id;
	private String name;
	private int salary;
	private String Branch;

	public Employee() {
		// TODO Auto-generated constructor stub
	}

	public Employee(int id, String name, int salary, String branch) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		Branch = branch;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public String getBranch() {
		return Branch;
	}

	public void setBranch(String branch) {
		Branch = branch;
	}

}
