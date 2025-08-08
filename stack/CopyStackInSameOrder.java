package stack;
import java.util.Scanner;
import java.util.Stack;

public class CopyStackInSameOrder {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Stack<Integer> st1 = new Stack<>();
		System.out.print("Enter the size : ");
		int n = sc.nextInt();
		System.out.println("Enter the elements of the stack : ");
		for(int i=0;i<n;i++) {
			st1.push(sc.nextInt());
		}
		System.out.println("Given stack : " + st1);
		Stack<Integer> temp = new Stack<>();
		while(!st1.isEmpty()) {
			temp.push(st1.pop());
		}
		System.out.println("Reversed stack : " + temp);
		Stack<Integer> original = new Stack<>();
		while(!temp.isEmpty()) {
			original.push(temp.pop());
		}
		System.out.println("Same order stack : " + original);
	}

}
