package com.training.entity;

public class Doctor {
	private String docName;

	public Doctor() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Doctor(String docName) {
		super();
		this.docName = docName;
	}

	@Override
	public String toString() {
		return "Doctor [docName=" + docName + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((docName == null) ? 0 : docName.hashCode());
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
		Doctor other = (Doctor) obj;
		if (docName == null) {
			if (other.docName != null)
				return false;
		} else if (!docName.equals(other.docName))
			return false;
		return true;
	}

	public String getDocName() {
		return docName;
	}

	public void setDocName(String docName) {
		this.docName = docName;
	}
	

}
