package day2_inheritance;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		VehicleInsurance vehicleA = new VehicleInsurance (123479,"RAM",1,100000,2,2019,20000);
		VehicleInsurance vehicleB = new VehicleInsurance (432011,"RAMESH",4,100000,2,2020,20000);
		VehicleInsurance vehicleC = new VehicleInsurance (432146,"RAKESH",1,100000,4,2020,20000);
		VehicleInsurance vehicleD = new VehicleInsurance (43210,"RADHA",4,100000,4,2020,20000);
		System.out.println("Premium Amount for vehicleA is :="+ vehicleA.calculatePremium());
		System.out.println("Premium Amount for vehicleB is :="+ vehicleB.calculatePremium());
		System.out.println("Premium Amount for vehicleC is :="+ vehicleC.calculatePremium());
		System.out.println("Premium Amount for vehicleD is :="+ vehicleD.calculatePremium());
	}

}
