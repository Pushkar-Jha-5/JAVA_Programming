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

public class MinOfTree {
	public static int min(Node root) {
		if(root == null) {
			return Integer.MAX_VALUE;
		}
		int a = root.val;
		int b = min(root.left);
		int c = min(root.right);
		return Math.min(a, Math.min(b, c));
	}

	public static void main(String[] args) {
		Node a = new Node(18);
		Node b = new Node(5);
		Node c = new Node(12);
		Node d = new Node(16);
		Node e = new Node(25);
		Node f = new Node(21);
		Node g = new Node(7);
		
		a.left = b;
		a.right = c;
		b.left = d;
		b.right = e;
		c.left = f;
		d.left = g;
		
		int x = min(a);
		System.out.println("The min value of tree is : " + x);
	}

}
