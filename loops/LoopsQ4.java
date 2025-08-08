package loops;
import java.util.Scanner;

public class LoopsQ4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the string : ");
		String str = sc.nextLine();
		
		int s = 0;
		int e = str.length()-1;
		while(s<=e) {
			
			if(str.charAt(s)!=str.charAt(e)) {
				System.out.println(str + " is not a palindrome");
				return;
			}
			s++;
			e--;
		}
		System.out.println(str + " is a palindrome");
	}

}
