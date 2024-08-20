package com.springboot.calculator.intf;

import com.springboot.calculator.enums.Operation;

public interface Calculator {
	
	public double calculate(Operation op, double num1, double num2);
	
	public double add(double num);
	
	public double subtract(double num);
	
	public double multiply(double num);
	
	public double divide(double num);
	
	public double getResult();

}
