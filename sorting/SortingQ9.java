package sorting;
import java.util.Arrays;
import java.util.Scanner;

public class SortingQ9 {
	public static int minSum(int arr[],int n) {
		Arrays.sort(arr);
		int n1 = 0;
		int n2 = 0;
		for(int i=0;i<n;i++) {
			if(i%2 == 0) {
				n1 = n1*10+arr[i];
			}
			else {
				n2 = n2*10+arr[i];
			}
		}
		return (n1+n2);
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
		
		int x = minSum(arr,n);
		System.out.println("The min. sum is : " + x);
	}

}
