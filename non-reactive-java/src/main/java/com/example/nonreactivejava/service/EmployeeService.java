package com.example.nonreactivejava.service;

import com.example.nonreactivejava.model.Employee;
import com.example.nonreactivejava.repository.EmployeeRepo;

import org.springframework.stereotype.Service;

@Service
public class EmployeeService {

	private final EmployeeRepo employeeRepo;

	public EmployeeService(EmployeeRepo employeeRepo) {
		this.employeeRepo = employeeRepo;
	}

	public Employee getData(String id) {
		return employeeRepo.findEmployeeById(id);
	}
}
