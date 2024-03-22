package com.aaslin.march21.second;

public class MainProgram {
	public static void main(String[] args) {
		CustomMap<Integer, String> customMap = new CustomMap<Integer, String>();
		customMap.put(2, "dharma");
		customMap.put(4, "varma");
		customMap.put(2, "sasi");
		System.out.println("map values: " + customMap);
		System.out.println("get the value of 1: " + customMap.get(1));
		System.out.println("get the value of 2: " + customMap.get(2));
		System.out.println("get the value of 4: " + customMap.get(4));
	}
}
