package com.example.loom.repository;

import com.example.loom.model.Employee;

import org.springframework.stereotype.Service;

@Service
public class EmployeeRepo {

	public Employee findById(String id){
		try {
			Thread.sleep(1000L);
		}
		catch (InterruptedException e) {
			e.printStackTrace();
		}
		return new Employee(id);
	}
}
