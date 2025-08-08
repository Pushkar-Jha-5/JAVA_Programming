package binary_search;

import java.util.Scanner;

public class SquareRoot {
	public static int squareRoot(int x) {
        long s = 0;
        long e = (long)x;
        long mid = s+(e-s)/2;
        while(s <= e){
            mid = s+(e-s)/2;
            if(mid*mid == x){
                return (int)mid;
            }
            else if(mid*mid>x){
                e = mid-1;
            }
            else{
                s = mid+1;
            }
        }
        return (int)e;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number : ");
		int x = sc.nextInt();
		
		int k = squareRoot(x);
		System.out.println("The square root of " + x + " is " + k);
	}

}
