package loops;

import java.util.Scanner;

public class LoopsQ3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the 1st number : ");
		int a = sc.nextInt();
		System.out.print("Enter the 2nd number : ");
		int b = sc.nextInt();
		
		int gcd = 1;
		if(b<a) {
			for(int i=2;i<=b;i++) {
				if(a%i==0 && b%i==0) {
					gcd = i;
				}
			}
			System.out.println("The GCD of a and b is : " + gcd);
		}
		else if(b<a) {
			if(a%b==0) {
				System.out.println("The GCD of a and b is : " + b);
			}
		}
		
		if(a<b) {
			for(int i=2;i<=a;i++) {
				if(a%i==0 && b%i==0) {
					gcd = i;
				}
			}
			System.out.println("The GCD of a and b is : " + gcd);
		}
		else if(a<b) {
			if(b%a==0) {
				System.out.println("The GCD of a and b is : " + a);
			}
		}
	}

}
