package string_builder;

import java.util.Scanner;

public class ToggleChar {
	public static void toggle(StringBuilder sb) {
		int n = sb.length();
		for(int i=0;i<n;i++) {
			char ch = sb.charAt(i);
			if(ch>=65 && ch<=90) {
				ch += 32;
				sb.setCharAt(i, ch);
			}
			else {
				ch -= 32;
				sb.setCharAt(i, ch);
			}
		}
		System.out.println(sb);
	}

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.print("Enter the String : ");
		String str = sc.nextLine();
		StringBuilder sb = new StringBuilder(str);
		
		toggle(sb);
	}

}
