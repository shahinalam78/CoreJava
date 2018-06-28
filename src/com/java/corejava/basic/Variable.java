package com.java.corejava.basic;

public class Variable {

	// instance varibale / global variable
	// inside the class but outside of the method

	int x1 = 20;

	// staic variable
	// inside the class but outside the method and static

	static int x2 = 40;

	public static void main(String[] args) {

		// Local variable
		// inside the method

		int x = 10;
		 
		// if you call the instance variable inside the static method creating class object
		
		Variable var = new Variable();
		System.out.println(var.x1);
		
		// if you call static variable inside the method call directly by class name
		
		System.out.println("Static variable: " + x + "\n" + Variable.x2); // called concatanation
	}
	
	
	public void test(){
		
		System.out.println(x1); // called directly
		System.out.println(Variable.x2); // static 
	}
	
	public static void test1(){
		
		System.out.println(x2); // called directly if it is static method 
		
		Variable varr = new Variable(); 
		System.out.println(varr.x1); // creating object if it is instance variable on static area
		
	}

}
