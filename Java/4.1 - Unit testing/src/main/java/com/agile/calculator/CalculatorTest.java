package com.agile.calculator;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculatorTest {

	@Test
	public void testDivideMethod() {
		Calculator calculator = new Calculator();
		assertEquals(calculator.divide("8,2"), 4);
	}
	
	@Test
	public void testMultiplyMethod() {
		Calculator calculator = new Calculator();
		assertEquals(calculator.multiply("8,2"), 16);
	}
	
	@Test
	public void testSubtractionMethod() {
		Calculator calculator = new Calculator();
		assertEquals(calculator.subtract("8,2"), 6);
	}
	
	@Test(expected= ArithmeticException.class)
	public void testDivisionByZero() {
		Calculator calculator = new Calculator();
		calculator.divide("8,0");
	}
	
	@Test(expected=NullPointerException.class)
	public void testNullValue() {
		Calculator calculator = new Calculator();
		calculator.multiply(null);
	}
}
