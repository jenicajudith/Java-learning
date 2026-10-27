package multithreading;

public class ClassA {
synchronized void termA(ClassB ClassB) {
	System.out.println("thread one");
	ClassB.b();
	}
synchronized void a() {
	System.out.println("deadlock 1");
}
}
