package com.aaslin.local;
//nested interfces
interface shape{
	interface drawable{
		public void draw();
	}
}
class Circle implements shape.drawable{
	public void draw() {
		System.out.println("this is circle");
	}
}
class Rectangle implements shape.drawable{
	public void draw() {
		System.out.println("this is rectangle");

	}
}
public class Task7_varma_nes {
public static void main(String args[]) {
	shape.drawable c =new Circle();
	shape.drawable r =new Rectangle();
	c.draw();
	r.draw();
}
}
