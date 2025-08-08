package cycleSort;

import java.util.Scanner;

public class CyclicSort2 {
	public static void cyclicSort2(int arr[],int n) {
		int i = 0;
		while(i < n) {
			int x = i+1;
			if(arr[i] == x) {
				i++;
			}
			else {
				int temp = arr[i];
				arr[i] = x;
				x = temp;
			}
		}
		System.out.print("The array after cyclic sort is : ");
		for(int j=0;j<n;j++) {
			System.out.print(arr[j] + " ");
		}
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
		
		cyclicSort2(arr,n);
	}

}
