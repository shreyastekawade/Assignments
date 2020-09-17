package com.training.day3assgn;

import com.training.ifaces.Rent;

public class Computer implements Rent {
	private int quantity;
	private int days;
	private double ratePerunit;
	
	

	public Computer() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Computer(int quantity, int days, double ratePerunit) {
		super();
		this.quantity = quantity;
		this.days = days;
		this.ratePerunit = ratePerunit;
	}


	@Override
	public double getRent() {
		double rentComputer=0.0;
		rentComputer= this.quantity*this.days*this.ratePerunit;
		System.out.println("Item : Computer");
		System.out.println("Quantity : "+ this.quantity);
		System.out.println("Days : "+this.days);
		System.out.println("Rate : "+this.ratePerunit);
		System.out.println("The rent is :=");
		return rentComputer;
	}

}
