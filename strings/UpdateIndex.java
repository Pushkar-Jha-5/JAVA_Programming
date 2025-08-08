package strings;
import java.util.Scanner;

public class UpdateIndex {
	public static void updateIndex(String str) {
		String ans = "";
		int n = str.length();
		for(int i=0;i<n;i++) {
			if(i%2 == 0) {
				ans += 'a';
			}
			else {
				ans += str.charAt(i);
			}
		}
		str = ans;
		System.out.print(str);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the string : ");
		String str = sc.nextLine();
		
		updateIndex(str);
	}

}
