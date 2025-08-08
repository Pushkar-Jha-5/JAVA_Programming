package conditionals;

import java.util.Scanner;

public class ConditionalsQ6 {
	public static void typesOfTriangle(int a,int b,int c) {
		if(a==b && b==c && a==c) {
			System.out.println("Equilateral triangle");
		}
		else if(a==b || b==c || c==a) {
			System.out.println("Isosceles triangle");
		}
		else {
			System.out.println("Scalene triangle");
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the 1st side : ");
		int a = sc.nextInt();
		System.out.print("Enter the 2nd side : ");
		int b = sc.nextInt();
		System.out.print("Enter the 3rd side: ");
		int c = sc.nextInt();
		
		typesOfTriangle(a,b,c);
	}

}
