package conditionals;

import java.util.Scanner;

public class ConditionalsQ7 {
	public static void leastOfThree(int a,int b,int c) {
		if(a<b) {
			if(a<c) {
				System.out.println(a + " is least");
			}
			else {
				System.out.println(c + " is least");
			}
		}
		else {
			if(b<c) {
				System.out.println(b + " is least");
			}
			else {
				System.out.println(c + " is least");
			}
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
		
		leastOfThree(a,b,c);
	}

}
