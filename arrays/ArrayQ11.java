package arrays;

import java.util.Scanner;

public class ArrayQ11 {
	public static int uniqueElement(int arr[],int n) {
		int num = 0;
		for(int i=0;i<n;i++) {
			num ^= arr[i];
		}
		return num;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size array : ");
		int n = sc.nextInt();
		int[] arr = new int[n];
		System.out.print("Enter the elements of the array : ");
		for(int i=0;i<n;i++) {
			arr[i] = sc.nextInt();
		}
		
		int x = uniqueElement(arr,n);
		System.out.println("The unique number is : " + x);
	}

}
