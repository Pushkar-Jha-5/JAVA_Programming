package oops;

// Exposing the set of services but hiding the internal implementation
abstract class Plane1{
	public abstract void takeOff();
	public abstract void fly();
	public abstract void land();
}

class PassengerPlane1 extends Plane1{
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

class CargoPlane1 extends Plane1{
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

class FighterPlane1 extends Plane1{
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

class Airport1{
	public void allowPlane(Plane ref) {
		ref.takeOff();
		ref.fly();
		ref.land();
		System.out.println();
	}
}

public class Abstraction {

	public static void main(String[] args) {
		Airport1 a1 = new Airport1();
		a1.allowPlane(new PassengerPlane());
		a1.allowPlane(new CargoPlane());
		a1.allowPlane(new FighterPlane());
	}

}
