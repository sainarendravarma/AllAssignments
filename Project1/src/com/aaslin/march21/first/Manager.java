package com.aaslin.march21.first;

/*
 * Author : Narendra
 * Manager class with setter and getter methods and @Overridden calculateBonus()
 */
public class Manager extends Employee {

	private String managerName;
	private double managerSalary;

	public String getManagerName() {
		return managerName;
	}

	public void setManagerName(String managerName) {
		this.managerName = managerName;
	}

	public double getManagerSalary() {
		return managerSalary;
	}

	public void setManagerSalary(double managerSalary) {
		this.managerSalary = managerSalary;
	}

	public double calculateBonus() {
		System.out.print(managerName + "got bonus of ");
		return (managerSalary / 100) * 10;
	}

}
