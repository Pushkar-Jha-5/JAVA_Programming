package string_builder;
import java.util.Arrays;
import java.util.Scanner;

public class MaxNoOfOccurence {
	public static void maxOccurence(String str) {
		int n = str.length();
		int[] frequency = new int[26];
		for(int i=0;i<n;i++) {
			char ch = str.charAt(i);
			int index = (int)ch - 97;
			frequency[index]++;
		}
		int maxFrequency = 0;
		for(int i=0;i<26;i++) {
			if(frequency[i]>maxFrequency) {
				maxFrequency = frequency[i];
			}
		}
		for(int i=0;i<26;i++) {
			if(frequency[i] == maxFrequency) {
				char ch = (char)(i+97);
				System.out.println("The max. no. of occurence of the char is : " + ch);
			}
		}
	}

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.print("Enter the String : ");
		String str = sc.nextLine();
		
		maxOccurence(str);
	}

}
