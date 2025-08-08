package arrays;

import java.util.Scanner;

public class RotateArray {
	public static void rotateArray(int n,int arr[],int k) {
		k = k%n;
		int index = n-k;
		int[] ans = new int[n];
		int x = 0;
		for(int i=index;i<n;i++) {
			ans[x] = arr[i];
			x++;
		}
		for(int i=0;i<index;i++) {
			ans[x] = arr[i];
			x++;
		}
		for(int i=0;i<n;i++) {
			System.out.print(ans[i] + " ");
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
		System.out.print("Enter the value of k : ");
		int k = sc.nextInt();
		
		rotateArray(n,arr,k);
	}

}
