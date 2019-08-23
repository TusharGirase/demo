package com.example.demo;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class ClassForTestSonacubeTest {

	@Test
	public void test1() {
		ClassForTestSonacube classToTest = new ClassForTestSonacube();
		boolean result = classToTest.getBool("Tush");
		assertTrue(result);
	}

}
