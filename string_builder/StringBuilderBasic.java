package string_builder;

public class StringBuilderBasic {

	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder("Pushkar Jha");
		System.out.println(sb);
		System.out.println(sb.length());
		
		StringBuilder s = new StringBuilder("");
		System.out.println(s);
		System.out.println("Length of empty StringBuilder is : " + s.length());
		
		StringBuilder t = new StringBuilder(10);     // (10) -> capacity of the StringBuilder
		System.out.println(t.capacity());
		System.out.println(t);
		System.out.println("Length of empty StringBuilder is : " + t.length());
		
		StringBuilder x = new StringBuilder();
		System.out.println("Default capacity is : " + x.capacity());
	}

}
