package binarysearchtree;

class TreeNode{
	int val;
	TreeNode left;
	TreeNode right;
	
	TreeNode(int val){
		this.val = val;
	}
}

public class BSTMin {
	public static int min(TreeNode root) {
		if(root.left == null) {
			return root.val;
		}
		return min(root.left);
	}
	
	public static int max(TreeNode root) {
		if(root.right == null) {
			return root.val;
		}
		return max(root.right);
	}

	public static void main(String[] args) {
		TreeNode a = new TreeNode(25);
		TreeNode b = new TreeNode(15);
		TreeNode c = new TreeNode(55);
		TreeNode d = new TreeNode(10);
		TreeNode e = new TreeNode(18);
		TreeNode f = new TreeNode(51);
		TreeNode g = new TreeNode(57);
		
		a.left = b;
		a.right = c;
		b.left = d;
		b.right = e;
		c.left = f;
		c.right = g;
		
		int x = min(a);
		System.out.println("The min. of the BST is : " + x);
		int y = max(a);
		System.out.println("The max. of the BST is : " + y);
	}

}
