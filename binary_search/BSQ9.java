package binary_search;

import java.util.Scanner;

public class BSQ9 {
	public static void searchingIn2DArray(int arr[][],int r,int c,int target) {
		int sr = 0;
		int er = r-1;
		int sc = 0;
		int ec = c-1;
		int midR = sr+(er-sr)/2;
		int midC = sc+(ec-sc)/2;
		while(sr <= er && sc <= ec) {
			midR = sr+(er-sr)/2;
			midC = sc+(ec-sc)/2;
			if(arr[midR][midC] == target) {
				System.out.println("Target is found");
				return;
			}
			else if(arr[midR][midC] > target) {
				er = midR-1;
				ec = midC-1;
			}
			else {
				sr = midR+1;
				sc = midC+1;
			}
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the row of array : ");
		int r = sc.nextInt();
		System.out.print("Enter the column of array : ");
		int c = sc.nextInt();
		int[][] arr = new int[r][c];
		System.out.print("Enter the elements of the array : ");
		for(int i=0;i<r;i++) {
			for(int j=0;j<c;j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		System.out.print("Enter the target : ");
		int target = sc.nextInt();
		
		searchingIn2DArray(arr,r,c,target);
	}

}
