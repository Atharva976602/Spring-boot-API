package com.service;

import java.util.HashSet;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.EmployeeDao;
import com.model.Employee;

@Service
public class EmployeeService {

	private EmployeeDao dao;

	@Autowired
	public EmployeeService(EmployeeDao dao) {
		super();
		this.dao = dao;
	}

	public String addData(Employee employee) {
		String msg = dao.addData(employee);

		return msg;
	}

	public Object getEmployee(String name) {
		Object emp = dao.getEmployee(name);
		return emp;
	}

	public HashSet<Employee> getAllEmployees() {
		HashSet<Employee> set = dao.getAllEmployees();
		return set;
	}

	public Object deleteEmployee(int id) {
		Object obj = dao.deleteEmployee(id);
		if (obj != null) {
			return "object not found found for his id........";
		}
		return obj;
	}

	public Object updateEmployeebyId(int id, Employee emp) {
		Object obj = dao.updateEmployeebyId(id, emp);
		return obj;
	}

}
