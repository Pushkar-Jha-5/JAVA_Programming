package recursion;

import java.util.Scanner;

public class RecursionQ4 {
	public static void printReverse(int n,int arr[],int i) {
		if(i == n) {
			return;
		}
		printReverse(n,arr,i+1);
		System.out.print(arr[i] + " ");
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of the array : ");
		int n = sc.nextInt();
		int[] arr = new int[n];
		System.out.print("Enter the elements of the array : ");
		for(int i=0;i<n;i++) {
			arr[i] = sc.nextInt();
		}
		
		System.out.print("The array in reverse order is : ");
		printReverse(n,arr,0);
	}

}
