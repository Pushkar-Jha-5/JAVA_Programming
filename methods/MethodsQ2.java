package methods;

import java.util.Scanner;

public class MethodsQ2 {
	public static double Area(double r) {
		double a = 3.14*r*r;
		return a;
	} 

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the radius : ");
		double r = sc.nextDouble();
		
		double x = Area(r);
		System.out.println("The area of the circle is : " + x);
	}

}
