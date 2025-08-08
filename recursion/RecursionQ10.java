package recursion;

import java.util.Scanner;

public class RecursionQ10 {
	public static void merge(int arr[],int m,int brr[],int n,int i,int j) {
		int[] ans = new int[m+n];
		if(i == m || j == n) {
			for(int k=0;k<m+n;k++) {
				System.out.print(arr[k] + " ");
				return;
			}
		}
		while(i<m && j<n) {
			if(arr[i] < brr[j]) {
				ans[i] = arr[i];
			}
			merge(arr,m,brr,n,i+1,j);
			if(arr[i] > brr[j]) {
				ans[i] = brr[j];
			}
			merge(arr,m,brr,n,i,j+1);
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of the 1st array : ");
		int m = sc.nextInt();
		int[] arr = new int[m];
		System.out.print("Enter the elements of the 1st array : ");
		for(int i=0;i<m;i++) {
			arr[i] = sc.nextInt();
		}
		System.out.print("Enter the size of the 2nd array : ");
		int n = sc.nextInt();
		int[] brr = new int[n];
		System.out.print("Enter the elements of the 2nd array : ");
		for(int i=0;i<n;i++) {
			brr[i] = sc.nextInt();
		}
		
		merge(arr,m,brr,n,0,0);
	}

}
