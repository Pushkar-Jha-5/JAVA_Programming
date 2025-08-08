package conditionals;

import java.util.Scanner;

public class ValidTriangle {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the 1st side of the triangle : ");
		int a = sc.nextInt();
		System.out.print("Enter the 2nd side of the triangle : ");
		int b = sc.nextInt();
		System.out.print("Enter the 3rd side of the triangle : ");
		int c = sc.nextInt();
		
		if((a+b)>c && (b+c)>a && (a+c)>b) {
			System.out.println("Valid triangle");
		}
		else {
			System.out.println("Invalid triangle");
		}
	}

}
