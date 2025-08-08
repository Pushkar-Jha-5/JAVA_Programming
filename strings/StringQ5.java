package strings;

import java.util.Scanner;

public class StringQ5 {
	public static void stringToInteger(String str) {
		char[] ch = str.toCharArray();
		int n = ch.length;
		int [] arr = new int[n];
		System.out.print("The integer of the string array is : ");
		for(int i=0;i<n;i++) {
			char x = ch[i];
			arr[i] = x-48;
			System.out.print(arr[i]);
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the string : ");
		String str = sc.nextLine();
		
		stringToInteger(str);
	}

}
