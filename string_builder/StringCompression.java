package string_builder;
import java.util.Scanner;

public class StringCompression {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the string : ");
		String str = sc.nextLine();
		char[] ch = str.toCharArray();
		String ans = "";
		int i = 0;
		int j = 0;
		while(j<ch.length) {
			if(ch[j] == ch[i]) {
				j++;
			}
			else {
				ans += ch[i];
				int len = j-i;
				if(len>1) {
					ans += len;
				}
				i = j;
			}
		}
		ans += ch[i];
		int len = j-i;
		if(len>1) {
			ans += len;
		}
		System.out.println("The compressed string is : " + ans);
		
	}

}
