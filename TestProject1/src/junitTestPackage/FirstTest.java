package junitTestPackage;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import TestPackage.TestClass1;

public class FirstTest {

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
	public void AdditionTest() {
		int outPut = class1.AddTwoNumbers(10, 20);
		assertEquals(30, outPut);
	}

}
