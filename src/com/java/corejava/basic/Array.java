package com.java.corejava.basic;

public class Array {

	public static void main(String[] args) {
		
		// static array
		// disadvantage of array:
		// 1. length is fixed .....to overcome this problem use collection
		// framework like ArrayList, HashTable, HashmMap
		// 2. Array only single type

		// how to print all values of Array >>> using for loop

		int i[] = new int[4];

		int[] j = { 100, 200, 300, 400, 500, 600 };
		
		for(int k = 0; k<= j.length -1; k++){
			
			System.out.println(j[k]);
			
		}

		String name[] = { "alam", "ahonaf", "prioty", "shathi" };

		for (String namee : name) {

			System.out.println(namee);
		}

		// Object Array: Store different type of data
		Object obj[] = new Object[4];

		Object objj[] = { 1, 12.0, "name", 23.0f, 'd' };

		System.out.println(objj[4]);

		i[0] = 10;

		i[1] = 20;

		i[2] = 30;

		i[3] = 30;

		// i[4] = 40; index out of bound expection

		// System.out.println(i[2]);

		// System.out.println(i[4]);

		// System.out.println(j[0]);

		// System.out.println(j[3]);

		// System.out.println(i.length);

		// System.out.println(j.length);

		for (int k = 0; k < j.length; k++) {

			System.out.println(j[k]);

		}

		System.out.println(name.length);

		System.out.println(name[1]);

		for (int z = 0; z < objj.length; z++) {

			System.out.println(objj[z]);

			int[] x = new int[4];

			x[0] = 1;

			x[1] = 2;

			x[2] = 3;

			x[3] = 4;

			System.out.println(x[1]);

			for (int k = 0; k <= x.length - 1; k++) {

				System.out.println(x[k]);
			}

		}

	}

}
