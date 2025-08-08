package arrays;

import java.util.Scanner;

public class ArrayQ16 {
	public static long factorial(int n) {
		long fact = 1;
		for(int i=1;i<=n;i++) {
			fact *= i;
		}
		return fact;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number : ");
		int n = sc.nextInt();
		
		long x = factorial(n);
		System.out.println("The factorial is : " + x);
	}

}
