package conditionals;

import java.util.Scanner;

public class AreaPerimeter {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the length : ");
		double l = sc.nextDouble();
		System.out.print("Enter the breadth : ");
		double b = sc.nextDouble();
		
		double a = l*b;
		double p = 2*(l+b);
		
		if(a>p) {
			System.out.println("Area " + a + " is greater than perimeter " + p);
		}
		else if(a==p) {
			System.out.println("Area " + a + " is equal to perimeter " + p);
		}
		else {
			System.out.println("Area " + a + " is less than perimeter " + p);
		}
	}

}
