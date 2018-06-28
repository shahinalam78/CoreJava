package com.java.corejava.basic;

public class Looping {

	// same kind of work if need over over and over again we do looping 
	// like print 1 - 10 ; insted of print 10 time using for loop single line of code
	
	public static void main(String[] args) {

		// print 1-10

		// using for loop

		for (int i = 1; i <= 10; i++) {

		//	System.out.println(i);

		}

	//	System.out.println("*******************");

		// using while loop

		int i = 0;

		while (i < 10) {

			i++;

			//System.out.println(i);
		}

		System.out.println("*******************");
		
		
		// reverse for loop

		for (int j = 5; j >= 1; j--) {

			System.out.println(j);
		}
		
		System.out.println("*******************");
		
		int a = 2;
		
		int b = a++;
		
		int c = b--;
		
		//System.out.println(a);
		//System.out.println(b);
		//System.out.println(c);
	}

}
