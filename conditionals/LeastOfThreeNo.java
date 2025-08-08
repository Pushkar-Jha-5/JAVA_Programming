package conditionals;

import java.util.Scanner;

public class LeastOfThreeNo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the 1st number : ");
		int a = sc.nextInt();
		System.out.print("Enter the 2nd number : ");
		int b = sc.nextInt();
		System.out.print("Enter the 3rd number : ");
		int c = sc.nextInt();
		
		if(a<=b && a<=c) {
			System.out.println(a + " is least number");
		}
		else if(b<=a && b<=c) {
			System.out.println(b + " is least number");
		}
		else {
			System.out.println(c + " is least number");
		}
	}

}
