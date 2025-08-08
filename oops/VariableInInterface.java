package oops;

interface IDemo{
	// public static final
	int x = 25;
}

public class VariableInInterface implements IDemo{

	public static void main(String[] args) {
		int x = 50;     // local variable
		System.out.println("Local variable : " + x);
		System.out.println("By the interface name : " + IDemo.x);
		System.out.println("By the class name :" + VariableInInterface.x);
	}

}
