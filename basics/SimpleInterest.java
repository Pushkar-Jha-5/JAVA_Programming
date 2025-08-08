package basics;

public class SimpleInterest {

	public static void main(String[] args) {
		double p = 2500.0;
		double r = 1.8;
		double t = 1.5;
		System.out.println("The principal is " + p);
		System.out.println("The rate is " + r);
		System.out.println("The time is " + t);
		double si = (p*r*t)/100;
		System.out.println("The simple interest is " + si);

	}

}
