package oops;

class Plane{
	public void takeOff() {
		System.out.println("Plane tookoff");
	}
	public void fly() {
		System.out.println("Plane is flying");
	}
	public void land() {
		System.out.println("Plane is landing");
	}
}

class PassengerPlane extends Plane{
	public void takeOff() {
		System.out.println("Passenger-Plane tookoff");
	}
	public void fly() {
		System.out.println("Passenger-Plane is flying");
	}
	public void land() {
		System.out.println("Passenger-Plane is landing");
	}
}

class CargoPlane extends Plane{
	public void takeOff() {
		System.out.println("Cargo-Plane tookoff");
	}
	public void fly() {
		System.out.println("Cargo-Plane is flying");
	}
	public void land() {
		System.out.println("Cargo-Plane is landing");
	}
}

class FighterPlane extends Plane{
	public void takeOff() {
		System.out.println("Fighter-Plane tookoff");
	}
	public void fly() {
		System.out.println("Fighter-Plane is flying");
	}
	public void land() {
		System.out.println("Fighter-Plane is landing");
	}
}

class Airport{
	// True Polymorphism
	public void allowPlane(Plane p) {
		p.takeOff();
		p.fly();
		p.land();
		System.out.println();
	}
}

public class MethodOverriding2 {

	public static void main(String[] args) {
		/*
		// 1st Method
		Plane p1 = null;
		// PassengerPlane class called
		p1 = new PassengerPlane();
		p1.takeOff();
		p1.fly();
		p1.land();
		System.out.println();
		
		// CargoPlane class called
		p1 = new CargoPlane();
		p1.takeOff();
		p1.fly();
		p1.land();
		System.out.println();
		
		// FighterPlane class called
		p1 = new FighterPlane();
		p1.takeOff();
		p1.fly();
		p1.land();
		*/
		
		// 2nd Method
		PassengerPlane p1 = new PassengerPlane();
		CargoPlane c1 = new CargoPlane();
		FighterPlane f1 = new FighterPlane();
		
		Airport a = new Airport();
		a.allowPlane(p1);
		a.allowPlane(c1);
		a.allowPlane(f1);
	}

}
