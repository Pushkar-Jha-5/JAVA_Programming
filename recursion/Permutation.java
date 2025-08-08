package recursion;

import java.util.Scanner;

public class Permutation {
	public static void permutation(String str,String ans) {
		if(str.length() == 0) {
			System.out.print(ans + " ");
			return;
		}
		for(int i=0;i<str.length();i++) {
			char ch = str.charAt(i);
			String left = str.substring(0,i);
			String right = str.substring(i+1);
			permutation(left+right,ans+ch);
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the string : ");
		String str = sc.nextLine();
		
		System.out.print("The total permutation is : ");
		permutation(str,"");
	}

}
