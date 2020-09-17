package com.training.day3assgn;
import java.util.*;

import com.training.ifaces.Rent;
public class ApplicationTest {

	public static void main(String[] args) {
		ShowRent cst1 = new ShowRent();
		int [] computerDetails = new int[3];
		int [] furnitureDetails = new int[3];
		System.out.println("Enter Computer Details");
		System.out.println("Enter No of Computers");
		System.out.println("Enter No of Days");
		System.out.println("Enter Rate of Rent per day");
		for(int i=0;i<computerDetails.length;i++)
		{
		Scanner sck = new Scanner(System.in);
		int input = sck.nextInt();
		computerDetails[i] = input; 
		//sck.close();
		
		}
		
		
		System.out.println("Enter Furniture Details");
		System.out.println("Enter No of Furniture");
		System.out.println("Enter No of Days");
		System.out.println("Enter Rate of Rent per day");
		for(int i=0;i<furnitureDetails.length;i++)
		{
		Scanner sck1 = new Scanner(System.in);
		int input = sck1.nextInt();
		furnitureDetails[i] = input; 
		//sck1.close();
		}
		for(int key=0; key<2;key++)
		{
			Rent selected = null;
			if(key==0)
			{
					 selected = cst1.getProduct(key+1,computerDetails[0],computerDetails[1],computerDetails[2]);
			}
			else
			{
					 selected = cst1.getProduct(key+1,furnitureDetails[0],furnitureDetails[1],furnitureDetails[2]);
			}
		
			if (selected == null) {
						System.out.println("Invalid Input");
						
					}else {
						
						cst1.printRent(selected);
					}
		
		}
		
	}

}
