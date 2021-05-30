package com.vm.training.java.exceptionhabler;

public class ProductDidNotReceiveException extends Exception
{
	String message;

	public ProductDidNotReceiveException(String message) {
		super();
		this.message = message;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
}
