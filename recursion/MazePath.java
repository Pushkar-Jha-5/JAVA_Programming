package recursion;

import java.util.Scanner;

public class MazePath {
	// maze and maze2 are same
	
	public static int maze2(int r,int c) {
		// base case
		if(r == 1 || c == 1) {
			return 1;
		}
		// recursive case
		int right = maze2(r,c-1);
		int down = maze2(r-1,c);
		int ans = right+down;
		return ans;
	}
	                                                     
//	public static int maze(int sr,int sc,int r,int c) {
//		// base case
//		if(sr == r || sc == c) {
//			return 1;
//		}
//		// recursive case
//		int right = maze(sr,sc+1,r,c);
//		int down = maze(sr+1,sc,r,c);
//		int ans = right+down;
//		return ans;
//	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of rows : ");
		int r = sc.nextInt();
		System.out.print("Enter the number of columns : ");
		int c = sc.nextInt();
		
//		int x = maze(1,1,r,c);
//		System.out.println("The no. of ways is : " + x);
		
		int y = maze2(r,c);
		System.out.println("The no. of ways is : " + y);
	}
}
