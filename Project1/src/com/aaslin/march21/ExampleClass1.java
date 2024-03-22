package com.aaslin.march21;

import java.util.*;

/*
 * Author : Narendra
 * Pojo Equality: Create a Pojo(Plain Old Java Object) Shape.
 * Create a HashSet and store the unique Pojo in the application.
 * Use Override methods to do this.
 */

class Shape {
	private String shape;
	private int sides;

	Shape(String shape, int sides) {
		this.shape = shape;
		this.sides = sides;
	}

	public String getShape() {
		return shape;
	}

	public void setShape(String shape) {
		this.shape = shape;
	}

	public int getSides() {
		return sides;
	}

	public void setSides(int sides) {
		this.sides = sides;
	}

	/*
	 * hashCode(): The hashCode() method of the object being added is called to
	 * compute the hash code of the object. This hash code is used to determine the
	 * bucket where the element will be stored.
	 */
	@Override
	public int hashCode() {
		int result = sides + 6;
		result = 65 * result + sides;
		return result;
	}

	/*
	 * equals(): If there is already an element in the HashSet that has the same
	 * hash code as the object being added (a potential collision), the equals()
	 * method is invoked to determine if the two objects are equal. If they are
	 * considered equal according to the equals() method, the new element is not
	 * added to the set.
	 */
	@Override
	public boolean equals(Object o) {
		Shape s = (Shape) o;
		return sides == s.sides && shape.equals(s.shape);
	}

	@Override
	public String toString() {
		return shape + "	" + sides;

	}

}

public class ExampleClass1 {
	public static void main(String[] args) {
		HashSet<Shape> hash = new HashSet<Shape>();
		hash.add(new Shape("triangle", 2));
		hash.add(new Shape("rectangle", 4));
		hash.add(new Shape("pentagon", 5));
		hash.add(new Shape("circle", 9));
		hash.add(new Shape("circle", 9));
		for (Shape var : hash) {
			System.out.println(var);
		}
	}
}
