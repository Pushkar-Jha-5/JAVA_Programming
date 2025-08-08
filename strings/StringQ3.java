package strings;

import java.util.Scanner;

public class StringQ3 {
	public static boolean palindrome(String str) {
		int n = str.length();
		int s = 0;
		int e = n-1;
		while(s<=e) {
			char ch1 = str.charAt(s);
			char ch2 = str.charAt(e);
			if(ch1 != ch2) {
				return false;
			}
			else {
				s++;
				e--;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the string : ");
		String str = sc.nextLine();
		
		boolean x = palindrome(str);
		if(x) {
			System.out.println("The string " + str + " is palindrome");
		}
		else {
			System.out.println("The string " + str + " is not a palindrome");
		}
	}

}
