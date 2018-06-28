package com.java.corejava.oop1;

public class MethodOverloding {

	public static void main(String[] args) {

		MethodOverloding obj = new MethodOverloding();

		obj.test1(10);

		obj.test1(10, 20);

		obj.test1(10, 20, 30);

	}
	
	// main method is possible to overload 

	public static void main(int p) {

	}

	public static void main(int p, int q) {

	}

	// same method name but different parameter is called method overloading within same class
	
	public void test1(int x) {

	}

	public void test1(int x, int y) {

	}

	public void test1(int y, String x) {

	}

	public void test1(String x, int y) {

	}

	public void test1(int x, int y, int z) {

	}

}
