package methods;

import java.util.Scanner;

public class VowelConsonent {
	public static void vowelConsonent(char ch) {
		if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u') {
			System.out.println("The chracter " + ch + " is vowel");
		}
		else {
			System.out.println("The chracter " + ch + " is consonent");
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the chracter : ");
		char ch = sc.next().charAt(0);
		
		vowelConsonent(ch);
	}
}
