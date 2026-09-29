package oopss;

public class Vehicle {
	private int speed;
	 
	
	int getSpeed() {
		return speed;
}

	
	void start() {
		System.out.println("Vehicle is started");
	}
	void stop() {
		System.out.println("Vehicle is stoped");
		
	}
}
class Car extends Vehicle{
	@Override
	void start() {
		System.out.println("Speed"+getSpeed());
		System.out.println("car is started");
	}
}
class Bike extends Vehicle{
	@Override
	void start() {
		System.out.println("Speed"+getSpeed());
		System.out.println("Bike is started");
	}
}


