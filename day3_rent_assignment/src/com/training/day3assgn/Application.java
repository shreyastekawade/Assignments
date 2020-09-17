package com.training.day3assgn;


import com.training.ifaces.Rent;

public class Application {

	public static void main(String[] args) {
		ShowRent cust1 = new ShowRent();
		for(int key=0; key<2;key++)
		{
		Rent selected = cust1.getProduct(key+1);
		if (selected == null) {
			
			
		}else {
			
			cust1.printRent(selected);
		}
		
		}
	}

}
