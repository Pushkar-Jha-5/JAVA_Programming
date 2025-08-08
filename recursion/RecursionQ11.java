package recursion;

import java.util.Scanner;

public class RecursionQ11 {
	public static void subsets(String str,int i,String ans) {
		if(i == str.length()) {
			System.out.print(ans + " ");
			return;
		}
		char ch = str.charAt(i);
		subsets(str,i+1,ans);
		subsets(str,i+1,ans+ch);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the string : ");
		String str = sc.nextLine();
		
		System.out.println("The subsets is : ");
		subsets(str,0,"");
	}

}
