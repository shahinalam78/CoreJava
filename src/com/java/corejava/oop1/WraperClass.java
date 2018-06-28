package com.java.corejava.oop1;

public class WraperClass {
	
	public static void main(String[] args){
		  
		// Wraper class is a machanium its convert Object into primitive and primitive into object
		
		// String to int
		
		String x = "100";
		
		int y = Integer.parseInt(x);
		
		System.out.println(y + 20);
		
		
		// String to double
		
		double z = Double.parseDouble(x);
		
		System.out.println(z + 200);
		 
		
		// int to String
		int s = 200;
		
		String n = String.valueOf(200); // "200"
		System.out.println(n + 20);
		
		
		// int is not purly number
		String d = "100A";
		
		int D = Integer.parseInt(d);
		
		System.out.println(d); // Exception NumberFormatException
		
	}

}
