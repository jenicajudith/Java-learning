package oops;

public class Company {
	
	String name;
	int salary;
	public String pro;
	
	
	
	void display() {
		System.out.println("name"+name);
		System.out.println("salary"+salary);
	}

}
class Developer extends Company{
	String pro;
	@Override
	void display() {
		System.out.println("name"+name);
		System.out.println("salary"+salary);
		System.out.println("programming"+pro);
	}

}