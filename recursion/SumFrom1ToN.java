package recursion;

import java.util.Scanner;

public class SumFrom1ToN {
	public static void sum(int n,int ans) {
		// base case
		if(n == 0) {
			System.out.print(ans);
			return;
		}
		// recursive case
		sum(n-1,ans+n);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number : ");
		int n = sc.nextInt();
		
		System.out.print("The sum is : ");
		sum(n,0);
	}

}
