package oops;

class Employee{
	private int age;
	private String id;
	private String name;
	private String address;
	
	public void setAge(int age) {
		this.age = age;
	}
	public void setId(String id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	public int getAge() {
		return age;
	}
	public String getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public String getAddress() {
		return address;
	}
}

public class EmployeeApp {

	public static void main(String[] args) {
		Employee e1 = new Employee();
		
		e1.setAge(25);
		e1.setId("a*1");
		e1.setName("Roman");
		e1.setAddress("abcde12345");
		
		System.out.println("Age : " + e1.getAge());
		System.out.println("Id : " + e1.getId());
		System.out.println("Name : " + e1.getName());
		System.out.println("Address : " + e1.getAddress());
	}

}
