package string_builder;

import java.util.Scanner;

public class ReverseString {
	public static void reverse(StringBuilder sb) {
		int n = sb.length();
		int s = 0;
		int e = n-1;
		while(s<=e) {
			char ch1 = sb.charAt(s);
			char ch2 = sb.charAt(e);
			sb.setCharAt(s,ch2);
			sb.setCharAt(e, ch1);
			s++;
			e--;
		}
		System.out.println("The reversed string is : " + sb);
	}

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.print("Enter the String : ");
		StringBuilder sb = new StringBuilder(sc.nextLine());
		
		reverse(sb);
	}

}
