package com.training.day3assgn;



import com.training.ifaces.Rent;

public class ShowRent {
	
public Rent getProduct(int key,int quantity,int days,double rate) {
		
		switch (key) {
		case 1:
			return new Computer(quantity,days,rate);
		case 2:
			return new Furniture(quantity,days,rate);
		default:
			return null;
		}
	}

public void printRent(Rent polyRent) {
	
	System.out.println(polyRent.APPNAME);
	//System.out.println("The rent is :=");
	System.out.println(polyRent.getRent());
}

}
