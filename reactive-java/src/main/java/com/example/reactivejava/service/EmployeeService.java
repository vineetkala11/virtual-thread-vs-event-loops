package com.example.reactivejava.service;

import com.example.reactivejava.model.Employee;
import com.example.reactivejava.repository.EmployeeRepo;
import reactor.core.publisher.Mono;

import org.springframework.stereotype.Service;

@Service
public class EmployeeService {

	private final EmployeeRepo employeeRepo;

	EmployeeService(EmployeeRepo employeeRepo) {
		this.employeeRepo = employeeRepo;
	}

	public Mono<Employee> getData(String id) {
		return employeeRepo.findEmployeeById(id);
	}
}
