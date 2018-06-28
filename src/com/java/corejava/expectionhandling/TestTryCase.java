package com.java.corejava.expectionhandling;

public class TestTryCase {

	public static void main(String[] args) {

		try {

			int data = 70 / 0;
			
			System.out.println(data);

		} catch (ArithmeticException e) {

			System.out.println(e);
		}

		finally {

			System.out.println("Run rest of the code.....");

			System.out.println("Finally block will excute...");
		}

	}

}
