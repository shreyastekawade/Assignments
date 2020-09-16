package com.training;

public class ManageProduct {
	
	//Example for IF-ELSE
	
	public double calculateDiscount(Product product) {
		
		double discount = 0.0;
		
		if(product.getRatePerUnit()>500 && product.getRatePerUnit()<= 1000) {
			
			discount = 0.10;
		}
		else if(product.getRatePerUnit()>1000) {
			
			discount = 0.15;
		}
		
		return discount;
	}
	
	public void showNumbers() {
		
		for(int i=0 ; i<10 ;i++) {
			
			System.out.println("product");
		}
	}
		public int calculateTax (Product product) {
			
			int productType;
			int taxPercent;
			productType = product.getProductType();
			switch (productType) { 
			case 1:
				taxPercent = 5;
				return taxPercent;
			case 2:
				taxPercent = 5;
				return taxPercent;
			case 3:
				taxPercent = 5;
				return taxPercent;
			default:
				taxPercent = 28;
				return taxPercent;
			
		}
	}

}
