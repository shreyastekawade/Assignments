package com.training.ifaces;

public interface Automobile {
	//Following attribute is of type Public static final by default
	String APPNAME = "Quotation Generation System"; 
	
	//All the 3 methods are public and abstract by default to understand that we have added the same in different methods
	
	public abstract String getColor();
	public String getModel();
	double getPrice();

}
