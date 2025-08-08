package arrays;
import java.util.Scanner;

public class InputOutput {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[5];
		arr[0] = 5;
		arr[1] = 10;
		arr[2] = 15;
		arr[3] = 20;
		arr[4] = 25;
		
		// output -> loop
		for(int i=0;i<5;i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		
		System.out.print("Enter the size of the array : ");
		int n = sc.nextInt();
		int[] brr = new int[n];
		System.out.println("Enter the elements of the array : ");
		// input
		for(int i=0;i<n;i++) {
			brr[i] = sc.nextInt();
		}
		// output
		for(int i=0;i<n;i++) {
			System.out.print(brr[i] + " ");
		}
	}

}
