package com.java.corejava.basic;

import java.util.ArrayList;

public class Arraylist {
	
	// dynamic array 
	
	public static void main(String[]args){
		
		ArrayList<String> list = new ArrayList<String>();
		
		list.add("alam");
		
		list.add("shathi");
		
		list.add("prioty");
		
		list.add("ahonaf");
		
		list.add("alam");
		
		list.add("shathi");
		
		System.out.println(list);
		
		System.out.println(list.size()); // total size
		
		System.out.println(list.get(2)); // get value from index
		
		// print all the value from ArrayList
		
		for(int i = 0; i < list.size(); i++){
			
			System.out.println(list.get(i));
		}
		
		
	
		System.out.println(list.clone()); // clone the same list
		
		list.remove(5); // remove the of index 0
		
		System.out.println(list);
		
		list.clear(); // clear the list
		
		System.out.println(list);
		
		
	}

}
