package methods;

import java.util.Scanner;

public class MethodsQ4 {
	public static void countDigit(int n) {
		int count = 0;
		while(n!=0) {
			n = n/10;
			count++;
		}
		System.out.println("The no. of digit is : " + count);
		System.out.println("The square of no. digit is : " + (count*count));
		
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number : ");
		int n = sc.nextInt();
		
		countDigit(n);
	}

}
