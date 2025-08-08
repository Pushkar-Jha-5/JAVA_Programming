package arrays_2d;

public class Array2DQ1 {

	public static void main(String[] args) {
		int[][] arr = new int[5][5];
		for(int i=0;i<5;i++) {
			for(int j=0;j<5;j++) {
				arr[i][j] = 10;
			}
		}
		
		System.out.println("The array after storing 10 at each index is : ");
		for(int i=0;i<5;i++) {
			for(int j=0;j<5;j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}

}
