package oopss;

public class Polymorphism {
	 public static void main(String[] args) {
		 Polymorphism p;
		 p=new Upi();
		 p.pay();
		 p=new Cash();
		 p.pay();
		 p=new Card();
		 p.pay();
	 }

void pay() {
	
System.out.println("making payment");
}
}
class Upi extends Polymorphism{
	void pay()
{
		System.out.println("making payment using upi");
		}
}
class Card extends Polymorphism{
	void pay()
{
		System.out.println("making payment using card");
		}}
class Cash extends Polymorphism{
	void pay()
{
		System.out.println("making payment using cash");
		}}

	