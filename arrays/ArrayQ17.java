package arrays;

import java.util.Scanner;

public class ArrayQ17 {
	public static void firstNonrepeating(int arr[],int n) {
		for(int i=0;i<n;i++) {
			int j;
			for(j=i+1;j<n;j++) {
				if(arr[i] == arr[j]) {
					break;
				}
			}
			if(j == n) {
				System.out.println("The 1st non repeating element is : " + arr[i]);
				return;
			}
		}
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
		
		firstNonrepeating(arr,n);
	}

}
