package oops;

class Person{     // parent or super or base class
	public String name;
	public String address;
	public int age;
}

class Student1 extends Person{     // derived or child class
	// instance variable
	public int marks;
	public String grade;
	
	
	// constructor
	Student1(String name,String address,int age,int marks,String grade){
		System.out.println("Called during object creation");
		this.name = name;
		this.address = address;
		this.age = age;
		this.marks = marks;
		this.grade = grade;
	}
	
	// normal method
	public void display() {
		System.out.println("Name : " + name);
		System.out.println("Address : " + address);
		System.out.println("Age : " + age);
		System.out.println("Marks : " + marks);
		System.out.println("Grade : " + grade);
	}
}

public class Inheritance {

	public static void main(String[] args) {
		Student1 s1 = new Student1("Roman","abcde12345",25,95,"A");
		s1.display();
	}

}
