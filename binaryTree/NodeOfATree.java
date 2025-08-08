package binaryTree;

class Node{
	int val;
	Node left;
	Node right;
	
	Node(int val){
		this.val = val;
	}
}

public class NodeOfATree {
	public static void main(String[] args) {
		Node a = new Node(1);  // a is the root
		Node b = new Node(4);
		Node c = new Node(3);
		Node d = new Node(2);
		Node e = new Node(6);
		Node f = new Node(5);
		
		a.left = b;
		a.right = c;
		
		b.left = d;
		b.right = e;
		
		c.right = f;
		f.val = 27;
		
		System.out.println("Value of b : " + b.val);
		System.out.println("Value of b : " + a.left.val);
		System.out.println("value of e : " + a.left.right.val);
		System.out.println("Value of f : " + f.val);

	}
}
