package strings;

import java.util.Scanner;

public class ToLowerCaseAndConcatMethod {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the 1st string : ");
		String str = sc.nextLine();
		System.out.print("Enter the 2nd string : ");
		String s = sc.nextLine();
		
		// str.toLowerCase() -> nothing will happen
		// we have to directly print -> str.toLowerCase() or store it in a another string
		System.out.println("toLowerCase() : " + str.toLowerCase());
		System.out.println("toUpperCase() : " + str.toUpperCase());
		
		// str.concat() -> nothing will happen
		// we have to directly print -> str.concat(b) or store it in a another string
		String x = str.concat(s);
		System.out.println("concat() : " + x);
	}

}
