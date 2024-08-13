package com.dao;

import java.util.HashSet;

import org.springframework.stereotype.Repository;

import com.model.Employee;

@Repository
public class EmployeeDao {

	HashSet<Employee> h = new HashSet<Employee>();

	public EmployeeDao() {
		Employee emp1 = new Employee(122, "ram", 23456, "pune");
		Employee emp2 = new Employee(123, "radha", 25886, "pune");
		Employee emp3 = new Employee(124, "rani", 23456, "pune");
		Employee emp4 = new Employee(121, "sham", 78656, "mumbai");
		h.add(emp1);
		h.add(emp2);
		h.add(emp3);
		h.add(emp4);
	}

	public String addData(Employee employee) {
		h.add(employee);
		return "Data addd successfully...";
	}

	public Object getEmployee(String name) {

		for (Employee emp : h) {
			if (emp.getName().equals(name)) {
				return emp;
			}
		}
		return null;
	}

	public HashSet<Employee> getAllEmployees() {
		return h;
	}

	public Object deleteEmployee(int id) {
		for (Employee employee : h) {
			if (employee.getId() == id) {
				boolean isdeleted = h.remove(employee);
				return isdeleted;
			}
		}
		return "object not found";
	}

	public Object updateEmployeebyId(int id, Employee emp) {
		for (Employee e : h) {
			if (e.getId() == id) {
				e.setName(emp.getName());
				e.setSalary(emp.getSalary());
				e.setBranch(emp.getBranch());
				
				return "data updated successfully.....";
			}
		}
		return "data not found for this id !!!!";
	}
}
