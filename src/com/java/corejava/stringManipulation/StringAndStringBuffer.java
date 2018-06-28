package com.java.corejava.stringManipulation;

public class StringAndStringBuffer {

	public static void main(String[] args) {

		// String is immutable
		
		String s = new String("Alam");

		System.out.println("Frist String: " + s);

		s.concat("shathi");

		System.out.println("After concat: " + s);
		
		
		System.out.println("******************************************************");
		

		// StringBuffer is mutable
		
		StringBuffer sb = new StringBuffer("prioty");

		System.out.println("Before Append: " + sb);

		sb.append("Ahonaf");

		System.out.println("After Append: " + sb);

	}

}
