package conditionals;

import java.util.Scanner;

public class CalculatorIfElse {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the value of a : ");
		int a = sc.nextInt();
		System.out.print("Enter the value of b : ");
		int b = sc.nextInt();
		System.out.print("Enter the operator : ");
		char op = sc.next().charAt(0);
		
		if(op=='+') {
			System.out.println("Sum is " + (a+b));
		}
		else if(op=='-') {
			System.out.println("Difference is " + (a-b));
		}
		else if(op=='*') {
			System.out.println("Product is " + (a*b));
		}
		else if(op=='/') {
			System.out.println("Division is " + (a/b));
		}
	}

}
