package String;

public class Outer_class {
	int roll;
	String name;
	String dept;
	class Inner{
		void display(int roll,String name,String dept) {
			System.out.println("rollno : "+roll);
		    System.out.println("name : "+name);
		    System.out.println("dept : "+dept);
		}
	}

}
