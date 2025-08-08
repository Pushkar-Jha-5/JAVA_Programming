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

public class DisplayLinkedList {
	
	public static void print(Node a) {
		Node temp = a;
		System.out.println("The linked list is : ");
		while(temp != null) {
			System.out.print(temp.val + "->");
			temp = temp.next;
		}
	}

	public static void main(String[] args) {
		// creation of node of a linked list
		Node a = new Node(10);
		Node b = new Node(20);
		Node c = new Node(30);
		Node d = new Node(40);
		Node e = new Node(50);
		
		// linking of the node
		a.next = b;
		b.next = c;
		c.next = d;
		d.next = e;
		
		// display the linked list
		// 1st method
		print(a);
		
		// 2st method
//		Node temp = a;
//		System.out.print(temp.val + "->");
//		temp = temp.next;
//		System.out.print(temp.val + "->");
//		temp = temp.next;
//		System.out.print(temp.val + "->");
//		temp = temp.next;
//		System.out.print(temp.val + "->");
//		temp = temp.next;
//		System.out.println(temp.val);
	}

}
