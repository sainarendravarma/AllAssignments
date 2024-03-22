package com.aaslin.march21.first;

/*
 * Author : Narendra
 * Engineer class with setter and getter methods and @Overridden calculateBonus()
 */
public class Engineer extends Manager {
	private String engineerName;
	private double enginnerSalary;

	public String getEngineerName() {
		return engineerName;
	}

	public void setEngineerName(String engineerName) {
		this.engineerName = engineerName;
	}

	public double getEnginnerSalary() {
		return enginnerSalary;
	}

	public void setEnginnerSalary(double enginnerSalary) {
		this.enginnerSalary = enginnerSalary;
	}

	@Override
	public double calculateBonus() {
		System.out.print(engineerName + "got bunus of ");
		return (enginnerSalary / 100) * 5;
	}
}
