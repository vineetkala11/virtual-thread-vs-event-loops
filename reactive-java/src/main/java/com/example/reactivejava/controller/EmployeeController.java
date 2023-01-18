package com.example.reactivejava.controller;


import com.example.reactivejava.model.Employee;
import com.example.reactivejava.service.EmployeeService;
import reactor.core.publisher.Mono;

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
	public ResponseEntity<Mono<Employee>> employee(@PathVariable String id) {
		return ResponseEntity.ok()
				.body(employeeService.getData(id));

	}
}
