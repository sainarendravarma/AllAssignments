package com.aaslin.local;
class OuterClass1 {
	private class PrivateInnerClass {
	    private void method2() {
	        System.out.println("Private method ");
	    }
	}
}
class Task2_varma12_private{
	public static void main(String args[]) {
		OuterClass1 outer = new OuterClass1();
		OuterClass1.PrivateInnerClass private_in = outer.new PrivateInnerClass();
		private_in.method2();
	}
}