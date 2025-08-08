package string_builder;

import java.util.Scanner;

public class ReverseWordInSentence {
	public static void reverse(StringBuilder sb,int i,int j) {
		while(i<=j) {
			char ch1 = sb.charAt(i);
			char ch2 = sb.charAt(j);
			sb.setCharAt(i, ch2);
			sb.setCharAt(j, ch1);
			i++;
			j--;
		}
	}
	
	public static void reverseWord(StringBuilder sb) {
		int n = sb.length();
		int i = 0;
		int j = 0;
		char ch = ' ';
		while(j<n) {
			if(sb.charAt(j) != ch) {
				j++;
			}
			else {
				reverse(sb,i,j-1);
				i = j+1;
				j=i;
			}
		}
		reverse(sb,i,j-1);     // for last word reverse
		System.out.println("The reversed word is : " + sb);
	}

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.print("Enter the String : ");
		StringBuilder sb = new StringBuilder(sc.nextLine());
		
		reverseWord(sb);
	}

}
