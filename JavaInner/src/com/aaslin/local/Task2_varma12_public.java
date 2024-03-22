package com.aaslin.local;
class OuterClass {
public class PublicInnerClass {
    public void method1() {
    	
        System.out.println("Public method");
    }
}
}
class Task2_varma12_public{
	public static void main(String args[]) {
		OuterClass outer = new OuterClass();
		OuterClass.PublicInnerClass pub_in = outer.new PublicInnerClass();
		pub_in.method1();
	}
}






























