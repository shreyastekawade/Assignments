package com.training;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		DonorDetails donorObj = new DonorDetails();
		donorObj.setBloodGroup("A+");
		donorObj.setDonorName("Ram");
		donorObj.setDonorAge(52);
		DonorDetails donor1Obj = new DonorDetails("Ramesh","B+",66);
		System.out.println(donor1Obj.getBloodGroup());
		System.out.println(donor1Obj.getDonorAge());
		System.out.println(donor1Obj.getDonorName());
		
	}

}
