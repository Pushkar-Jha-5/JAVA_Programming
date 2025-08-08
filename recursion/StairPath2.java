package recursion;

import java.util.Scanner;

public class StairPath2 {
	public static int stair(int n) {
		// base case
		if(n == 1 || n == 2) {
			return 1;
		}
		if(n == 3) {
			return 2;
		}
		// recursive case   
		int ans = stair(n-1)+stair(n-3);
		return ans;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of stairs : ");
		int n = sc.nextInt();
		
		int x = stair(n);
		System.out.println("The no. of ways is : " + x);
	}

}
