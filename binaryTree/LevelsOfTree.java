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

public class LevelsOfTree {
	public static int levels(Node root) {
		if(root == null) {
			return 0;
		}
		int a = levels(root.left);
		int b = levels(root.right);
		return 1+Math.max(a, b);
	}

	public static void main(String[] args) {
		Node a = new Node(5);
		Node b = new Node(10);
		Node c = new Node(15);
		Node d = new Node(20);
		Node e = new Node(25);
		Node f = new Node(30);
		Node g = new Node(35);
		
		a.left = b;
		a.right = c;
		b.left = d;
		b.right = e;
		c.left = f;
		d.left = g;
		
		int x = levels(a);
		System.out.println("The levels of the tree is : " + x);
		int h = x-1;
		System.out.println("The height of the tree is : " + h);
	}

}
