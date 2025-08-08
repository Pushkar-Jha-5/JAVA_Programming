package methods;
class FindSum{
	int a;
	int b;
	int sum;
	
	void add() {
		a = 10;
		b = 20;
		sum = a+b;
		System.out.println("The sum is : " + sum);
	}
}

public class MethodType1 {

	public static void main(String[] args) {
		FindSum s = new FindSum();
		s.add();
	}

}
