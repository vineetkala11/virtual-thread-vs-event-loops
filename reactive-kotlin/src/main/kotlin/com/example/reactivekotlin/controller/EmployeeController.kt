package com.example.reactivekotlin.controller

import com.example.reactivekotlin.model.Employee
import com.example.reactivekotlin.service.EmployeeService
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RestController
import reactor.core.publisher.Mono

@RestController
class EmployeeController(
    private val employeeService: EmployeeService
) {

    @GetMapping(value = ["/employee/{id}"])
    fun employee(@PathVariable id: String?): ResponseEntity<Mono<Employee>> {
        return ResponseEntity.ok()
            .body(employeeService.getData(id))
    }
}