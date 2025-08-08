package recursion;

import java.util.Scanner;

public class SkipACharacter {
	public static void skipChar(String str,int i,String ans) {
		// base case
		if(i == str.length()) {
			System.out.println(ans);
			return;
		}
		// recursive case
		char ch = str.charAt(i);
		if(ch != 'a') {
			ans += ch;
		}
		skipChar(str,i+1,ans);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the string : ");
		String str = sc.nextLine();
		
		System.out.print("The updated string is : ");
		skipChar(str,0,"");
	}

}
