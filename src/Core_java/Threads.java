package Core_java;

public class Threads extends Thread{
	
	void thread1() {
		for(int i=0;i<=5;i++) {
			System.out.println(i);
		}
		System.out.println("this is thread 1");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			System.out.println(e.getMessage());
		}
		
	}
	
	void thread2() {
		for(int i=0;i<=5;i++) {
			System.out.println(i);
		}
		System.out.println("this is thread 2");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			System.out.println(e.getMessage());
		}
		
	}

}
