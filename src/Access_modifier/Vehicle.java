package Access_modifier;

public class Vehicle {
 void start() {
	 System.out.println("vehicle started");
 }
 void stop() {
	 System.out.println("vehicle stopped");
 }
}
class Car extends Vehicle{
	void Start() {
		System.out.println("car started");
		
	}
}
class Bike extends Vehicle{
	void Start() {
		System.out.println("Bike started");
	}
}

