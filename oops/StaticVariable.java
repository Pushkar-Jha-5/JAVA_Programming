package oops;

class LoanApp{
	// static variable
	static float rateOfInterest = 9.5f;
}

public class StaticVariable {
	
	public static void main(String[] args) {
		LoanApp la = new LoanApp();
		System.out.println("The value through class name is : " + LoanApp.rateOfInterest);
		System.out.println("The value through object is : " + la.rateOfInterest);
	}
}
