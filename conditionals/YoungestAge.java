package conditionals;

import java.util.Scanner;

public class YoungestAge {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the age of Ram : ");
		int r = sc.nextInt();
		System.out.print("Enter the age of Shyam : ");
		int s = sc.nextInt();
		System.out.print("Enter the age of Ajay : ");
		int a = sc.nextInt();
		
		if(r<s) {
			if(r<a) {
				System.out.println("Ram is youngest with age " + r);
			}
			else {     // r>=a
				System.out.println("Ajay is youngest with age " + a);
			}
		}
		else {     // r>=s
			if(s<r) {
				System.out.println("Shyam is youngest with age " + s);
			}
			else {     // s>=r
				System.out.println("Ajay is youngest with age " + a);
			}
		}
	}

}
