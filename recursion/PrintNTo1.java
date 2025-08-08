package recursion;

import java.util.Scanner;

public class PrintNTo1 {
	public static void print(int n) {
		// base case
		if(n == 0) {
			return;
		}
		// recursive case
		System.out.print(n + " ");
		print(n-1);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number : ");
		int n = sc.nextInt();
		
		System.out.print("The no. in decreasing order is : ");
		print(n);
	}

}
