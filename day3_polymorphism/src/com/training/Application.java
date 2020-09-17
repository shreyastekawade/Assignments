package com.training;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Lawyer rajesh = new Lawyer(49494, "Rajesh Khan","Supreme","B.L");
		Musician sharma = new Musician (23232, "Umesh","Tabla","Allahabad");
		Billing bill = new Billing();
		bill.printFees(sharma);
		bill.printFees(rajesh);

	}

}
