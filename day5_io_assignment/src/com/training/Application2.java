package com.training;

import java.io.File;

import com.training.model.CreditCard;
import com.training.services.CreditServices;

public class Application2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CreditCard card1 = new CreditCard(1243,"Shreyas",1000);
		CreditCard card2 = new CreditCard(9999,"Rakesh",2000);
		//CreditCard card3 = new CreditCard(1000,"om",35);
		CreditCard cardF = new CreditCard();
		CreditCard [] cardList = new CreditCard[2];
		CreditCard [] cardList2 = new CreditCard[2];
		cardList[0]= card1;
		cardList[1] =card2;
		//cardList[2] = card3;
		
		CreditServices service = new CreditServices();
		boolean result = service.writeObject(cardList);
		if (result) {
			System.out.println("Book Persisted");
		}else {
			System.out.println("Error Check");
		}
		
		try {
			cardList2 = service.readObject();
			for(int i=0;i<2;i++) {
			System.out.println(cardList2[i]);
			//System.out.println("sadasda");
			}
		}catch(Exception e) {
			System.err.println(e.getMessage());
		}
		service.deleteCard("Shreyas");
		try {
			cardList2 = service.readObject(new File("cards1.ser"));
			for(int i=0;i<2;i++) {
			System.out.println(cardList2[i]);
			}
		}catch(Exception e) {
			System.err.println(e.getMessage());
		}
		service.writeToFile(new File("Cards.txt"), cardList);
		service.readfromFile(new File("Cards.txt"));
		cardF = service.retrieveCard("Shreyas");
		System.out.println(cardF);
		service.writeObject(cardList, "D:\\‪ca.ser");
	}

}
