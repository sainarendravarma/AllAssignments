package com.aaslin.regular;

public class Outer {
	
public class Inner{
	
}
public static void main(String args[]) {
	Outer outer =new Outer();
	Outer.Inner inner = outer.new Inner();
}
}
