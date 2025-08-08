package recursion;

import java.util.Scanner;

public class RecursionQ3 {
	public static boolean power(int n) {
		if(n == 1) {
			return true;
		}
		if(n%2 != 0) {
			return false;
		}
		return power(n/2);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number : ");
		int n = sc.nextInt();
		
		boolean x = power(n);
		if(x) {
			System.out.println(n + " is the power of 2");
		}
		else {
			System.out.println(n + " is not the power of 2");
		}
	}

}
