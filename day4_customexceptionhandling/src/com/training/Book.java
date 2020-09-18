package com.training;

import com.training.exceptions.*;

public class Book {
	private int bookId;
	private String bookName;
	private String author;
	private int price;
	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Book(int bookId, String bookName, String author, int price) throws MyRangeException {
		super();
		this.bookId = bookId;
		this.bookName = bookName;
		this.author = author;
		if(price <100 || price>500)
		{
			throw new MyRangeException("Invalid Price");
		}
		else {
		this.price = price;
		}
	}
		
	@Override
	public String toString() {
		return "Book [bookId=" + bookId + ", bookName=" + bookName + ", author=" + author + ", price=" + price + "]";
	}
	public int getBookId() {
		return bookId;
	}
	public void setBookId(int bookId) {
		this.bookId = bookId;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		try {
			this.bookName.length();			
		} catch (NullPointerException e) {
			new MyCustomException("Book Name Empty", e);
		}
		this.bookName = bookName;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) throws MyRangeException {
		if(price<100 || price>500)
		{
			throw new MyRangeException("Price out of range!!");
		}
		this.price = price;
	}
	

}
