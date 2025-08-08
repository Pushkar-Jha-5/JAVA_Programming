package recursion;
import java.util.Scanner;

public class Factorial {
	public static int factorial(int n) {
		// base case
		if(n == 0 || n == 1) {
			return 1;
		}
		// recursive case
		int fact = n*factorial(n-1);
		return fact;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number : ");
		int n = sc.nextInt();
		
		int x = factorial(n);
		System.out.println("The factorial of " + n + " is : " + x);
	}

}
