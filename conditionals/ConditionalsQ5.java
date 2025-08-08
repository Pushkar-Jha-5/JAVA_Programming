package conditionals;

import java.util.Scanner;

public class ConditionalsQ5 {
	public static void greatestOfThree(int a,int b,int c) {
		if(a>=b && a>=c) {
			System.out.println(a + " is greatest");
		}
		else if(b>=a && b>=c) {
			System.out.println(b + " is greatest");
		}
		else {
			System.out.println(c + " is greatest");
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the 1st no : ");
		int a = sc.nextInt();
		System.out.print("Enter the 2nd no : ");
		int b = sc.nextInt();
		System.out.print("Enter the 3rd no : ");
		int c = sc.nextInt();
		
		greatestOfThree(a,b,c);
	}

}
