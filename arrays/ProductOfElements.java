package arrays;

import java.util.Scanner;

public class ProductOfElements {
	public static int productElements(int n,int arr[]){
		int product = 1;
		for(int i=0;i<n;i++) {
			product*=arr[i];
		}
		return product;
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
		
		int x = productElements(n,arr);
		System.out.print("The product of the elements of array is : " + x);
	}

}
