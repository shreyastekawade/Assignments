package com.training.model;

import java.io.Serializable;

public class CreditCard implements Serializable {
	private double creditNumber;
	private String holderName;
	private transient double creditLimit;
	public CreditCard() {
		super();
		// TODO Auto-generated constructor stub
	}
	public CreditCard(double creditNumber, String holderName, double creditLimit) {
		super();
		this.creditNumber = creditNumber;
		this.holderName = holderName;
		this.creditLimit = creditLimit;
	}
	public double getCreditNumber() {
		return creditNumber;
	}
	public void setCreditNumber(double creditNumber) {
		this.creditNumber = creditNumber;
	}
	public String getHolderName() {
		return holderName;
	}
	public void setHolderName(String holderName) {
		this.holderName = holderName;
	}
	public double getCreditLimit() {
		return creditLimit;
	}
	public void setCreditLimit(double creditLimit) {
		this.creditLimit = creditLimit;
	}
	@Override
	public String toString() {
		return "CreditCard [creditNumber=" + creditNumber + ", holderName=" + holderName + ", creditLimit="
				+ creditLimit + "]";
	}
	
	
	

}
