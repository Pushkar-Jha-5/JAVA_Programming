package strings;
import java.util.Scanner;

public class StringQ1 {
	public static void update(String str) {
		String ans = "";
		int n = str.length();
		for(int i=0;i<n;i++) {
			char ch = str.charAt(i);
			if(i%2 == 0) {
				ans += ch;
			}
			else {
				ch = '#';
				ans += ch;
			}
		}
		System.out.println("The updated string is : " + ans);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the string : ");
		String str = sc.nextLine();
		
		update(str);
	}

}
