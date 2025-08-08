package conditionals;

import java.util.Scanner;

public class CalculatorSwitch {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the value of a : ");
		int a = sc.nextInt();
		System.out.print("Enter the value of b : ");
		int b = sc.nextInt();
		System.out.print("Enter the operator : ");
		char op = sc.next().charAt(0);
		
		switch(op) {
			case '+' :
				System.out.println("Sum is " + (a+b));
				break;
			case '-' :
				System.out.println("Difference is " + (a-b));
				break;
			case '*' :
				System.out.println("Product is " + (a*b));
				break;
			case '/' :
				System.out.println("Division is " + (a/b));
				break;
			default:
				System.out.println("Invalid choice");
		}
	}

}
