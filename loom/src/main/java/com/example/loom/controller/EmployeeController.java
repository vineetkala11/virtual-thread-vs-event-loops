package com.example.loom.controller;


import com.example.loom.model.Employee;
import com.example.loom.service.EmployeeService;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {

	private final EmployeeService employeeService;

	EmployeeController(EmployeeService employeeService) {
		this.employeeService = employeeService;
	}

	@GetMapping(value = "/employee/{id}")
	public ResponseEntity<Employee> employee(@PathVariable String id) {
		return ResponseEntity.ok()
				.body(employeeService.getData(id));

	}
}
