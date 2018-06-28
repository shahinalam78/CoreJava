package com.java.corejava.oop2;

public class MethodOverLoading {
	
	public static void main(String[] args){
		
	Bmw bmw = new Bmw();
	bmw.car();
	bmw.parent();
	bmw.child();
	
	
	Car car = new Car();
	car.car();
	

	
	// child calss object can be refer to the parent class reference variable is 
	//called the runtime polymorphisum / daynamic ploymorphisom
		
		// top casting 
		
		
		Car c = new Bmw();
		c.car();
		c.parent();
		
		
		// Down caosting is not pssible
	}
}



