package recursion;

import java.util.Scanner;

public class RecursionQ6 {
	public static String countAndSay(int n) {
		if(n == 1) {
			return "1";
		}
		String str = countAndSay(n-1);
		String ans = "";
		int i = 0;
		int j = 0;
		while(j < str.length()) {
			if(str.charAt(i) == str.charAt(j)) {
				j++;
			}
			else {
				int len = j-i;
				ans += len;
				ans += str.charAt(i);
				i = j;
			}
		}
		int len = j-i;
		ans += len;
		ans += str.charAt(i);
		i = j;
		return ans;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of the array : ");
		int n = sc.nextInt();
		
		String s = countAndSay(n);
		System.out.println("The compressed string is : " + s);
	}

}
