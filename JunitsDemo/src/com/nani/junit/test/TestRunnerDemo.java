package com.nani.junit.test;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
 
public class TestRunnerDemo {

	static int add(int...n) {
	int sum=0;
	for(int i =0;i<n.length;i++)
	{
		sum=sum+n[i];	
	}
	return sum;
	}
	
	public static void main(String[] args) {
		System.out.println("adding :"+add(1,2,3,4,5));
		Result result = JUnitCore.runClasses(CalculatorCalTest.class,DemoTest.class);
		
		System.out.println("ending  junit test with  count:"+ result.getRunCount());
		System.out.println("with  success status:"+result.wasSuccessful());
	
		System.out.println("failure tests count:"+result.getFailureCount());
		System.out.println("failure tests:"+result.getFailures());
	}
	}


