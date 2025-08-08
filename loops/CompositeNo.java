package loops;
import java.util.Scanner;

public class CompositeNo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number : ");
		int n = sc.nextInt();
		if(n<=2) {
			System.out.println(n + " is not a composite number");
		}
		for(int i=2;i<n;i++) {
			if(n%i==0) {
				System.out.println(n + " is a composite number");
				break;
			}
			else {
				System.out.println(n + " is not a composite number");
				break;
			}
		}
	}

}
