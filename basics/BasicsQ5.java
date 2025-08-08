package basics;

import java.util.Scanner;
public class BasicsQ5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the radius of the circle : ");
		double rd = sc.nextDouble();
		double a = 3.14*rd*rd;
		System.out.println("Area of circle : " + a);
		
		System.out.print("Enter principal amount : ");
		int p = sc.nextInt();
		System.out.print("Enter rate of interest : ");
		int r = sc.nextInt();
		System.out.print("Enter time (in years)");
		int t = sc.nextInt();
		int si = (p*r*t)/100;
		System.out.println("Simple interest : " + (double)si);
	}

}
