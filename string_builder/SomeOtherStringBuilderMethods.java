package string_builder;

public class SomeOtherStringBuilderMethods {

	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder("abcdef");
		System.out.println(sb);
		
		sb.deleteCharAt(3);
		System.out.println("deleteCharAt() : " + sb);
		
		sb.append("xyz");
		System.out.println("append() : " + sb);
		
		sb.delete(2, 6);     // delete(2,6) -> means delete element from index "2" to "5"
		System.out.println("delete() : " + sb);
		
		sb.insert(2, 'k');     // (2,'k') -> means index "2" pe char 'k' insert karna
		System.out.println("insert() : " + sb);
		
		sb.insert(1, 5);     // (1,5) -> means index "1" pe integer "5" insert karna
		System.out.println("           " + sb);
		
		sb.reverse();
		System.out.println("reverse() : " + sb);
		
		
	}

}
