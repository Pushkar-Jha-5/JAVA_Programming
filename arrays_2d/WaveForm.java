package arrays_2d;

import java.util.Scanner;

public class WaveForm {
	public static void waveForm(int arr[][],int r,int c) {
		System.out.print("The waveform of matrix is : ");
		for(int i=0;i<r;i++) {
				if(i%2 == 0) {
					for(int j=0;j<c;j++) {
						System.out.print(arr[i][j] + " ");
					}
				}
				else {
					for(int j=c-1;j>=0;j--) {
						System.out.print(arr[i][j] + " ");
					}
				}
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the no. of rows : ");
		int r = sc.nextInt();
		System.out.print("Enter the no. of columns : ");
		int c = sc.nextInt();
		
		int[][] arr = new int[r][c];
		System.out.println("Enter the elements of the array : ");
		for(int i=0;i<r;i++) {
			for(int j=0;j<c;j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		
		waveForm(arr,r,c);
	}

}
