package com.java.corejava.basic;

public class ArrayTwoDim {

	public static void main(String[] args) {

		int x[][] = new int[3][5];

		System.out.println(x.length);// number of rows
		System.out.println(x[0].length); // number of cols

		int x1[][] = { { 10, 20, 30, 40, 50 }, { 100, 200, 300, 400, 500 }, { 1000, 2000, 3000, 4000, 5000 } };

		x[0][0] = 10;
		x[0][1] = 20;
		x[0][2] = 30;
		x[0][3] = 40;
		x[0][4] = 50;

		x[1][0] = 100;
		x[1][1] = 200;
		x[1][2] = 300;
		x[1][3] = 400;
		x[1][4] = 500;

		x[2][0] = 1000;
		x[2][1] = 2000;
		x[2][2] = 3000;
		x[2][3] = 4000;
		x[2][4] = 5000;

		// System.out.println(x[0][4]);

		// System.out.println(x[2][4]);

		// System.out.println(x[1][3]);

		for (int row = 0; row < x.length; row++) {

			for (int col = 0; col < x1[0].length; col++) {

				System.out.println(x1[row][col]);
			}
		}

		System.out.println(x1[1][3]);

	}
}
