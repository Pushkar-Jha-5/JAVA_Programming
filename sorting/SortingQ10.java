package sorting;

import java.util.Scanner;

public class SortingQ10 {
	public static void stringSorting(String str) {
		String ans = "";
		int n = str.length();
		for(int i=0;i<n-1;i++) {
			for(int j=0;j<n-1-i;j++) {
				char ch1 = str.charAt(j);
				char ch2 = str.charAt(j+1);
				if(ch1 > ch2) {
					char temp = ch1;
					ch1 = ch2;
					ch2 = temp;
				}
			}
		}
		System.out.print(ans);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System .in);
		System.out.print("Enter the string : ");
		String str = sc.nextLine();
		
		stringSorting(str);
	}

}
