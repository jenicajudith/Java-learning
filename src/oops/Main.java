package oops;

public class Main {
	public static void main(String[] args) {
		Calculator cal=new Calculator();
		int result=cal.add(3, 4);
		System.out.println("add"+cal.add(10,20));
		System.out.println(cal.sub(25,result));
		System.out.println(cal.multi(33,44));
		System.out.println(cal.addtwostring("hello","judi"));
		
		System.out.println("inheritance");
		Child child=new Child();
		child.findindex("hello world");
		child.len("helloo");
		
//		Polymorphism poly=new Polymorphism();
		
//		System.out.println(poly.arthmetic(10,37));
	}

}



