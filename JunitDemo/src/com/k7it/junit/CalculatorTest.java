package com.k7it.junit;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.junit.Test;
import org.junit.rules.ExpectedException;

public class CalculatorTest {
	
	Calculator c1 = new Calculator();
	ExpectedException exceptionRules = ExpectedException.none();
	
	@Test
	
	public void addTest()
	{
		assertEquals(25, c1.add(10,15));
		
	}
	
	@Test
	public void negativeCaseAddTest() {
		assertNotEquals(25, c1.add(20,50));
	}
	

}
