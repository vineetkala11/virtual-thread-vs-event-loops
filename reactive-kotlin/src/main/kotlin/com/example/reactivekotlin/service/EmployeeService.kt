package com.example.reactivekotlin.service

import com.example.reactivekotlin.model.Employee
import com.example.reactivekotlin.repository.EmployeeRepo
import org.springframework.stereotype.Service
import reactor.core.publisher.Mono

@Service
class EmployeeService(
    private val employeeRepo: EmployeeRepo
) {
    fun getData(id: String?): Mono<Employee> {
        return employeeRepo.findEmployeeById(id)
    }
}