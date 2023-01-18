package com.example.reactivejava.model;

import java.io.Serializable;

public class Employee implements Serializable {

	public Employee(String id){
		this.id = id;
	}

	private String name = "vineet";
	private String id;

	public String getName() {
		return name;
	}

	public Employee setName(String name) {
		this.name = name;
		return this;
	}

	public String getId() {
		return id;
	}

	public Employee setId(String id) {
		this.id = id;
		return this;
	}

	@Override
	public String toString() {
		final StringBuilder sb = new StringBuilder("Employee{");
		sb.append("name='").append(name).append('\'');
		sb.append(", id='").append(id).append('\'');
		sb.append('}');
		return sb.toString();
	}
}
