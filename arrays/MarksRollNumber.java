package arrays;
import java.util.Scanner;

public class MarksRollNumber {
	public static void printRoll(int n,int marks[]) {
		System.out.println("The roll no. of students who has marks less than 35 is : ");
		for(int i=0;i<n;i++) {
			if(marks[i]<35) {
				System.out.println(i);
			}
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of array : ");
		int n = sc.nextInt();
		int[] marks = new int[n];
		System.out.println("Enter the marks of the student : ");
		for(int i=0;i<n;i++) {
			marks[i] = sc.nextInt();
		}
		
		printRoll(n,marks);
	}

}
