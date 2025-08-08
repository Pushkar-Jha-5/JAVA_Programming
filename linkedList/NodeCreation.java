package linkedList;

class Node{
	int val;
	Node next;
	
	Node(int val){
		this.val = val;
	}
}

public class NodeCreation {

	public static void main(String[] args) {
		Node a = new Node(10);
		System.out.println("a -> val : " + a.val + " || a -> next : " + a.next);
		Node b = new Node(20);
		System.out.println("b -> val : " + b.val + " || b -> next : " + b.next);
		Node c = new Node(30);
		System.out.println("c -> val : " + c.val + " || c -> next : " + c.next);
		Node d = new Node(40);
		System.out.println("d -> val : " + d.val + " || d -> next : " + d.next);
		Node e = new Node(50);
		System.out.println("e -> val : " + e.val + " || e -> next : " + e.next);
		
		// linking : a -> b
		a.next = b;     // a.next = b
		System.out.println("a.next : " + a.next);
		System.out.println("b : " + b);
		
		a.next = b;     // 10->20
		b.next = c;     // 10->20->30
		c.next = d;     // 10->20->30->40
		d.next = e;     // 10->20->30->40->50
		
		System.out.println("Value of all node using only node a : ");
		System.out.print(a.val + "->");
		System.out.print(a.next.val + "->");
		System.out.print(a.next.next.val + "->");
		System.out.print(a.next.next.next.val + "->");
		System.out.println(a.next.next.next.next.val);
	}
}
