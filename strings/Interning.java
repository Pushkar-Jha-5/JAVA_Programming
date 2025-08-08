package strings;

// interning means -> to save space
public class Interning {

	public static void main(String[] args) {
		String str = "Dean";
//		str.charAt(1) = 'x';     // error
//		str.charAt(2) = 'y';     // error
		
		str = "Ambrose";
		System.out.println(str);
		
		String s = new String("Ambrose");     // naya string bana hai
		System.out.println(s);
	}

}
