package com.java.corejava.oop1;

public class Object {

	int age;
	double height;
	
	public static void main(String[] args){
		
		 // a reference variable
		// Object() object
		
		Object a = new Object();
		Object b = new Object();
		Object c = new Object();
		
		System.out.println(a.age = 40);
		System.out.println(a.height = 5.7);
		
		System.out.println("*****************");
		
		System.out.println(b.age = 32);
		System.out.println(b.height = 5.0);
		
		System.out.println("*****************");
		
		System.out.println(c.age = 25);
		System.out.println(c.height = 5.3);
		
		
		a=b;
		b=c;
		c=a;
		
		a.age = 20;
		
		System.out.println(a.age); // prithing 20
		
		a.age = 10;
		
		System.out.println(a.age); // printing 10
		
		System.out.println(c.age);
		
		
		
		
		
		
		
	}
}
