package arrays_2d;

public class BasicDeclaration {

	public static void main(String[] args) {
		int[][] arr = new int[2][3];
		arr[0][0] = 5;
		arr[0][1] = 10;
		arr[0][2] = 15;
		arr[1][0] = 20;
		arr[1][1] = 25;
		arr[1][2] = 30;
		
		System.out.println(arr[0][0]);
		System.out.println(arr[0][1]);
		System.out.println(arr[0][2]);
		System.out.println(arr[1][0]);
		System.out.println(arr[1][1]);
		System.out.println(arr[1][2]);
	}

}
