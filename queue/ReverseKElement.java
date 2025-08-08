package queue;
import java.util.*;

public class ReverseKElement {
	
	public static void reverseElement(Queue<Integer> q,int k) {
		Stack<Integer> st = new Stack<Integer>();
		Stack<Integer> helper = new Stack<Integer>();
		int n = q.size()-k;
		for(int i=1;i<=k;i++) {
			st.push(q.poll());
		}
		while(!st.isEmpty()) {
			q.add(st.pop());
		}
		for(int i=1;i<=n;i++) {
			st.push(q.poll());
		}
		while(!st.isEmpty()) {
			helper.push(st.pop());
		}
		while(!helper.isEmpty()) {
			q.add(helper.pop());
		}
		System.out.println("The queue is : ");
		System.out.println(q);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Queue<Integer> q = new LinkedList<Integer>();
		q.add(5);
		q.add(10);
		q.add(15);
		q.add(20);
		q.add(25);
		
		System.out.print("Enter the value of k : ");
		int k = sc.nextInt();
		
		reverseElement(q,k);
	}

}
