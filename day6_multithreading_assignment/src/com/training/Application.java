package com.training;

import java.io.*;

public class Application {

	public static void main(String[] args) {
		Customer ram = new Customer("Ram", 1234, 20);
		Customer raj = new Customer("Raj", 4321, 33);
		Customer fileReader = new Customer();
		File file = new File("Customer.txt");
		Thread t1 = new Thread() {
			public void run() {
				fileReader.readfromFile(file);
				
				//raj.writeToFile(file);
			}
			
		};
		t1.start();
		
		Thread t2 = new Thread() {
			public void run() {
				ram.writeToFile(file);
			}
			
		};
		
		t2.start();

	}

}
