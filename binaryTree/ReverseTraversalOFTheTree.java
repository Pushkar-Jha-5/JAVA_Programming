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

public class ReverseTraversalOFTheTree {
	public static void reversePreorder(Node root) {
		if(root == null) {
			return;
		}
		System.out.print(root.val + " ");
		reversePreorder(root.right);
		reversePreorder(root.left);
	}
	
	public static void reverseInorder(Node root) {
		if(root == null) {
			return;
		}
		reverseInorder(root.right);
		System.out.print(root.val + " ");
		reverseInorder(root.left);
	}
	
	public static void reversePostorder(Node root) {
		if(root == null) {
			return;
		}
		reversePostorder(root.right);
		reversePostorder(root.left);
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
		
		System.out.println("Reverse Preorder traversal : ");
		reversePreorder(a);
		System.out.println();
		System.out.println("Reverse Inorder traversal : ");
		reverseInorder(a);
		System.out.println();
		System.out.println("Reverse Postorder traversal : ");
		reversePostorder(a);
	}

}
