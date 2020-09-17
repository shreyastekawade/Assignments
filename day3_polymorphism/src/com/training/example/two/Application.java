package com.training.example.two;

import com.training.ifaces.Automobile;
import java.util.*;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ch1=0;
		ShowRoom saiCars = new NewShowRoom();
		//int key = Integer.parseInt(args[0]);
		Scanner sck = new Scanner(System.in);
		do {
		System.out.println("Press 1 or 2 or 3");
		int key = sck.nextInt();
		//sck.close();
		Automobile selected = saiCars.getProduct(key);
		if(selected == null) {
			
			System.out.println("Invalid Input- Choose 1 or 2 or 3");
		}
		else {
		saiCars.printEstimate(selected);
		}
		//Scanner sc = new Scanner(System.in);
		System.out.println("Press 0 to exit and any number to continue");
		int ch= sck.nextInt();
		ch1 =ch;
		System.out.println(ch);
		}while(ch1 != 0);
		sck.close();
	}
	
	
	

}
