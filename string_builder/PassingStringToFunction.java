package string_builder;

public class PassingStringToFunction {
	public static void change(String str) {
		str = "Rollins";
	}

	public static void main(String[] args) {
		String str = "Pushkar";
		System.out.println("Before change : " + str);
		
		change(str);
		
		// there is no change as string is passed in function by pass by value
		System.out.println("After change : " + str);
	}

}
