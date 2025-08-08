package conditionals;

import java.util.Scanner;

public class ConditionalsQ1 {
	public static void evenOdd(int n) {
		if(n%2==0) {
			System.out.println(n + " is even");
		}
		else {
			System.out.println(n + " is odd");
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number : ");
		int n = sc.nextInt();
		
		evenOdd(n);
	}

}
