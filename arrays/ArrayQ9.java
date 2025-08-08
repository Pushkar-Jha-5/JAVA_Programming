package arrays;

import java.util.Scanner;

public class ArrayQ9 {
	public static int difference(int arr[],int n) {
		int even = 0;
		int odd = 0;
		for(int i=0;i<n;i++) {
			if(i%2 == 0) {
				even += arr[i];
			}
			else {
				odd += arr[i];
			}
		}
		int difference = (even - odd);
		return difference;
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
		
		int x = difference(arr,n);
		System.out.println("The difference is : " + x);
	}

}
