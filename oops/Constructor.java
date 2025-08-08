package oops;

class Employee1{
	// instance variable
	String name;
	int age;
	
	// zero argument constructor
	Employee1(){
		System.out.println("Employee constructor called");
	}
	
	// parametrized constructor
	Employee1(String name,int age){
		this.name = name;
		this.age = age;
	}
	
	// instance method
	public void display() {
		System.out.println("Name : " + name);
		System.out.println("Age : " + age);
	}
}

public class Constructor {

	public static void main(String[] args) {
		Employee1 e1 = new Employee1();
		e1.display();
		Employee1 e2 = new Employee1("Roman",25);
		e2.display();
	}

}
