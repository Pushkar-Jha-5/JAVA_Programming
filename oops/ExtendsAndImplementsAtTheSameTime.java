package oops;

interface ICalc{
	void add(int a,int b);
	void sub(int a,int b);
}

class CalcAdvanced{
	public void mul(int a,int b) {
		System.out.println("The product is : " + (a*b));
	}
	public void div(int a,int b) {
		System.out.println("The quotient is : " + (a/b));
	}
}

// inheritence -> 1st extends
// implementation -> 2nd implements
class CalcImpl extends CalcAdvanced implements ICalc{
	public void add(int a,int b) {
		System.out.println("The sum is : " + (a+b));
	}
	public void sub(int a,int b) {
		System.out.println("The difference is : " + (a-b));
	}
}

public class ExtendsAndImplementsAtTheSameTime {

	public static void main(String[] args) {
		CalcImpl calculator = new CalcImpl();
		calculator.add(18, 7);
		calculator.sub(18, 7);
		calculator.mul(18, 7);
		calculator.div(18, 7);
	}

}
