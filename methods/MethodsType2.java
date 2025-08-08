package methods;
class FindSum2{
	int a;
	int b;
	int sum;
	
	int add() {
		a = 10;
		b = 20;
		sum = a+b;
		return sum;
	}
}

public class MethodsType2 {

	public static void main(String[] args) {
		FindSum2 s = new FindSum2();
		int x =s.add();
		System.out.println("The sum is : " + x);
	}

}
