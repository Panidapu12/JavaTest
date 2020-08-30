package junitTestPackage;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import TestPackage.TestClass1;

public class SecondTest {

	public TestClass1 class1;
	@Before
	public void setUp() throws Exception {
		class1 = new TestClass1();
	}

	@After
	public void tearDown() throws Exception {
		class1 = null;
	}

	@Test
	public void MultiplicationTest() {
		int output = class1.MutliplyTwoNumbers(5, 6);
		assertEquals(15, output);
	}
	
	@Test
	public void DivisionTest()
	{
		int output = (int) class1.DivisionOperation(30, 5);
		assertEquals(6, output);
	}
	
	@Test
	public void SubtractionTest()
	{
		int output = class1.SubtractOperation(40, 20);
		assertEquals(10, output);
	}
	

}
