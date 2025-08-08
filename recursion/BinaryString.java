package recursion;

import java.util.Scanner;

public class BinaryString {
	public static void binary(int n,String ans) {
		int m = ans.length();
		if(m == n) {
			System.out.print(ans + " ");
			return;
		}
		if(m == 0 || ans.charAt(m-1) == '0') {
			binary(n,ans+1);
			binary(n,ans+0);
		}
		else if(ans.charAt(m-1) == '1') {
			binary(n,ans+0);
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number : ");
		int n = sc.nextInt();
		
		System.out.println("The updated string is : ");
		binary(n,"");
	}

}
