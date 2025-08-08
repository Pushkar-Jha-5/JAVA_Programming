package methods;
class FindSum4{
	int sum;
	
	int add(int a,int b) {
		sum = a+b;
		return sum;
	}
}

public class MethodsType4 {

	public static void main(String[] args) {
		FindSum4 s = new FindSum4();
		int a =10;
		int b = 20;
		int x = s.add(a,b);
		System.out.println("The sum is : " + x);
	}

}
