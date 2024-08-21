package com.springboot.calculator.impl;

import com.springboot.calculator.exception.CalculatorException;
import com.springboot.calculator.intf.CalculatorChaining;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class CalculatorChainingImpl implements CalculatorChaining {
	
	private double result = 0;
	
	public CalculatorChainingImpl(double result) {
		this.result = result;
	}
	
	@Override
	public void add(double num) {
		result += num;
	}

	@Override
	public void subtract(double num) {
		result -= num;
	}

	@Override
	public void multiply(double num) {
		result *= num;
	}

	@Override
	public void divide(double num) {
		if(num == 0) {
			log.error("Division by zero is not allowed");
			throw new CalculatorException("400", "Division by zero is not allowed");
		}
 		result /= num;
	}

	@Override
	public double getResult() {
		return result;
	}
	

}
