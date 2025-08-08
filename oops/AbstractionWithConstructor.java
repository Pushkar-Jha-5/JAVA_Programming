package oops;

abstract class Personn{
	String name;
	int age;
	float height;
	
	Personn(String name,int age,float height){
		this.name = name;
		this.age = age;
		this.height = height;
	}
}

class Studentt extends Personn{
	int marks;
	float avg;
	
	Studentt(String name,int age,float height,int marks,float avg){
		// To call parameterized constructor of parent class from child class
		super(name,age,height);     // super constructor
		this.marks = marks;
		this.avg = avg;
	}
	
	public void display() {
		System.out.println("Name : " + name);
		System.out.println("Age : " + age);
		System.out.println("Height : " + height);
		System.out.println("Marks : " + marks);
		System.out.println("Average : " + avg);
	}
}

public class AbstractionWithConstructor {

	public static void main(String[] args) {
		Studentt s1 = new Studentt("Mahi",25,6.5f,95,91.5f);
		s1.display();
	}

}
