package oops;

class Calc{
	public void add(int a,int b) {
		System.out.println("Int - Int argument");
	}
	public void add(float a,float b) {
		System.out.println("Float - Float argument");
	}
	public void add(double a,double b) {
		System.out.println("Double - Double argument");
	}
}

public class MethodOverloading {

	public static void main(String[] args) {
		Calc c1 = new Calc();
		c1.add(7, 18);
		c1.add(7.5f, 18.2f);
		c1.add(7.5, 18.1);
	}

}
