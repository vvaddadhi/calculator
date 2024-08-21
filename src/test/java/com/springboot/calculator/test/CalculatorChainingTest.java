package com.springboot.calculator.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringRunner;

import com.springboot.calculator.exception.CalculatorException;
import com.springboot.calculator.impl.CalculatorChainingImpl;
import com.springboot.calculator.intf.CalculatorChaining;

@RunWith(SpringRunner.class)
public class CalculatorChainingTest {

	private CalculatorChaining calculatorChaining;
	private static final double DELTA = 1e-15;

	@Test
	public void testChaining1() {

		calculatorChaining = new CalculatorChainingImpl(10);

		calculatorChaining.add(5);
		calculatorChaining.subtract(7);

		assertEquals(8, calculatorChaining.getResult(), DELTA);

	}

	@Test
	public void testChainingMultiply() {
		calculatorChaining = new CalculatorChainingImpl(15);
		calculatorChaining.multiply(4);
		assertEquals(60, calculatorChaining.getResult(), DELTA);

	}
	
	@Test
	public void testChainingAddMultiply() {
		calculatorChaining = new CalculatorChainingImpl(5);
		calculatorChaining.add(3);
		calculatorChaining.multiply(2);
		assertEquals(16, calculatorChaining.getResult(), DELTA);
	}

	@Test
	public void testException() {
		calculatorChaining = new CalculatorChainingImpl(10);
		CalculatorException exception = assertThrows(CalculatorException.class, () -> {
			calculatorChaining.divide(0);
		});
		assertEquals("Division by zero is not allowed", exception.getErrorMessage());
	}

}
