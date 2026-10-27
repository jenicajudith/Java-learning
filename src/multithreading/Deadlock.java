package multithreading;

public class Deadlock {
public static void main(String[] args) {
	ClassA classA=new ClassA();
	ClassB classB=new ClassB();
	Thread t1=new Thread(()->{
		classA.termA(classB);
	});
	Thread t2=new Thread(()->{
		classB.termB(classA);
	}); 
}
}
