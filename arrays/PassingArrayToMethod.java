package arrays;

public class PassingArrayToMethod {
	public static void change(int arr[]) {
		arr[0] = 8;
	}

	public static void main(String[] args) {
		int[] arr = {5,10,15,20,25};
		System.out.println("Before change : " + arr[0]);
		// array is passed to method by pass by reference
		change(arr);
		System.out.println("After change : " + arr[0]);
	}

}
