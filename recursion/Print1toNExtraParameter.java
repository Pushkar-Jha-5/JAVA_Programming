package recursion;

import java.util.Scanner;

public class Print1toNExtraParameter {
	public static void print(int x,int n) {
		// base case
		if(x > n) {
			return;
		}
		// recursive case
		System.out.print(x + " ");
		print(x+1,n);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number : ");
		int n = sc.nextInt();
		
		System.out.print("The no. in increasing order is : ");
		print(1,n);
	}

}
