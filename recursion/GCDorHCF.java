package recursion;

import java.util.Scanner;

public class GCDorHCF {
	public static int gcd(int a,int b) {
		if(b%a == 0) {
			return a;
		}
		int ans = gcd(b%a,a);
		return ans;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the 1st number : ");
		int a = sc.nextInt();
		System.out.print("Enter the 2nd number : ");
		int b = sc.nextInt();
		
		int x = gcd(a,b);
		System.out.println("The GCD of " + a + " and " + b + " is : " + x);
	}

}
