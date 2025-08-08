package strings;

import java.util.Arrays;
import java.util.Scanner;

public class StringQ9 {
	public static boolean anagram(String str1,String str2) {
		char[] ch1 = str1.toCharArray();
		char[] ch2 = str2.toCharArray();
		int m = ch1.length;
		int n = ch2.length;
		Arrays.sort(ch1);
		Arrays.sort(ch2);
		
		if(m != n) {
			return false;
		}
		for(int i=0;i<m;i++) {
			if(ch1[i] != ch2[i]) {
				return false;
			}
		}
		return true;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the 1st string : ");
		String str1 = sc.nextLine();
		System.out.print("Enter the 2nd string : ");
		String str2 = sc.nextLine();
		
		boolean x = anagram(str1,str2);
		if(x) {
			System.out.println("The " + str1 + " and " + str2 + " is anagram");
		}
		else {
			System.out.println("The " + str1 + " and " + str2 + " is not anagram");
		}
	}
}
