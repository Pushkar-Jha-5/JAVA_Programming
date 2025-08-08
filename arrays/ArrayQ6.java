package arrays;

import java.util.Scanner;

public class ArrayQ6 {
	public static int count(int arr[],int n,int x) {
		int count = 0;
		for(int i=0;i<n;i++) {
			if(arr[i]>x) {
				count++;
			}
		}
		return count;
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
		System.out.print("Enter the value of x : ");
		int x = sc.nextInt();
		
		int ans = count(arr,n,x);
		System.out.println("The no. of element greater than " + x + " is : " + ans);
	}

}
