package com.training;

public class DonorDetails {
	private String donorName;
	private String bloodGroup;
	private int donorAge;
	public DonorDetails() {
		super();
		// TODO Auto-generated constructor stub
	}
	public DonorDetails(String donorName, String bloodGroup, int donorAge) {
		super();
		this.donorName = donorName;
		this.bloodGroup = bloodGroup;
		this.donorAge = donorAge;
	}
	public String getDonorName() {
		return donorName;
	}
	public void setDonorName(String donorName) {
		this.donorName = donorName;
	}
	public String getBloodGroup() {
		return bloodGroup;
	}
	public void setBloodGroup(String bloodGroup) {
		this.bloodGroup = bloodGroup;
	}
	public int getDonorAge() {
		return donorAge;
	}
	public void setDonorAge(int donorAge) {
		this.donorAge = donorAge;
	}

}
