package strings;

import java.util.Scanner;

public class StringQ7 {
	public static int secondGreatest(String str) {
		char[] ch = str.toCharArray();
		int n = ch.length;
		int arr[] = new int[n];
		for(int i=0;i<n;i++) {
			char x = ch[i];
			arr[i] = x-48;
		}
		int max = arr[0];
		for(int i=0;i<n;i++) {
			if(arr[i]>max) {
				max = arr[i];
			}
		}
		int max2 = arr[0];
		for(int i=0;i<n;i++) {
			if(arr[i]>max2 && arr[i]<max) {
				max2 = arr[i];
			}
		}
		return max2;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the string : ");
		String str = sc.nextLine();
		
		int x = secondGreatest(str);
		System.out.println("The 2nd greatest element is : " + x);
	}

}
