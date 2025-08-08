package arrays;

import java.util.Arrays;

public class BuiltInMethod {

	public static void main(String[] args) {
		int[] arr = {5,10,65,25,16,12,27,18,42,55};
		// for-each loop
		for(int x:arr) {
			System.out.print(x + " ");
		}
		System.out.println();
		Arrays.sort(arr);
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i] + " ");
		}
	}

}
