package recursion;

import java.util.Scanner;

public class RecursionQ8 {
	public static void reverseNumber(int n,String str) {
		if(n == 0) {
			System.out.println("The reversed no. is : " + str);
			return;
		}
		int lastDigit = n%10;
		reverseNumber(n/10,str+lastDigit);
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of the array : ");
		int n = sc.nextInt();
		
		reverseNumber(n,"");
	}

}
