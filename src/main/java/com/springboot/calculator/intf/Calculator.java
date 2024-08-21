package com.springboot.calculator.intf;

import com.springboot.calculator.enums.Operation;

public interface Calculator {
	
	public double calculate(Operation op, double num1, double num2);

}
