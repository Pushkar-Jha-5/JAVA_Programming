package recursion;

import java.util.Arrays;
import java.util.Scanner;

public class RecursionQ7 {
	public static void sumTriangle(int arr[]) {
		int n = arr.length;
		if(n == 0) {
			return;
		}
		for(int i=0;i<n;i++) {
			System.out.print(Arrays.toString(arr) + " ");
		}
		System.out.println();
		int[] ans = new int[n-1];
		for(int i=0;i<n;i++) {
			ans[i] = arr[i]+arr[i+1];
		}
		sumTriangle(ans);
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
		
		sumTriangle(arr);
	}

}
