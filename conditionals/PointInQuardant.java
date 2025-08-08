package conditionals;

import java.util.Scanner;

public class PointInQuardant {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the value of x : ");
		int x = sc.nextInt();
		System.out.print("Enter the value of y : ");
		int y = sc.nextInt();
		
		if(x>0 && y>0) {
			System.out.println("(" + x + "," + y + ") is in the first quadrant");
		}
		else if(x<0 && y>0) {
			System.out.println("(" + x + "," + y + ") is in the second quadrant");
		}
		else if(x<0 && y<0) {
			System.out.println("(" + x + "," + y + ") is in the third quadrant");
		}
		else if(x>0 && y<0) {
			System.out.println("(" + x + "," + y + ") is in the fourth quadrant");
		}
		else if(x!=0 && y==0) {
			System.out.println("(" + x + "," + y + ") lies on the x axis");
		}
		else if(y!=0 && x==0) {
			System.out.println("(" + x + "," + y + ") lies on the y axis");
		}
		else {
			System.out.println("(" + x + "," + y + ") is the origin");
		}
	}

}
