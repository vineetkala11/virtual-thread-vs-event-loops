package com.example.reactivejava.repository;

import java.time.Duration;

import com.example.reactivejava.model.Employee;
import reactor.core.publisher.Mono;

import org.springframework.stereotype.Service;

@Service
public class EmployeeRepo {
	public Mono<Employee> findEmployeeById(String id){
		return Mono.just(id)
				.delayElement(Duration.ofMillis(1000L))
				.map(Employee::new);
	}
}
