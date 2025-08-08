package strings;

import java.util.Scanner;

public class PrintAllSubstring {
	public static void printSubstring(String str) {
		int n = str.length();
		System.out.println("The all substring of the string " + str + " is : ");
		for(int i=0;i<=n;i++) {
			for(int j=i+1;j<=n;j++) {
				System.out.print(str.substring(i,j) + " ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the string : ");
		String str = sc.nextLine();
		
		printSubstring(str);
	}

}
