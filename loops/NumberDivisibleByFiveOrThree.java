package loops;

public class NumberDivisibleByFiveOrThree {

	public static void main(String[] args) {
		for(int i=1;i<=100;i++) {
			if(i%5==0 || i%3==0) {
				System.out.print(i + " ");
			}
		}
	}

}
