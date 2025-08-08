package binary_search;

import java.util.Scanner;

public class BSQ5 {
	public static boolean perfectSquare(int n) {
		int s = 1;
		int e = n;
		int mid = s+(e-s)/2;
		boolean flag = false;
		while(s <= e) {
			mid = s+(e-s)/2;
			if(mid*mid == n) {
				flag = true;
				break;
			}
			else if(mid*mid > n) {
				e = mid-1;
			}
			else {
				s = mid+1;
			}
		}
		if(flag == true) {
			return true;
		}
		else {
			return false;
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number : ");
		int n = sc.nextInt();
		
		boolean x = perfectSquare(n);
		if(x) {
			System.out.println(n + " is a perfect square");
		}
		else {
			System.out.println(n + " is not a perfect square");
		}
	}

}
