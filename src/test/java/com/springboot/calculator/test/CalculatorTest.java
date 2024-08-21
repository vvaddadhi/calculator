package com.springboot.calculator.test;



import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringRunner;

import com.springboot.calculator.enums.Operation;
import com.springboot.calculator.impl.CalculatorImpl;
import com.springboot.calculator.intf.Calculator;



@RunWith(SpringRunner.class)
public class CalculatorTest {
	
	private static final double DELTA = 1e-15;

	
	private Calculator calculator;
	@Before
	public void setUp() {
		this.calculator = new CalculatorImpl();
	}

	@Test
	public void testAdd() {

		assertEquals(12, calculator.calculate(Operation.ADD, 8, 4), DELTA);
		
	}

	@Test
	public void testSubtract() {
		
		assertEquals(12, calculator.calculate(Operation.SUBTRACT, 20, 8), DELTA);
	}

	@Test
	public void testMultiply() {
		assertEquals(100, calculator.calculate(Operation.MULTIPLY, 25, 4), DELTA);
	}

	@Test
	public void testDivide() {
		assertEquals(4, calculator.calculate(Operation.DIVIDE, 100, 25), DELTA);
	}
	

}
