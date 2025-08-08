package string_builder;

public class MaxValueInStringArray {

	public static void main(String[] args) {
		String[] str = {"55","51","58","005751","2525"};
		int max = Integer.parseInt(str[0]);
		for(int i=0;i<str.length;i++) {
			int n = Integer.parseInt(str[i]);
			if(n>max) {
				max = n;
			}
		}
		System.out.println("The max. value is : " + max);
	}

}
