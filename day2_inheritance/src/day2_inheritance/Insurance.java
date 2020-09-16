package day2_inheritance;

public class Insurance {
	private int policyNumber;
	private String policyHolderName;
	private int age;
	private double insuredAmount;
	
	public double calculatePremium(int age, double insuredAmount) {
		
		if(age>25)
		{
			return insuredAmount*0.7;
			
		}
		else
		{
			return insuredAmount*0.6;
			
		}
		
	}

	public Insurance() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Insurance(int policyNumber, String policyHolderName, int age, double insuredAmount) {
		super();
		this.policyNumber = policyNumber;
		this.policyHolderName = policyHolderName;
		this.age = age;
		this.insuredAmount = insuredAmount;
	}

	public int getPolicyNumber() {
		return policyNumber;
	}

	public void setPolicyNumber(int policyNumber) {
		this.policyNumber = policyNumber;
	}

	public String getPolicyHolderName() {
		return policyHolderName;
	}

	public void setPolicyHolderName(String policyHolderName) {
		this.policyHolderName = policyHolderName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getInsuredAmount() {
		return insuredAmount;
	}

	public void setInsuredAmount(double insuredAmount) {
		this.insuredAmount = insuredAmount;
	}
	
	

}
