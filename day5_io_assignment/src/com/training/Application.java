package com.training;

import com.training.model.CreditCard;
import com.training.services.CreditServices;

public class Application {
	
	
	CreditCard card1 = new CreditCard(1243,"Shreyas",1000);
	CreditCard card2 = new CreditCard(9999,"Rakesh",2000);
	CreditCard [] cardList = new CreditCard[2];
	cardList[0]= card1;
	cardList[1] =card2;
	
	CreditServices service = new CreditServices();
	boolean result = service.writeObject(cardList);
	if (result) {
		System.out.println("Book Persisted");
	}else {
		System.out.println("Error Check");
	}

}
