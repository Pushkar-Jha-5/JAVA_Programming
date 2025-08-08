package recursion;

import java.util.Scanner;

public class RecursionQ15 {
	public static void decimalToBinary(int n) {
		if(n == 0) {
			return;
		}
		decimalToBinary(n/2);
		int rem = n%2;
		System.out.print(rem);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number : ");
		int n = sc.nextInt();
		
		System.out.print("The binary form of " + n + " is : ");
		decimalToBinary(n);
	}

}
