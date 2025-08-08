package strings;

import java.util.Scanner;

public class CompareToMethod {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the 1st string : ");
		String str1 = sc.nextLine();
		System.out.print("Enter the 2nd string : ");
		String str2 = sc.nextLine();
		
		// it compares the ASCII value of char by char
		// if 1st char of both string is same
		// again it compare next char and if it is different then give result(ASCII(of 1st)-ASCII(of 2nd)) char
		System.out.println("After comparision : " + str1.compareTo(str2));
	}

}
