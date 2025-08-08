package conditionals;

import java.util.Scanner;

public class StudentMarks {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the marks of the student : ");
		int n = sc.nextInt();
		
		if(n>80 && n<101) {
			System.out.println("Very good");
		}
		else if(n>60 && n<81) {
			System.out.println("Good");
		}
		else if(n>40 && n<61) {
			System.out.println("Average");
		}
		else {
			System.out.println("Fail");
		}
	}

}
