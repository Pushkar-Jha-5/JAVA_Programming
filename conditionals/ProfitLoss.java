package conditionals;

import java.util.Scanner;

public class ProfitLoss {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the selling price : ");
		double sp = sc.nextDouble();
		System.out.print("Enter the cost price : ");
		double cp = sc.nextDouble();
		
		if(sp>cp) {
			System.out.println("Profit");
			double p = sp - cp;
			System.out.println("Profit is " + p);
		}
		else if(sp==cp) {
			System.out.println("No profit no loss");
		}
		else {
			System.out.println("Loss");
			double l = cp - sp;
			System.out.println("Loss is " + l);
		}
	}

}
