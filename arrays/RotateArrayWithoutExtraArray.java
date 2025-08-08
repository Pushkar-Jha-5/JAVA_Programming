package arrays;

import java.util.Scanner;

public class RotateArrayWithoutExtraArray {
	public static void rotate(int n,int arr[],int k) {
		int s = 0;
		int e = k-1;
		while(s<=e) {
			int temp = arr[s];
			arr[s] = arr[e];
			arr[e] = temp;
			s++;
			e--;
		}
		s = k;
		e = n-1;
		while(s<=e) {
			int temp = arr[s];
			arr[s] = arr[e];
			arr[e] = temp;
			s++;
			e--;
		}
		System.out.print("The rotated array is : ");
		for(int i=0;i<n;i++) {
			System.out.print(arr[i] + " ");
		}
	}
	
	public static void reverse(int n,int arr[],int k) {
		k = k%n;
		int s = 0;
		int e = n-1;
		while(s<=e) {
			int temp = arr[s];
			arr[s] = arr[e];
			arr[e] = temp;
			s++;
			e--;
		}
		rotate(n,arr,k);
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
		System.out.print("Enter the value of k : ");
		int k = sc.nextInt();
		
		reverse(n,arr,k);
	}

}
