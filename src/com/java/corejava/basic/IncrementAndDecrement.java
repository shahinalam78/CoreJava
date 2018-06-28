package com.java.corejava.basic;

public class IncrementAndDecrement {
	
	public static void main(String[] args){
		
		int a = 1;
		int b = ++a; // pre increment
		
		//System.out.println(a); // 2
		//System.out.println(b); // 2
		
	
		int i = 1;
		int j = i++; // post increment
		
		//System.out.println(i); // 2
		//System.out.println(j);//1
		
		
		int x = 2;
		int y = --x; //pre decrement
		
		System.out.println(x);//1
		System.out.println(y);//1
		
		
		int g = -1;
		int h = g++;
		
		//System.out.println(g);//0
		//System.out.println(h);//-1
		
		
		int k = -5;
		int l = k--;
		
		//System.out.println(k);//-6
		//System.out.println(l);//-5
		
		
		int c = -5;
		int d = --c;
		
		//System.out.println(c);//-6
		//System.out.println(d);//-6

	}

}
