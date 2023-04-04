package junitdemos;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class CalculatorTest {
	
	Calculator c1 = new Calculator();
@BeforeClass
public static void beforeClass () {
	System.out.println("BeforeClass");
}
@Before
public void before() {
	System.out.println("Before");
}
	@Test
	public void addTest() {
		assertEquals(30, c1.add(15, 15));
	}

	@Test
	public void divWithAETest() {

		try {
			c1.div(25, 0);
		}

		catch (Exception e) {
			assertTrue(e.getMessage().contains("by zero"));
		}
	}
	@After
	public  void after() {
	System.out.println("After");
}
	
@AfterClass
public static  void afterClass() {
	System.out.println("@AfterClass");
}
}