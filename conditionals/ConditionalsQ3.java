package conditionals;

import java.util.Scanner;

public class ConditionalsQ3 {
	public static void profitLoss(double sp,double cp) {
		if(sp>cp) {
			System.out.println("Profit");
		}
		else if(cp>sp) {
			System.out.println("Loss");
		}
		else {
			System.out.println("Break");
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the selling price : ");
		double sp = sc.nextDouble();
		System.out.print("Enter the cost price : ");
		double cp = sc.nextDouble();
		
		profitLoss(sp,cp);
	}

}
