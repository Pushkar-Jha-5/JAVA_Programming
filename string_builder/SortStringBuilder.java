package string_builder;

import java.util.Arrays;
import java.util.Scanner;

public class SortStringBuilder {
	public static void sorting(StringBuilder sb) {
		String str = sb.toString();
		char[] ch = str.toCharArray();
		int n = ch.length;
		System.out.print("Before sort : ");
		for(int i=0;i<n;i++) {
			System.out.print(ch[i]);
		}
		System.out.println();
		System.out.print("After sort : ");
		Arrays.sort(ch);
		for(int i=0;i<n;i++) {
			System.out.print(ch[i]);
		}
	}

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.print("Enter the String : ");
		StringBuilder sb = new StringBuilder(sc.nextLine());
		
		sorting(sb);
	}

}
