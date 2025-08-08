package recursion;

import java.util.Scanner;

public class RecursionQ9 {
	public static void sequence(int n,int k,int i,String str) {
		if(i > n || str.length() == k ) {
			System.out.print(str + " ");
			return;
		}
		sequence(n,k,i+1,str);
		sequence(n,k,i+1,str+i);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number : ");
		int n = sc.nextInt();
		System.out.print("Enter the value of k : ");
		int k = sc.nextInt();
		
		sequence(n,k,1,"");
	}

}
