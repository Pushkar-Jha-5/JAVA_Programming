package strings;

import java.util.Scanner;

public class StringQ8 {
	public static void substringVowels(String str) {
		int n = str.length();
		int count = 0;
		for(int i=0;i<n;i++) {
			for(int j=i+1;j<n;j++) {
				char ch1 = str.charAt(i);
				char ch2 = str.charAt(j);
				if((ch1 == 'a' || ch1 == 'e' || ch1 == 'i' || ch1 == 'o' || ch1 == 'u') && (ch2 == 'a' || ch2 == 'e' || ch2 == 'i' || ch2 == 'o' || ch2 == 'u')) {
					System.out.print(str.substring(i,j) + " ");
					count++;
				}
			}
			System.out.println();
		}
		System.out.println(count);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the string : ");
		String str = sc.nextLine();
		
		substringVowels(str);
	}

}
