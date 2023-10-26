package com.example.reactivejava;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ReactiveJavaApplication {

	public static void main(String[] args) {
		System.out.println("Loading Reactive application ...");
		SpringApplication.run(ReactiveJavaApplication.class, args);
	}

}
