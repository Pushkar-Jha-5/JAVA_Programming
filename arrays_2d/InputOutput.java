package arrays_2d;
import java.util.Scanner;

public class InputOutput {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[][] arr = new int[2][3];
		arr[0][0] = 5;
		arr[0][1] = 10;
		arr[0][2] = 15;
		arr[1][0] = 20;
		arr[1][1] = 25;
		arr[1][2] = 30;
		
		// output
		for(int i=0;i<2;i++) {
			for(int j=0;j<3;j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println();
		
		// to find length
		int m = arr.length;     // no. of rows
		System.out.println("The no of rows is : " + m);
		int n = arr[0].length;     // no. of column
		System.out.println("The no of columns is : " + n);
		System.out.println();
		
		System.out.print("Enter the no. of rows : ");
		int r = sc.nextInt();
		System.out.print("Enter the no. of columns : ");
		int c = sc.nextInt();
		
		int[][] brr = new int[r][c];
		System.out.println("Enter the elements of array : ");
		// input
		for(int i=0;i<r;i++) {
			for(int j=0;j<c;j++) {
				brr[i][j] = sc.nextInt();
			}
		}
		
		for(int i=0;i<r;i++) {
			for(int j=0;j<c;j++) {
				System.out.print(brr[i][j] + " ");
			}
			System.out.println();
		}
	}

}
