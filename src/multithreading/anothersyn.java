package multithreading;

public class anothersyn {
	synchronized void team() throws InterruptedException {
		for(int i=0;i<5;i++) {
		System.out.println("another syn class");
		Thread.sleep(1000);
		}
	}
}
