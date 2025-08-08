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

public class TraversalOfTheTree {
	public static void preorder(Node root) {
		if(root == null) {
			return;
		}
		System.out.print(root.val + " ");
		preorder(root.left);
		preorder(root.right);
	}
	
	public static void inorder(Node root) {
		if(root == null) {
			return;
		}
		inorder(root.left);
		System.out.print(root.val + " ");
		inorder(root.right);
	}
	
	public static void postorder(Node root) {
		if(root == null) {
			return;
		}
		postorder(root.left);
		postorder(root.right);
		System.out.print(root.val + " ");
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
		c.right = g;
		
		System.out.println("Preorder traversal : ");
		preorder(a);
		System.out.println();
		System.out.println("Inorder traversal : ");
		inorder(a);
		System.out.println();
		System.out.println("Postorder traversal : ");
		postorder(a);
	}
}
