package recursion;
import java.util.Scanner;

public class StringTraversal {
	public static void print(String str,int i) {
		// base case
		if(i == str.length()) {
			return;
		}
		// recursive case
		System.out.print(str.charAt(i));
		print(str,i+1);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the string : ");
		String str = sc.nextLine();
		
		System.out.print("The string is : ");
		print(str,0);
	}

}
