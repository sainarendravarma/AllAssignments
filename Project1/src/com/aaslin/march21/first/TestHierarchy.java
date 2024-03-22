package com.aaslin.march21.first;

/*
 * Author : Narendra
 * instances of Manager and Engineer, setting their salaries, and calling the calculateBonus() 
 * method to ensure the correct bonus calculation.
 */
public class TestHierarchy {
	public static void main(String[] args) {
		Manager manager = new Manager();
		Engineer engineer = new Engineer();
		manager.setManagerName("murali");
		manager.setManagerSalary(300000);
		engineer.setEngineerName("varma");
		engineer.setEnginnerSalary(30000);
		double managerBonus = manager.calculateBonus();
		System.out.println(managerBonus);
		double engineerBonus = engineer.calculateBonus();
		System.out.println(engineerBonus);
	}
}
