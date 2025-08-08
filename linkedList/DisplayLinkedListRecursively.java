package linkedList;

/*
class Node{
	int val;
	Node next;
	
	Node(int val){
		this.val = val;
	}
}
*/

public class DisplayLinkedListRecursively {
	
	public static void printRecursively(Node a,Node temp) {
		if(temp == null) {
			return;
		}
		System.out.print(temp.val + "->");
		printRecursively(a,temp.next);
	}

	public static void main(String[] args) {
		Node a = new Node(10);
		Node b = new Node(20);
		Node c = new Node(30);
		Node d = new Node(40);
		Node e = new Node(50);
		
		a.next = b;
		b.next = c;
		c.next = d;
		d.next = e;
		
		Node temp = a;
		System.out.println("The linked list is : ");
		printRecursively(a,temp);
	}

}
