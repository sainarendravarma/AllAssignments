package com.aaslin.local;

public class Task6_varma12 {
	private String outerMessage = "outer class";
	
	public void displayOuterMessage() {
		System.out.println(outerMessage);
	}

	public InnerClass getInnerClass() {
		return new InnerClass();
	}

	public class InnerClass {
		private String innerMessage = "inner class";

		public void displayInnerMessage() {
			System.out.println(innerMessage);
		}
	}


	public static void main(String[] args) {
		Task6_varma12 outerObj = new Task6_varma12();
		outerObj.displayOuterMessage();
		InnerClass innerObj = outerObj.getInnerClass();
		innerObj.displayInnerMessage();
	}
}