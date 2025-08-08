package conditionals;

import java.util.Scanner;

public class ConditionalsQ4 {
	public static void leapYear(int y) {
		if(y%4==0) {
			System.out.println(y + " is a leap year");
		}
		else {
			System.out.println(y + " is not a leap year");
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the year : ");
		int y = sc.nextInt();
		
		leapYear(y);
	}

}
