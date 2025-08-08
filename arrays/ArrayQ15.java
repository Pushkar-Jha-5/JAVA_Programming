package arrays;

import java.util.Scanner;

public class ArrayQ15 {
	public static int countTriplet(int arr[],int n,int target) {
		int count = 0;
		for(int i=0;i<n;i++) {
			for(int j=i+1;j<n;j++) {
				for(int k=j+1;k<n;k++) {
					if(arr[i]+arr[j]+arr[k]==target) {
						count++;
					}
				}
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
		System.out.print("Enter the target element : ");
		int target = sc.nextInt();
		
		int x = countTriplet(arr,n,target);
		System.out.println("The no. of triplet is : " + x);
	}

}
