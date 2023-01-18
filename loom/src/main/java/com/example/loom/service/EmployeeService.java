package com.example.loom.service;

import com.example.loom.model.Employee;
import com.example.loom.repository.EmployeeRepo;

import org.springframework.stereotype.Service;

@Service
public class EmployeeService {

	private final EmployeeRepo employeeRepo;

	public EmployeeService(EmployeeRepo employeeRepo) {
		this.employeeRepo = employeeRepo;
	}

	public Employee getData(String id) {
		return employeeRepo.findById(id);
	}
}
