package junitdemos;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;

public class TestRunnerDemo {
	static int add(int... n ){
		   
	     int sum =0;
	     for(int i =0;i < n.length;i++){
	     sum= sum+n[i];
	     }
	     return sum;
	   }
	public static void main(String[] args) {
		
		 System.out.println(add(10,20,30,40,50,60,70,80,10,20,30,40,50,60,70,80));
		 
			System.out.println("Starting junit test");
			Result result = JUnitCore.runClasses(CalculatorTest.class);
			
			System.out.println("ending  junit test with following count:"+ result.getRunCount()
			+", with follwing success stastus:"+result.wasSuccessful());
			
			// how to find the failure test cases:
			
			System.out.println("failure Tests count:"+result.getFailureCount());
			System.out.println("failure Tests:"+result.getFailures());
		
	}
}
