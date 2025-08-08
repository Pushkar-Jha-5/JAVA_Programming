package strings;

import java.util.Scanner;

public class StringQ2 {
	public static int countConsonent(String str) {
		int n = str.length();
		int count = 0;
		for(int i=0;i<n;i++) {
			char ch = str.charAt(i);
			if(ch!='a' && ch!='e' && ch!='i' && ch!='o' && ch!='u' && ch!='A' && ch!='E' && ch!='I' && ch!='O' && ch!='U') {
				count++;
			}
		}
		return count;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the string : ");
		String str = sc.nextLine();
		
		int x = countConsonent(str);
		System.out.println("The no. of consonent is : " + x);
	}
}
