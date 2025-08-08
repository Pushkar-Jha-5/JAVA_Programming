package strings;

import java.util.Scanner;

public class Substring {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String x = "";
		System.out.println("The size of empty string is : " + x.length());
		
		System.out.print("Enter the string : ");
		String str = sc.nextLine();
		System.out.print("Enter the starting index : ");
		int a = sc.nextInt();
		System.out.print("Enter the ending index : ");
		int b = sc.nextInt();
		
		// print -> from index "i" to last index
		System.out.println("substring(i) : " + str.substring(a));     
		
		// print -> from index "i" to index "j-1"
		System.out.println("substring(i,j) : " + str.substring(a,b));
	}

}
