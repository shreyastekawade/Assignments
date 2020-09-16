package com.training;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Product tv=  new Product(1010, "LED TV", 23000.00,1,100,0,0);
		Product fridge = new Product(2014,"LG Fridge",600.00,2,200,0,0);
		ManageProduct mgr = new ManageProduct();
		//double discount = mgr.calculateDiscount(tv);
		//System.out.println("Discount :==>"+ discount);
		mgr.showNumbers();
		double tax=mgr.calculateTax(tv);
		System.out.println("Tax :==>"+ tax);
		Product[] productList = new Product[2];
		productList[0]=tv;
		productList[1]=fridge;
		Product[] productlist1 = new Product[2];
		productlist1 = mgr.calculateFinalAmount(mgr.calculateDiscount(productList));
		//mgr.showProductForEach(productlist1);
		mgr.showProductsLegacy(productlist1);
		

	}

}
