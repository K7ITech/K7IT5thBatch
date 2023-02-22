package com.k7it;

public class Animal {
	
	int legs;
 static	String name;
	double height;
	double weight;
	
	public double runCapacity() {
		return (height*weight)/legs;
		
	}
	
	public static void main (String arg[]) {
		Animal a1=new Animal();
		a1.legs=2;
		name="Tiger";
		a1.height=3.5;
		a1.weight=35.5;
		System.out.println(a1.runCapacity());
		
	}

    }

