package binaryTree;

/*  This Node calss is already defined in this Package 
class Node{
	int val;
	Node left;
	Node right;
	
	Node(int val){
		this.val = val;
	}
}
*/

public class DisplayTree {
	public static void display(Node root) {
		// base case
		if(root == null) {
			return;
		}
		// recursive call
		System.out.print(root.val + " ");  // self value
		display(root.left);  // left sub-tree
		display(root.right);  // right sub-tree
	}

	public static void main(String[] args) {
		Node a = new Node(5);  // a is the root
		Node b = new Node(10);
		Node c = new Node(15);
		Node d = new Node(20);
		Node e = new Node(25);
		Node f = new Node(30);
		
		a.left = b;
		a.right = c;
		
		b.left = d;
		b.right = e;
		
		c.right = f;
		
		System.out.println("Traversal of the tree is : ");
		display(a);
	}

}
