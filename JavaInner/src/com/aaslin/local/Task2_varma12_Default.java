package com.aaslin.local;
class OuterClass2{
	class DefaultInnerClass {
	    void method4() {
	        System.out.println("Default method");
	    }
}
public static class Task2_varma12_Default {
public static void main(String args[]) {
	OuterClass2 outerdef = new OuterClass2();
	OuterClass2.DefaultInnerClass default_in1 = outerdef.new DefaultInnerClass();
	default_in1.method4();
}
}
}
