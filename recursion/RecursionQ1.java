package recursion;

import java.util.Scanner;

public class RecursionQ1 {
	public static void oddSum(int a,int b,int sum) {
		if(a > b) {
			System.out.println("The sum of odd no. is : " + sum);
			return;
		}
		if(a%2 == 1) {
			oddSum(a+1,b,sum+a);
		}
		else {
			oddSum(a+1,b,sum);
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the 1st number : ");
		int a = sc.nextInt();
		System.out.print("Enter the 2nd number : ");
		int b = sc.nextInt();
		
		oddSum(a,b,0);
	}

}
