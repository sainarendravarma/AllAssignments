package com.aaslin.local;
import java.util.*;
class Outer {
	static class InnerExample{
		static int factorial(int number) {
			if (number == 0)    
			    return 1;    
			else 
			    return(number * factorial(number-1));
	}
}
}
class StaticInnerClass{
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		System.out.println("enter the number");
		int number = s.nextInt();
		//StaticInnerClass.InnerExample outer = new StaticInnerClass(number);
		Outer.InnerExample inner =new Outer.InnerExample();
			System.out.println(inner.factorial(number));
	}
}

