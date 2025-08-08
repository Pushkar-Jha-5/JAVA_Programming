package strings;

import java.util.Scanner;

public class StringQ6 {
	public static void concatinate(String str) {
		int n = str.length();
		String ans = "";
		for(int i=n-1;i>=0;i--) {
			char ch = str.charAt(i);
			ans += ch;
		}
		str += ans;
		System.out.println("The reverse concatinate is : " + str);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the string : ");
		String str = sc.nextLine();
		
		concatinate(str);
	}

}
