package com.springboot.calculator.exception;

public class CalculatorException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	private final String errorMessage;
	private final String serviceCode;

	public CalculatorException(String serviceCode, String errorMessage) {

		this.serviceCode = serviceCode;
		this.errorMessage = errorMessage;
	}

	public String getErrorMessage() {
		return errorMessage;
	}

	public String getServiceCode() {
		return serviceCode;
	}

}
