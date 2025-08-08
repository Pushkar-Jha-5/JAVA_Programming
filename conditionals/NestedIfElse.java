package conditionals;

import java.util.Scanner;

public class NestedIfElse {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the 1st number : ");
		int a = sc.nextInt();
		System.out.print("Enter the 2nd number : ");
		int b = sc.nextInt();
		System.out.print("Enter the 3rd number : ");
		int c = sc.nextInt();
		
		if(a>b) {
			if(a>c) {
				System.out.println(a + " is greatest");
			}
			else {     // c>=a>b
				System.out.println(c + " is greatest");
			}
		}
		else {     // b>=a
			if(b>c) {
				System.out.println(b + " is greatest");
			}
			else {     // c>=b>=a
				System.out.println(c + " is greatest");
			}
		}
	}

}
