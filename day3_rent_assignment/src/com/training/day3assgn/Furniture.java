package com.training.day3assgn;

import com.training.ifaces.Rent;

public class Furniture implements Rent {
	private int quantity;
	private int days;
	private double ratePerunit;
	

	public Furniture(int quantity, int days, double ratePerunit) {
		super();
		this.quantity = quantity;
		this.days = days;
		this.ratePerunit = ratePerunit;
	}


	@Override
	public double getRent() {
		double rentFurniture=0.0;
		rentFurniture= this.quantity*this.days*this.ratePerunit;
		return rentFurniture;
	}

}
