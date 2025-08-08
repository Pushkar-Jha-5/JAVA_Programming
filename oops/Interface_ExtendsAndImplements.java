package oops;

interface ICalculatorr{
	// public abstract
	void add(int a,int b);
	void sub(int a,int b);
}

interface IAdvancedCalculatorr{
	void mul(int a,int b);
	void div(int a,int b);
}

class CalculatorrImpl implements ICalculatorr,IAdvancedCalculatorr{
	// ICalculatorr
	public void add(int a,int b) {
		System.out.println("The sum is : " + (a+b));
	}
	public void sub(int a,int b) {
		System.out.println("The difference is : " + (a-b));
	}
	//IAdvancedCalculator
	public void mul(int a,int b) {
		System.out.println("The product is : " + (a*b));
	}
	public void div(int a,int b) {
		System.out.println("The quotient is : " + (a/b));
	}
}

public class Interface_ExtendsAndImplements {

	public static void main(String[] args) {
		ICalculatorr c1 = new CalculatorrImpl();
		c1.add(18, 7);
		c1.sub(18, 7);
		
		IAdvancedCalculatorr c2 = new CalculatorrImpl();
		c2.mul(18, 7);
		c2.div(18, 7);
	}

}
