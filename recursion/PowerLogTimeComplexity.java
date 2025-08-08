package recursion;

import java.util.Scanner;

public class PowerLogTimeComplexity {
	public static int power(int a,int b) {
		// base case
		if(b == 1) {
			return a;
		}
		if(b == 0 || a == 1) {
			return 1;
		}
		if(a == 0) {
			return 0;
		}
		// recursive case
		int ans = power(a,b/2);
		if(b%2 == 0) {
			return ans*ans;
		}
		else {
			return a*ans*ans;
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the base : ");
		int a = sc.nextInt();
		System.out.print("Enter the exponent : ");
		int b = sc.nextInt();
		
		int x = power(a,b);
		System.out.print("The power is : " + x);
	}

}
