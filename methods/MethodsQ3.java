package methods;

import java.util.Scanner;

public class MethodsQ3 {
	public static void printOddNo(int a,int b) {
		for(int i=a;i<=b;i++) {
			if(i%2!=0) {
				System.out.print(i + " ");
			}
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the 1st number : ");
		int a = sc.nextInt();
		System.out.print("Enter the 2nd number : ");
		int b = sc.nextInt();
		
		printOddNo(a,b);
	}

}
