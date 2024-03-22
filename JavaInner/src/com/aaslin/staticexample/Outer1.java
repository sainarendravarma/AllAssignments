package com.aaslin.staticexample;


public class Outer1 {
static class Inner{
	void m1() {
		System.out.println("this is the static inner classes or nested classes");
	}
}
public static void main(String args[]) {
	Outer1.Inner inner =  new Outer1.Inner();
	inner.m1();
}
}
