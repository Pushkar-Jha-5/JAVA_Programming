package string_builder;

public class StringBuliderMethods {

	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder("pushkar");
		StringBuilder s = new StringBuilder("rollins");
		System.out.println("compareTo() : " + sb.compareTo(s));
		System.out.println("reverse() : " + sb.reverse());
		
		StringBuilder str = new StringBuilder("true legend");
		// (index,char);
		str.setCharAt(2, 'x');
		System.out.print("setCharAt() : " + str);
		
		StringBuilder a = new StringBuilder("Pushkar");
		System.out.println(a);
		a.append(5);
		System.out.println("append() : " + a);
		a.append("abc");
		System.out.println("           " + a);
		a.append('*');
		System.out.println("           " + a);
		char[] ch = {'A','B','C'};
		a.append(ch);
		System.out.println("           " + a);
		
		// it does not append
//		int[] arr = {8,16,24};
//		a.append(arr);
//		System.out.println("           " + a);
		
		StringBuilder b = new StringBuilder("Rollins");
		a.append(b);
		System.out.println("           " + a);
		
		System.out.println();
	}

}
