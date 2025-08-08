package basics;

import java.util.Scanner;
public class InputTypecasting {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int x = sc.nextInt();
		double y = (double)x;
		System.out.println("Half of the no is " + y/2);
		
		System.out.println("Enter the number");
		double a = sc.nextDouble();
		int b = (int)a;
		System.out.println("Integer part of the no is " + b);
	}

}
