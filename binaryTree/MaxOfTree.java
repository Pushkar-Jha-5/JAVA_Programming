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

public class MaxOfTree {
	public static int max(Node root) {
		if(root == null) {
			return Integer.MIN_VALUE;
		}
		int x = root.val;
		int y = max(root.left);
		int z = max(root.right);
		return Math.max(x, Math.max(y, z));
	}

	public static void main(String[] args) {
		Node a = new Node(2);
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
		
		int x = max(a);
		System.out.println("The max value of tree is : " + x);
	}

}
