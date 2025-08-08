package recursion;

import java.util.Scanner;

public class Print1toN {
	public static void print(int n) {
		// base case
		if(n == 1) {
			System.out.print(n + " ");
			return;
		}
		// recursive call
		print(n-1);
		System.out.print(n + " ");
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number : ");
		int n = sc.nextInt();
		
		System.out.print("The no. in increasing order is : ");
		print(n);
	}

}
