package arrays;

import java.util.Scanner;

public class SumOfElements {
	public static int sumElements(int n,int arr[]){
		int sum = 0;
		for(int i=0;i<n;i++) {
			sum+=arr[i];
		}
		return sum;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of array : ");
		int n = sc.nextInt();
		int[] arr = new int[n];
		System.out.println("Enter the elements of the array : ");
		for(int i=0;i<n;i++) {
			arr[i] = sc.nextInt();
		}
		
		int x = sumElements(n,arr);
		System.out.print("The sum of the elements of array is : " + x);
	}

}
