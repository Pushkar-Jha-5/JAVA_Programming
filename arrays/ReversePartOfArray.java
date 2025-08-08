package arrays;

import java.util.Scanner;

public class ReversePartOfArray {
	public static void reversePart(int n,int arr[],int fi,int si) {
		int s = fi;
		int e = si;
		while(s<=e) {
			int temp = arr[s];
			arr[s] = arr[e];
			arr[e] = temp;
			s++;
			e--;
		}
		System.out.print("The reverse array is : ");
		for(int i=0;i<n;i++) {
			System.out.print(arr[i] + " ");
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of array : ");
		int n = sc.nextInt();
		int[] arr = new int[n];
		System.out.print("Enter the elements of array : ");
		for(int i=0;i<n;i++) {
			arr[i] = sc.nextInt();
		}
		System.out.print("Enter the first index : ");
		int fi = sc.nextInt();
		System.out.print("Enter the second index : ");
		int si = sc.nextInt();
		
		reversePart(n,arr,fi,si);
	}

}
