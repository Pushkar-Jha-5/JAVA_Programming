package arrays;

import java.util.Scanner;

public class ArrayQ12 {
	public static boolean palindrome(int arr[],int n) {
		int s = 0;
		int e = n-1;
		while(s<=e) {
			if(arr[s] != arr[e]) {
				return false;
			}
			s++;
			e--;
		}
		return true;
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
		
		boolean x = palindrome(arr,n);
		if(x) {
			System.out.println("Array is a palindrome");
		}
		else {
			System.out.println("Array is not a palindrome");
		}
	}

}
