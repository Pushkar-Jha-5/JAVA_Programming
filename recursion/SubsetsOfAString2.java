package recursion;

import java.util.Scanner;

public class SubsetsOfAString2 {
	public static void subsets(int n,int k,int i,String ans) {
		if(i>n || ans.length() == k) {
			System.out.print(ans + " ");
			return;
		}
		subsets(n,k,i+1,ans+i);
		subsets(n,k,i+1,ans);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the value of n : ");
		int n = sc.nextInt();
		System.out.print("Enter the value of k : ");
		int k = sc.nextInt();
		
		System.out.print("The updated string is : ");
		subsets(n,k,1,"");
	}

}
