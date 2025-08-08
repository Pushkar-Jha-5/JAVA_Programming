package methods;
class FindSum3{
	int sum;
	
	void add(int a,int b) {
		sum = a+b;
		System.out.println("The sum is : " + sum);
	}
}

public class MethodsType3 {

	public static void main(String[] args) {
		FindSum3 s = new FindSum3();
		int a =10;
		int b = 20;
		s.add(a,b);
	}

}
