package oops;

class Student2{
	// instance variable
	String name;
	int age;
	
	// constructor
	Student2(String name,int age){
		this.name = name;
		this.age = age;
	}
	
	// instance method
	public void display() {
		System.out.println("Name : " + name);
		System.out.println("Age : " + age); 
	}
}

public class InstanceVariable {

	public static void main(String[] args) {
		Student2 s1 = new Student2("Roman",25);
		s1.display();
		
		Student2 s2 = new Student2("Seth",27);
		s2.display();
	}

}
