package com.training.day3assgn;



import com.training.ifaces.Rent;

public class ShowRent {
	
public Rent getProduct(int key) {
		
		switch (key) {
		case 1:
			return new Computer(20,30,5.5);
		case 2:
			return new Furniture(60,33,10.6);
		default:
			return null;
		}
	}

public void printRent(Rent polyRent) {
	
	System.out.println(polyRent.APPNAME);
	System.out.println("The rent is :=");
	System.out.println(polyRent.getRent());
}

}
