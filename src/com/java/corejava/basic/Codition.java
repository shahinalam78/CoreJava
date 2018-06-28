package com.java.corejava.basic;

public class Codition {
	
	public static void main(String[]args){
		
		int x = 20;
		
		int y = 20;
		
		int z = 100;
		
		if(x > y){ // if this condition is false then goto next ...otherwise not
			
			System.out.println("y is greater then x");
			
		} else if (x > y && z== 100){ // if this condition is false then goto next ...otherwise not
			
			System.out.println("Z is greater then x & y");
			
		} else if ((x >= y) || (z == 100)){
			
			System.out.println(" z is the highest number");
					
		} else { // if both condition are false then print this block
			
			System.out.println("Something else");
		}
	}
	
}
