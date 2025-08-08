package oops;

interface ICalculator{
	// public abstract
	void add(int a,int b);
	void sub(int a,int b);
	void mul(int a,int b);
	void div(int a,int b);
}

class CalculatorImpl implements ICalculator{
	public void add(int a,int b) {
		System.out.println("The sum is : " + (a+b));
	}
	public void sub(int a,int b) {
		System.out.println("The difference is : " + (a-b));
	}
	public void mul(int a,int b) {
		System.out.println("The product is : " + (a*b));
	}
	public void div(int a,int b) {
		System.out.println("The quotient is : " + (a/b));
	}
}

public class Interface {

	public static void main(String[] args) {
		// loose coupling : Polymorphism
		ICalculator c1 = new CalculatorImpl();
		c1.add(18, 7);
		c1.sub(18, 7);
		c1.mul(18, 7);
		c1.div(18, 7);
	}

}
