package basics;

import java.util.Scanner;
public class ChracterASCCI {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char ch1 = 'A';
		System.out.println(ch1);
		
		System.out.println("Enter the chracter");
		char ch2 = sc.next().charAt(0);
		System.out.println("The chracter is " + ch2);
		
		System.out.println("Enter the chracter");
		char ch3 = sc.next().charAt(0);
		System.out.println("The ASCCI value of the chracter is " + (int)ch3);
	}

}
