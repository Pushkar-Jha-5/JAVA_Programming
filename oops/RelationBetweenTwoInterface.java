package oops;

interface ICalcc{
	// public abstract
	void add(int a,int b);
	void sub(int a,int b);
}

interface IAdvCalcc extends ICalcc{
	// public abstract
	void mul(int a,int b);
	void div(int a,int b);
}

class CalccImpl implements IAdvCalcc{
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

public class RelationBetweenTwoInterface {

	public static void main(String[] args) {
		IAdvCalcc c2 = new CalccImpl();
		c2.add(18, 7);
		c2.sub(18, 7);
		c2.mul(18, 7);
		c2.div(18, 7);
	}

}
