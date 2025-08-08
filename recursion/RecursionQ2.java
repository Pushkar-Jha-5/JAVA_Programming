package recursion;

import java.util.Scanner;

public class RecursionQ2 {
	public static int stair(int n) {
		if(n == 1 || n == 2) {
			return n;
		}
		if(n == 3) {
			return n+1;
		}
		int ans = stair(n-1)+stair(n-2)+stair(n-3);
		return ans;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number : ");
		int n = sc.nextInt();
		
		int x = stair(n);
		System.out.println("The no. of ways is : " + x);
	}

}
