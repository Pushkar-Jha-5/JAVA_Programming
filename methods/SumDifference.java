package methods;
import java.util.Scanner;

public class SumDifference {
	public static int add(int a,int b) {
		int sum = a+b;
		return sum;
	} 
	
	public static int subtract(int a,int b) {
		int diff = a-b;
		return diff;
	} 

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the 1st number : ");
		int a = sc.nextInt();
		System.out.print("Enter the 2nd number : ");
		int b = sc.nextInt();
		
		int x = add(a,b);
		int y = subtract(a,b);
		
		System.out.println("The sum is : " + x);
		System.out.println("The diff is : " + y);
	}

}
