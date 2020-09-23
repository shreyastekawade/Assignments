package com.training.entity;

public class Patient {
	private String patientName;
	private String bloodGroup;
	private int patientAge;
	public Patient() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Patient(String patientName, String bloodGroup, int patientAge) {
		super();
		this.patientName = patientName;
		this.bloodGroup = bloodGroup;
		this.patientAge = patientAge;
	}
	public String getPatientName() {
		return patientName;
	}
	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}
	public String getBloodGroup() {
		return bloodGroup;
	}
	public void setBloodGroup(String bloodGroup) {
		this.bloodGroup = bloodGroup;
	}
	public int getPatientAge() {
		return patientAge;
	}
	public void setPatientAge(int patientAge) {
		this.patientAge = patientAge;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((bloodGroup == null) ? 0 : bloodGroup.hashCode());
		result = prime * result + patientAge;
		result = prime * result + ((patientName == null) ? 0 : patientName.hashCode());
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
		Patient other = (Patient) obj;
		if (bloodGroup == null) {
			if (other.bloodGroup != null)
				return false;
		} else if (!bloodGroup.equals(other.bloodGroup))
			return false;
		if (patientAge != other.patientAge)
			return false;
		if (patientName == null) {
			if (other.patientName != null)
				return false;
		} else if (!patientName.equals(other.patientName))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Patient [patientName=" + patientName + ", bloodGroup=" + bloodGroup + ", patientAge=" + patientAge
				+ "]";
	}
	
}
