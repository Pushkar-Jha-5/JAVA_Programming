package strings;

import java.util.Scanner;

public class IndexOfCharacter {
	public static int indexOfChar(String str,char ch) {
		int n = str.length();
		int index = 0;
		for(int i=0;i<n;i++) {
			char x = str.charAt(i);
			if(x == ch) {
				index = i;
				break;
			}
		}
		return index;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the string : ");
		String str = sc.nextLine();
		System.out.print("Enter the chracter : ");
		char ch = sc.next().charAt(0);
		
		int x = indexOfChar(str,ch);
		System.out.println("The index of " + ch + " is " + x);
	}

}
