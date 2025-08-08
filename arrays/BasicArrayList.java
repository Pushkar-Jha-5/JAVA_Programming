package arrays;
import java.util.ArrayList;

public class BasicArrayList {

	public static void main(String[] args) {
		// in ArrayList there is no initially default value
		ArrayList<Integer> arr = new ArrayList<Integer>(5);     // int[] arr = new int[5];
		arr.add(0,5);     // arr[0] = 5; -> initialize
		arr.add(1,10);     // arr[1] = 10;
		arr.add(2,15);     // arr[2] = 15;
		arr.add(3,20);     // arr[3] = 20;
		arr.add(4,25);     // arr[4] = 25;
		for(int i=0;i<arr.size();i++) {
			System.out.print(arr.get(i) + " ");     // print arr[i]
		}
		System.out.println();
		System.out.println(arr.size());
		
		System.out.println(arr);     // print list of array
		
		arr.set(2, 18);     // modify the value
		for(int i=0;i<5;i++) {
			System.out.print(arr.get(i) + " ");     // print arr[i]
		}
		System.out.println();
		System.out.println(arr.size());
		System.out.println(arr);
		
		arr.add(28);     // push bac
		for(int i=0;i<arr.size();i++) {
			System.out.print(arr.get(i) + " ");     
		}
		System.out.println();
		System.out.println(arr.size());
		System.out.println(arr);
		
		arr.remove(2);  // remove any element from the list
		for(int i=0;i<arr.size();i++) {
			System.out.print(arr.get(i) + " ");     
		}
		System.out.println();
		System.out.println(arr.size());
		System.out.println(arr);
		
		
	}

}
