package com.training;

import java.util.NoSuchElementException;

public class BookService {
	  int iterator2=0;
	Book[] bkList = new Book[20];
	
	public void addBk(Book bk, int iterator) {
		
		bkList[iterator-1] = bk;
		iterator2=iterator;
	}
	
	public void getOne(int idBook)
	{
		for (int i=0; i<iterator2;i++)
		{
			if(bkList[i].getBookId() == idBook) {
				
				System.out.println(bkList[i].getBookName());
			}
			else {
				throw new NoSuchElementException();
			}
				
		}
	}
	public void getAll(int j)
	{
		for(int i=0;i<j;i++)
		{
		 System.out.println(bkList[i]);
		}
	}
	

}
