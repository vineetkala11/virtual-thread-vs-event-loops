package com.example.reactivekotlin.repository

import com.example.reactivekotlin.model.Employee
import org.springframework.stereotype.Service
import reactor.core.publisher.Mono
import reactor.kotlin.core.publisher.toMono
import java.time.Duration

@Service
class EmployeeRepo {

    fun findEmployeeById(id: String?): Mono<Employee> {
        return id.toMono()
            .delayElement(Duration.ofMillis(1000L))
            .map { Employee(id, "vineet") }
    }
}