package com.java.corejava.basic;

public class Array1 {

	public static void main(String[] args) {

		String name[] = { "alam", "ahonaf", "shathi", "shathi", "prioty", "alam" };

		for (String namee : name) {

			System.out.println(namee);
		}

		int[] x = new int[4];

		x[0] = 100;

		x[1] = 200;

		x[2] = 200;

		x[3] = 300;

		for (int i = 0; i <= x.length - 1; i++) {

			System.out.println(x[i]);
		}

		System.out.println(x[2]);
	}

}
