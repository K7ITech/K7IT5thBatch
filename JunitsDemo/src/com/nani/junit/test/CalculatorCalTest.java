package com.nani.junit.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import com.nani.junit.CalculatorCal;

public class CalculatorCalTest {

	CalculatorCal c = new CalculatorCal();
	ExpectedException exceptionRule = ExpectedException.none();
	
	
	
	@BeforeClass
	public static void beforeClass() {
		System.out.println("@BeforeClass");
	}
	
	@Before
	public  void before() {
		System.out.println("@Before");
	}
	@Test
	public void addTest() {
		assertEquals(3 , c.add(1,1,1));	
	}
	
	@Test
	public void negativeCaseAddTest() {
		assertNotEquals(7, c.add(2,3,4));	
	}
	
	@Test
	public void divTest() {
		 
		assertEquals(5,c.div(10,2)); 
	}
	 
	@Test
	public void nagativedivTest() {
		 
		assertNotEquals(3,c.div(10,5)); 
    }
	
	@Test
	public void multipleTest() {
		 
		assertEquals(12,c.multiple(6,2)); 
    }
	
	@Test
	public void negativeMultipleTest() {
		 
		assertNotEquals(12,c.multiple(6,4)); 
    }
	
	@Test
	public void addSTest() {
		 
		assertEquals("nani",c.addS("na","ni")); 
    }
	
	@Test
	public void negativeaddSTest() {
		 
		assertNotEquals("nani",c.addS("nan","ni")); 
    }
	
	@Test
	public void modulsDTest() {
		 
		assertEquals(4,c.modulsD(10,6)); 
    }
	
	@Test
	public void divexeTest() {
		 try {
			 c.div(10,0);
		 }
		 catch(Exception e){
		assertTrue(e.getMessage().contains("by zero")); 
	}
	 
}
	@After
	public  void after() {
		System.out.println("@After");
	}
	

   @AfterClass
   public static void afterClass() {
		System.out.println("@AfterClass");
	}
   }
