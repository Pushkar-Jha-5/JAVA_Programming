package recursion;

import java.util.Scanner;

public class GenerateParentheses {
	public static void printParenthesis(int n,String str,int open,int close) {
		if(str.length() == 2*n) {
			System.out.println(str);
			return;
		}
		if(open < n) {
			printParenthesis(n,str+'(',open+1,close);
		}
		if(close < open) {
			printParenthesis(n,str+')',open,close+1);
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number : ");
		int n = sc.nextInt();
		
		printParenthesis(n,"",0,0);
	}

}
