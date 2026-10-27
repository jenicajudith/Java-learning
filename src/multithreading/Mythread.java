package multithreading;

public class Mythread extends Thread {
	void loop(int value) {
		for(int i=0;i<=value;i++) {
			try {
				
			
			System.out.println("my thread"+i);
			Thread.sleep(1000);
			}catch(InterruptedException e) {
				System.out.println(e.getMessage());
			}
		}
		
	}
	public void run() {
		for(int i=1;i<=10;i++) {
			try {
			System.out.println("normal thread"+i);
			Thread.sleep(1000);
		}catch(InterruptedException e) {
			System.out.println(e.getMessage());
		}
		}
	}

}
