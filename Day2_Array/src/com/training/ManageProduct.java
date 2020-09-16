package com.training;

public class ManageProduct {
	
	//Example for IF-ELSE
	
	public Product[] calculateDiscount(Product[] productlist) {
		
		double discount = 0.0;
	for(int i=0;i<productlist.length;i++) {	
		if(productlist[i].getRatePerUnit()>500 && productlist[i].getRatePerUnit()<= 1000) {
			
			discount = 0.10;
			productlist[i].setDiscount(discount);
		}
		else if(productlist[i].getRatePerUnit()>1000) {
			
			discount = 0.15;
			productlist[i].setDiscount(discount);
		}
			
	}
	  return productlist;
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
		public void showProductsLegacy(Product[] productList) {
			
			for(int i=0;i<productList.length;i++) {
				
				System.out.println("product :"+i+"=>"+productList[i].getProductName()+"discount"+productList[i].getDiscount()+"finalamount"+productList[i].getFinalamount());
			}
		}
		
		public void showProductForEach(Product[] productList) {
			
			for(Product eachProduct:productList) {
				
				System.out.println(eachProduct.getProductName()+"."+eachProduct.getRatePerUnit());
			}
		}
		
		public Product[] calculateFinalAmount(Product[] productlist) {
			double finalamount;
			
			for(int i=0;i<productlist.length;i++)
			{
				finalamount=((productlist[i].getRatePerUnit())*(productlist[i].getQuantity()))*(1-productlist[i].getDiscount());
				productlist[i].setFinalamount(finalamount);
			}
			return productlist;
			
			
		}
			
		}


