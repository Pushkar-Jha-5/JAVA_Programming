package arrays;

import java.util.Arrays;

public class CopyOfArray {

	public static void main(String[] args) {
		int[] arr = {5,10,65,25,16,12,27,18,42,55};
		for(int x:arr) {
			System.out.print(x + " ");
		}
		System.out.println();
		
		// copy of one array to the another array
		// shallow copy -> arr ka naam sirf change hoke nums ho gya hai,dono same hi hai
		int[] nums = arr;
		for(int i=0;i<nums.length;i++) {
			System.out.print(nums[i] + " ");
		}
		System.out.println();
		nums[0] = 8;
		System.out.println(nums[0]);
		System.out.println(arr[0]);
		
		// deep copy -> brr ek new array ban gaya aur brr ke element ko change karne se arr ke element pe koi fark nahi parega
		int[] brr = Arrays.copyOf(arr, arr.length);
		for(int a:brr) {
			System.out.print(a + " ");
		}
		System.out.println();
		brr[0] = 9;
		System.out.println(brr[0]);
		System.out.println(arr[0]);
	}

}
