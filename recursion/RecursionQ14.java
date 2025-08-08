package recursion;

import java.util.Scanner;

public class RecursionQ14 {
	public static int factorial(int n) {
		if(n == 0 || n == 1) {
			return 1;
		}
		int ans = n*factorial(n-1);
		return ans;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number : ");
		int n = sc.nextInt();
		
		int x = factorial(n);
		System.out.println("The factorial of " + n + " is : " + x);
	}

}
