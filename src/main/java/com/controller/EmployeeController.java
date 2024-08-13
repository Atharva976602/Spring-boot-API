package com.controller;

import java.util.HashSet;
import java.util.Iterator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.model.Employee;
import com.service.EmployeeService;

@RestController
public class EmployeeController {

	private EmployeeService service;

	@Autowired
	public EmployeeController(EmployeeService service) {
		super();
		this.service = service;
	}

	@PostMapping("/employee-add")
	public String addData(@RequestBody Employee employee) {
		String msg = service.addData(employee);
		return msg;
	}

	@GetMapping("/employee-get/{name}")
	public Object getEmployee(@PathVariable String name) {
		Object obj = service.getEmployee(name);
		return obj;
	}

	@GetMapping("/all-employees")
	public HashSet<Employee> getAllEmployees() {
		HashSet<Employee> set = service.getAllEmployees();
		return set;
	}

	@DeleteMapping("/delete-employee/")
	public Object getAllEmployees(@RequestParam int id) {
		Object obj = service.deleteEmployee(id);
		return obj;
	}

	@PutMapping("/update-employee/{id}")
	public Object updateEmployeebyId(@PathVariable int id, @RequestBody Employee emp) {
		Object obj = service.updateEmployeebyId(id, emp);
		return obj;
	}
}
