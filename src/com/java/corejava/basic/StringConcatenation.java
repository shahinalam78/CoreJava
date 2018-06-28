package com.java.corejava.basic;

public class StringConcatenation {

	public static void main(String[] args) {
		
		// adding two String using +
		
		int x = 100;

		int y = 200;

		String a = "Hello";

		String b = "world";

		System.out.println(x + y);

		System.out.println(a + b + x + y); // Helloworld100200

		System.out.println(x + y + a + b);// 300Helloworld

		System.out.println(a + b + (x + y));// Helloworld300

	}

}
