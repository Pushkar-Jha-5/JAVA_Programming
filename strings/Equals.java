package strings;

public class Equals {

	public static void main(String[] args) {
		String str = "abcxyz";
		String s = "abc";
		s += "xyz";
		System.out.println(str);
		System.out.println(s);
		
		System.out.println(str==s);
		
		System.out.println("equals() : " + str.equals(s));
		
		str = s;
		System.out.println(str==s);
	}

}
