package loops;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number : ");
		int n = sc.nextInt();
		int sum = 0;
		for(int i=2;i<n;i++) {
			if(n%i==0) {
				System.out.println(n + " is not a prime number");
				sum = 1;
				break;
			}
		}
		if(n<=1){
			System.out.println(n + " is not a prime number");
		}
		else if(sum==0) {
			System.out.println(n + " is a prime number");
		}
	}

}
