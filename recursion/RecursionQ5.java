package recursion;

import java.util.Scanner;

public class RecursionQ5 {
	public static int searching(int arr[],int n,int i,int target) {
		if(i == n) {
			return -1;
		}
		if(arr[i] == target) {
			return i;
		}
		return searching(arr,n,i+1,target);
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
		System.out.print("Enter the target : ");
		int target = sc.nextInt();
		
		int x = searching(arr,n,0,target);
		System.out.println("The " + target + " found at index " + x);
		
	}

}
