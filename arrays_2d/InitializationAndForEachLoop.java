package arrays_2d;

public class InitializationAndForEachLoop {

	public static void main(String[] args) {
		int[][] arr = {{5,10,15},{20,25,30}};
		// from for loop
		for(int i=0;i<2;i++) {
			for(int j=0;j<3;j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println();
		
		int[][] brr = {{2,4,6},{1,3,5}};
		// from for each loop
		for(int[] element:brr) {
			for(int x:element) {
				System.out.print(x + " ");
			}
			System.out.println();
		}
	}

}
