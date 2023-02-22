package com.k7it;

public class Bike {

	int wheel;
	String name;
	double power;
	double engine;
	
	public double ccCapacity() {
		return (power*engine)/wheel;
	}
	
	public static void main (String arg[]) {
		Bike b1=new Bike();
		b1.wheel=2;
		b1.name="Honda";
		b1.power=150.5;
		b1.engine=645.5;
		System.out.println(b1.ccCapacity());
		
	}
	
 

}
