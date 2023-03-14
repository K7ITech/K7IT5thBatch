package com.k7it.ArraysDimentions;

public class NumberPattern {

	public static void main(String[] args) {
		 int n = 100;

		    for (int i = 1; i < n; i++) {
		      for (int j = 1; j <= i; j++)
		        System.out.print(j);
		      System.out.println();
		    }
		    for (int i = n; i >= 0; i--) {
		      for (int j = 1; j <= i; j++)
		        System.out.print(j);
		      System.out.println();
		    }
		    System.out.println();

	}

}
