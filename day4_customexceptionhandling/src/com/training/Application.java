package com.training;
import com.training.exceptions.*;
public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BookService service= new BookService();
		int i=0;
		try {
			
			
			Book bk1 = new Book(12,"Ram","GOT",111);
			service.addBk(bk1, 1);
			Book bk2 = new Book(12,"Shyam","GOT021",111);
			service.addBk(bk2, 2);
			
			service.getOne(12);
			
			
			
			service.getAll(2);
			}
		catch(Exception e){
			System.err.println(e);
			}
		}

}
