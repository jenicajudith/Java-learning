package multithreading;

public class ClassB {
public void termB(ClassA ClassA) {
	System.out.println("thread one");
	ClassA.a();
	
}
synchronized void b() {
	System.out.println("deadlock 2");
}
}
