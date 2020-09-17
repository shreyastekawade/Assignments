package com.training.day3assgn;

import com.training.ifaces.Rent;

public class Computer implements Rent {
	private int quantity;
	private int days;
	private double ratePerunit;
	

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
		return rentComputer;
	}

}
