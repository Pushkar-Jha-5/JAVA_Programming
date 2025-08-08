package arrays_2d;

import java.util.Scanner;

public class Array2DQ11 {
	public static void spiralForm(int arr[][],int r,int c) {
		int minR = 0;
		int maxR = r-1;
		int minC = 0;
		int maxC = c-1;
		System.out.println("The spiral form of the array is : ");
		while(minR<=maxR && minC<=maxC) {
			for(int j=minC;j<=maxC;j++) {
				System.out.print(arr[minR][j] + " ");
			}
			minR++;
			
			if(minR>maxR || minC>maxC) {
				break;
			}
			for(int i=minR;i<=maxR;i++) {
				System.out.print(arr[i][maxC] + " ");
			}
			maxC--;
			
			if(minR>maxR || minC>maxC) {
				break;
			}
			for(int j=maxC;j>=minC;j--) {
				System.out.print(arr[maxR][j] + " ");
			}
			maxR--;
			
			if(minR>maxR || minC>maxC) {
				break;
			}
			for(int i=maxR;i>=minR;i--) {
				System.out.print(arr[i][minC] + " ");
			}
			minC++;
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
		
		spiralForm(arr,r,c);
	}

}
