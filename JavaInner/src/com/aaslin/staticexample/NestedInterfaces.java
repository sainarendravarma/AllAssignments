package com.aaslin.staticexample;
interface outer{
	interface inner{
		void message1();
	}
}
public class NestedInterfaces implements outer.inner{
public void message1() {
	System.out.println("this is nested interface body");
}
public static void main(String args[]) {
	outer.inner obj = new NestedInterfaces();
	obj.message1();
}
}
