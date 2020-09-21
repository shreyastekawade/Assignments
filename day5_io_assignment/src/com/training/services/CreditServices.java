package com.training.services;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.util.*;


import com.training.model.CreditCard;

public class CreditServices {
	
	public boolean writeObject(CreditCard [] card)
	{
		boolean persisted = false;
		ObjectOutputStream outStream = null;
		
			try {
				outStream =	new ObjectOutputStream(new FileOutputStream(new File("cards.ser")));
				for(int i=0; i<2;i++)
				{
				outStream.writeObject(card[i]);
				persisted = true;
				}
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				System.err.println(e.getMessage());
			}
			finally {
				
				try {
					outStream.close();
				}catch(IOException e)
				{
					e.printStackTrace();
				}
			}
			return persisted;
	}
	
	
	public boolean writeObject(CreditCard [] card, String locationAndFormat)
	{
		boolean persisted = false;
		ObjectOutputStream outStream = null;
		
			try {
				outStream =	new ObjectOutputStream(new FileOutputStream(new File(locationAndFormat)));
				for(int i=0; i<2;i++)
				{
				outStream.writeObject(card[i]);
				persisted = true;
				}
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				System.err.println(e.getMessage());
			}
			finally {
				
				try {
					outStream.close();
				}catch(IOException e)
				{
					e.printStackTrace();
				}
			}
			return persisted;
	}
	
	
	
	public CreditCard[] readObject() {
		CreditCard [] cardList = new CreditCard[3];
		ObjectInputStream instream = null;
		
		try {
			instream = new ObjectInputStream(new FileInputStream(new File("cards.ser")));
			for(int i=0;i<2;i++ ) {
			cardList[i] = (CreditCard) instream.readObject();
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			try {
				instream.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return cardList;

}
	
	public CreditCard[] readObject(File file) {
		CreditCard [] cardList = new CreditCard[3];
		ObjectInputStream instream = null;
		
		try {
			instream = new ObjectInputStream(new FileInputStream(file));
			for(int i=0;i<2;i++ ) {
			cardList[i] = (CreditCard) instream.readObject();
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			try {
				instream.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return cardList;

}
	
	
	public void writeToFile(File file, CreditCard[] cust) {
		PrintWriter writer = null;
		try {
			 writer = new PrintWriter(new FileWriter(file, true));
			 for(int i=0;i<2;i++) {
			 writer.println(cust[i].toString());
			 }
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block 
			e.printStackTrace();
		}finally {
			
			writer.close();
		}
	}
	
	public void readfromFile(File file) {
		try {
			BufferedReader reader = new BufferedReader(new FileReader(file));
			String line = null;
			while((line = reader.readLine()) != null) {
				System.out.println(line);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			
		}
	}
	
	public CreditCard retrieveCard (String Name) {
		
		CreditCard [] cardList = new CreditCard[3];
		CreditCard  cardF = new CreditCard();
		ObjectInputStream instream = null;
		//ObjectOutputStream outStream = null;
		
		try {
			instream = new ObjectInputStream(new FileInputStream(new File("cards.ser")));
			//outStream =	new ObjectOutputStream(new FileOutputStream(new File("cards.ser")));
			for(int i=0;i<2;i++ ) {
			
			cardList[i] = (CreditCard) instream.readObject();
			if(cardList[i].getHolderName().equalsIgnoreCase(Name))
			{
				cardF = cardList[i];
			}
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			try {
				instream.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return cardF;
		
	}
	
	public void deleteCard (String deleteCard)
	{
		CreditCard [] cardList = new CreditCard[3];
		CreditCard  cardF = new CreditCard();
		ObjectInputStream instream = null;
		ObjectOutputStream outStream = null;
		
		try {
			instream = new ObjectInputStream(new FileInputStream(new File("cards.ser")));
			outStream =	new ObjectOutputStream(new FileOutputStream(new File("cards1.ser")));
			int flag=0;
			for(int i=0;i<2;i++ ) {
				//instream = new ObjectInputStream(new FileInputStream(new File("cards.ser")));
			cardList[i] = (CreditCard) instream.readObject();
			boolean result= (cardList[i].getHolderName()).equalsIgnoreCase(deleteCard);
			//System.out.println(result);
			if(!(result))
			{
				cardF = cardList[i];
				//System.out.println("1");
				//System.out.println(cardF);
				outStream.writeObject(cardF);
				
			}
			else {
				
				cardF=cardList[i];
				cardF.setCreditLimit(0);
				cardF.setCreditNumber(0);
				cardF.setHolderName(null);
				//System.out.println(cardF);
				outStream.writeObject(cardF);
				
				
			}
			}
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			try {
				instream.close();
				outStream.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		}
		
		
	}
	
	
	
	
	
	
}