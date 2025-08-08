package arrays;

public class BasicSyntax {

	public static void main(String[] args) {
		int[] arr = new int[5];
		// initializing individual elements
		arr[0] = 5;
		arr[1] = 10;
		arr[2] = 15;
		arr[3] = 20;
		arr[4] = 25;
		
		// output the array elements
		System.out.println(arr[0]);
		
		// update
		arr[0] = 8;
		System.out.println(arr[0]);
		arr[0]+=4;
		System.out.println(arr[0]);
	}

}
