package com.aaslin.local;
import java.util.*;
public class Task1_varma12 {
void method1() {
	class Inner{
		int balance=10000;
		Scanner s=new Scanner(System.in);
		void message() {
			System.out.println("enter with draw amount");
			int withdraw=s.nextInt();
			if(withdraw<=balance) {
				balance=balance-withdraw;
				System.out.println("withdraw successfull :)");
				System.out.println("-->to check the balance enter 0 \n \n-->for exit enter any key");
				int des=s.nextInt();
				if(des==0) {
					System.out.println("balance amount is : "+balance);
				}
				else{
					System.out.println("transaction terminated");
				}}
			else {
				System.out.println("insufficient amount");
			}}}
	Inner i = new Inner();
	i.message();}
public static void main(String args[]){
	Task1_varma12 outer = new Task1_varma12();
	outer.method1();	}}
