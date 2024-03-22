package com.aaslin.march21.first;

/*
 * Author : Narendra
 * Employee class with setter and getter methods and calculateBonus() returning 0;
 */
public class Employee {

	private String name;
	private double salary;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public double calculateBonus() {
		return 0;
	}
}
