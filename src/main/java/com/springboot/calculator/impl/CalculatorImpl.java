package com.springboot.calculator.impl;

import org.springframework.stereotype.Service;

import com.springboot.calculator.enums.Operation;
import com.springboot.calculator.intf.Calculator;

@Service
public class CalculatorImpl implements Calculator {


	@Override
	public double calculate(Operation op, double num1, double num2) {

		switch (op) {
		case ADD: {
			return num1 + num2;
		}
		case SUBTRACT: {
			return num1 - num2;
		}
		case MULTIPLY: {
			return num1 * num2;
		}
		case DIVIDE: {
			return num1 / num2;
		}
		default:
			throw new IllegalArgumentException("Unexpected value: " + op);
		}

	}
	

}
