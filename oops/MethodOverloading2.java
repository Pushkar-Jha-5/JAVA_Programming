package oops;

class Sample{
	public void methodOne(String str) {
		System.out.println("String version");
	}
	public void methodOne(Object o) {
		System.out.println("Object version");
	}
}

public class MethodOverloading2 {

	public static void main(String[] args) {
		Sample s = new Sample();
		s.methodOne("abc");     // String -> String
		s.methodOne(new Object());     // Object -> Object
		s.methodOne(null);     // null -> String(reference type) > Object(reference type)
	}

}
