package com.java.corejava.oop1;

public class Functions {

	public static void main(String[] args) {

		Functions obj = new Functions();
		obj.test();
		System.out.println(obj.test2(10, 20));
		
		System.out.println(test3(1000));
	}

	public void test() {

		System.out.println("print something");

	}

	public int test2(int x, int y) {
		int z = x + y;
		return z;
	}

	public static int test3(int x) {
		int z = x;
		return z;

	}

}
