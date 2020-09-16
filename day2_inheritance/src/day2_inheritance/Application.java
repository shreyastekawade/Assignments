package day2_inheritance;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Insurance personA = new Insurance (1234,"RAM",23,100000);
		Insurance personB = new Insurance (4321,"RAM",46,100000);
		System.out.println("Premium Amount for personA is :="+ personA.calculatePremium());
		System.out.println("Premium Amount for personB is :="+ personB.calculatePremium());
	}

}
