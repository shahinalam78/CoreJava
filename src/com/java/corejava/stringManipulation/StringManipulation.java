package com.java.corejava.stringManipulation;

import java.util.Arrays;

public class StringManipulation {
	
	// try String manipulation as much as possible
	
	public static void main(String[] args) {

		String text = "This is a String";

		String text1 = "This is  String";

		System.out.println(text.charAt(1)); // charAt()

		System.out.println(text.length()); // length()

		System.out.println(text.trim()); // trim()

		System.out.println(text.contains("S")); // contains()

		System.out.println(text.contains("is")); // contains()

		System.out.println(text.substring(2)); // substring()

		System.out.println(text.substring(3, 8)); // substring()

		System.out.println(text.indexOf('a')); // indexof()

		System.out.println(text.indexOf("String"));// indexof()

		System.out.println(text.equals(text1)); // equals()

		System.out.println(text.equalsIgnoreCase(text1)); // equalsIgnorCase()

		char text3[] = text.toCharArray();

		System.out.println(Arrays.toString(text3)); // toCharArray()

	}

}
