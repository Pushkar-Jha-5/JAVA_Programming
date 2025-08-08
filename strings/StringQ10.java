package strings;

import java.util.Scanner;

public class StringQ10 {
	public static char lexographicallyMax(String str) {
		int n = str.length();
		char max = str.charAt(0);
		for(int i=0;i<n;i++) {
			char ch = str.charAt(i);
			if(ch>max) {
				max = ch;
			}
		}
		return max;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the string : ");
		String str = sc.nextLine();
		
		char x = lexographicallyMax(str);
		System.out.println("The lexographacally max. element is : " + x);
	}
}
