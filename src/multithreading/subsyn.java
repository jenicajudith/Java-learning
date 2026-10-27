package multithreading;

public class subsyn  extends anothersyn{
	synchronized void team1() {
		try {
		System.out.println("first thread");
		Thread.sleep(1000);
		}catch (InterruptedException e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
	}
	synchronized void team2() throws InterruptedException  {
		for(int i=1;i<10;i++) {
		System.out.println("two thread");
		Thread.sleep(1000);
		}
	}
	synchronized void team3() throws InterruptedException {
		System.out.println("three thread");
		Thread.sleep(1000);
		wait();// lock the thread
	}
	
	void normal() {
		System.out.println("team normal");
	}
	public static void main(String[] args) throws InterruptedException {
		subsyn subsyn= new subsyn();
		Thread s1= new Thread(()->{
			
				subsyn.team1();
			
		});
		Thread s2= new Thread(()->{
			try {
				subsyn.team2();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		});
		Thread s3= new Thread(()->{
			try {
				subsyn.team3();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		});
//		anothersyn anothersyn= new anothersyn();
		Thread s4= new Thread(()->{
			try {
//				anothersyn.team();
				subsyn.team();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		});
		s1.start();
		s2.start();
		s3.start();
		s4.start();
		s3.join();
		subsyn.normal();
	}

}