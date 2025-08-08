package loops;

import java.util.Scanner;

public class SumOfTheDigit {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the value of n : ");
		int n = sc.nextInt();
		int sum = 0;
		while(n>0) {
			int x = n%10;
			sum+=x;
			n/=10;
		}
		System.out.println("The sum of the digit is : " + sum);
	}

}
