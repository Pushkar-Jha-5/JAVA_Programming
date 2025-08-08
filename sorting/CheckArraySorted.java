package sorting;
import java.util.Scanner;

public class CheckArraySorted {
	public static boolean checkArraySorted(int arr[],int n) {
		for(int i=0;i<n;i++) {
			for(int j=i+1;j<n;j++) {
				if(arr[i] > arr[j]) {
					return false;
				}
			}
		}
		return true;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System .in);
		System.out.print("Enter the size of array : ");
		int n = sc.nextInt();
		int[] arr = new int[n];
		System.out.print("Enter the elements of array : ");
		for(int i=0;i<n;i++) {
			arr[i] = sc.nextInt();
		}
		
		boolean x = checkArraySorted(arr,n);
		if(x) {
			System.out.println("The array is sorted");
		}
		else {
			System.out.println("The array is not sorted");
		}
	}

}
