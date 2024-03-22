package com.aaslin.anonymous;
import java.util.*;
interface outer{
	void addition(int a,int b);
}
public class AnonymousExample {
public static void main(String args[]) {
	Scanner s =new Scanner(System.in);
	System.out.println("enter a and b values");
	int x=s.nextInt();
	int y = s.nextInt();
	 outer obj = new outer() {
		 public void addition(int a,int b){
			System.out.println("the addition is : "+(a+b));
		};
	 };
	 obj.addition(x,y);
}}
