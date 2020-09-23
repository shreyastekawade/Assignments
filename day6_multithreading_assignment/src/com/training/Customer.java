package com.training;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Reader;
import java.util.*;
public class Customer {
	private String custName;
	private int mobNo;
	private int age;
	
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}	

	public Customer(String custName, int mobNo, int age) {
		super();
		this.custName = custName;
		this.mobNo = mobNo;
		this.age = age;
	}
	
	@Override
	public String toString() {
		return "Customer [custName=" + custName + ", mobNo=" + mobNo + ", age=" + age + "]";
	}

	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((custName == null) ? 0 : custName.hashCode());
		result = prime * result + mobNo;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Customer other = (Customer) obj;
		if (age != other.age)
			return false;
		if (custName == null) {
			if (other.custName != null)
				return false;
		} else if (!custName.equals(other.custName))
			return false;
		if (mobNo != other.mobNo)
			return false;
		return true;
	}
	

	public String getCustName() {
		return custName;
	}

	public void setCustName(String custName) {
		this.custName = custName;
	}

	public int getMobNo() {
		return mobNo;
	}

	public void setMobNo(int mobNo) {
		this.mobNo = mobNo;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	

	public synchronized void writeToFile(File file) {
		PrintWriter writer = null;
		try {
			 writer = new PrintWriter(new FileWriter(file, true));
			 writer.println(this.toString());
			 notify();
			 
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
	
	public synchronized void readfromFile(File file) {
		
	
		if(file.length() == 0)
        {
            System.out.println("File is Empty!! Waiting for Write operation..\n");
                    
            try
            {
                wait();
            } 
            catch (Exception ex) {
                ex.getMessage();
            }
        }
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

}
