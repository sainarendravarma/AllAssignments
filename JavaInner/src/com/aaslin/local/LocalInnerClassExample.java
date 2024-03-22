package com.aaslin.local;
import java.util.*;
public class LocalInnerClassExample{
	int number;
	LocalInnerClassExample(int number){
		this.number=number;
	}
	void message1() {
		class InnerExample{
			int cube(int number) {
				return (number*number*number);
			}
		}
		InnerExample inner = new InnerExample();
		System.out.println(inner.cube(number));
	}
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		System.out.println("eneter the number");
		int number=s.nextInt();
		LocalInnerClassExample outer = new LocalInnerClassExample(number);
		outer.message1();
	}
}
