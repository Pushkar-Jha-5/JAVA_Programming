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

public class ProductOfNodes {
	static int res = 1;
	public static int product(Node root) {
		if(root == null) {
			return 1;
		}
		res = res*root.val;
		product(root.left);
		product(root.right);
		return res;
	}

	public static void main(String[] args) {
		Node a = new Node(1);
		Node b = new Node(2);
		Node c = new Node(3);
		Node d = new Node(4);
		Node e = new Node(5);
		Node f = new Node(6);
		Node g = new Node(7);
		
		a.left = b;
		a.right = c;
		b.left = d;
		b.right = e;
		c.left = f;
		d.left = g;
		
		int x = product(a);
		System.out.println("The product of nodes is : " + x);
	}

}
