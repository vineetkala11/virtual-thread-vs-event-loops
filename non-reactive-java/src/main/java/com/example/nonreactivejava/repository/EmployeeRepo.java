package com.example.nonreactivejava.repository;

import com.example.nonreactivejava.model.Employee;

import org.springframework.stereotype.Service;

@Service
public class EmployeeRepo {
	public Employee findEmployeeById(String id){
		try {
			Thread.sleep(1000L);
		}
		catch (InterruptedException e) {
			e.printStackTrace();
		}
		return new Employee(id);
	}
}
