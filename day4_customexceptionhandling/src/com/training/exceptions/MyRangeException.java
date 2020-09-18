package com.training.exceptions;

public class MyRangeException extends Exception {

	private String message;
	
	public MyRangeException(String message) {
		super();
		this.message = message;
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return "Exception = " + message ;
	}
	
	

}
