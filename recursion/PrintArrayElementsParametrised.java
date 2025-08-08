package recursion;

import java.util.Scanner;

public class PrintArrayElementsParametrised {
	public static void print(int arr[],int n,int i) {
		if(i == n) {
			return;
		}
		System.out.print(arr[i] + " ");
		print(arr,n,i+1);
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
		
		System.out.print("The elements of the array after traversing is : ");
		print(arr,n,0);
	}

}
