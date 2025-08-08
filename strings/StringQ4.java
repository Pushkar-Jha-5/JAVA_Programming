package strings;

import java.util.Scanner;

public class StringQ4 {
	public static void reverseHalfPart(String str) {
		String ans = "";
		int n = str.length();
		int s = n/2;
		int e = n-1;
		for(int i=0;i<n/2;i++) {
			char ch = str.charAt(i);
			ans += ch;
		}
		for(int i=e;i>=s;i--) {
			char ch = str.charAt(i);
			ans += ch;
		}
		System.out.println("The 2nd part reversed array is : " + ans);
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the string : ");
		String str = sc.nextLine();
		
		reverseHalfPart(str);
	}
}
