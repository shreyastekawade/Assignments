package com.training;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Product tv=  new Product(1010, "LED TV", 23000.00,1);
		ManageProduct mgr = new ManageProduct();
		double discount = mgr.calculateDiscount(tv);
		System.out.println("Discount :==>"+ discount);
		mgr.showNumbers();
		double tax=mgr.calculateTax(tv);
		System.out.println("Tax :==>"+ tax);
		

	}

}
