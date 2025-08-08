package recursion;

import java.util.Scanner;

public class Sum2 {
	public static int sum(int n) {
		// base case
		if(n == 0) {
			return 0;
		}
		//recursive case
		int ans = n+sum(n-1);
		return ans;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number : ");
		int n = sc.nextInt();
		
		int x = sum(n);
		System.out.print("The sum is : " + x);
	}

}
