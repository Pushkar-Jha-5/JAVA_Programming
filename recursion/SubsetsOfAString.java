package recursion;
import java.util.Scanner;
import java.util.ArrayList;

public class SubsetsOfAString {
	static ArrayList<String> arr = new ArrayList<String>();     // global
	public static void subsets(String str,int i,String ans) {
		if(i == str.length()) {
			System.out.print(ans + " ");
			arr.add(ans);
			return;
		}
		char ch = str.charAt(i);
		subsets(str,i+1,ans);        // not taking char
		subsets(str,i+1,ans+ch);     // taking char
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the string : ");
		String str = sc.nextLine();
		arr = new ArrayList<>();     // reset
		
		System.out.println("The subsets is : ");
		subsets(str,0,"");
		System.out.println();
		System.out.print("From arraylist : " + arr);
	}

}
