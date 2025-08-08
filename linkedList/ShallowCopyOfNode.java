package linkedList;

// class Node is always used in this package
/*
class Node{
	int val;
	Node next;
	
	Node(int val){
		this.val = val;
	}
}
*/

public class ShallowCopyOfNode {

	public static void main(String[] args) {
		Node a = new Node(10);
		System.out.println("By the Node a : " + a.val);
		 // shallow copy -> value of a is assigned to the temp node
		Node temp = a;
		System.out.println("By the temp Node : " + temp.val);
		
		temp.val = 20;
		System.out.println("Value of temp is : " + temp.val);
		System.out.println("Value of a is : " + a.val);
		
		// deep copy -> new temp node formed
		//Node temp = new Node(100);
	}

}
