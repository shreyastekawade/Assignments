package day2_inheritance;

public class VehicleInsurance extends Insurance {
	private int vehicleModel;
	private int yearofManufacture;
	private int costofVehicle;
	
	
	
	public VehicleInsurance(int policyNumber,String policyHolderName, int age, double insuredAmount,int vehicleModel, int yearofManufacture, int costofVehicle) {
		super(policyNumber,policyHolderName,age,insuredAmount);
		this.vehicleModel = vehicleModel;
		this.yearofManufacture = yearofManufacture;
		this.costofVehicle = costofVehicle;
	}



	@Override
	public double calculatePremium() {
		// TODO Auto-generated method stub
		double premium=0;
		if(this.vehicleModel==2)
		{
			if((2020-this.yearofManufacture)<=2)
			{
				premium = this.costofVehicle*0.5;
			}
			else {
				
				premium = this.costofVehicle*0.6;
			}
		}
		else {
			
			if((2020-this.yearofManufacture)<=2)
			{
				premium = this.costofVehicle*0.4;
			}
			else {
				
				premium = this.costofVehicle*0.5;
			}
			
			
		}
		return premium;
	}
	

}
