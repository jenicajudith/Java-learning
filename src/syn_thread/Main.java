package syn_thread;

import java.util.Scanner;

public class Main {

	synchronized void order() {
		
		for(int i=1; i<=15;i++) {
		
			
				System.out.println("order booking:"+i);
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				if(i==1) {
				try {
					
					wait();
					
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				}
				
			
		}
		
	}
	synchronized void location() {
		try {
			wait();
			Scanner sc= new Scanner(System.in);
			System.out.println("enter your location");
			String location=sc.nextLine();
			System.out.println("loaction:"+location);
			
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	synchronized void amount() {
		int amount =500;
		for(int i=1;i<=10;i++) {
			
		
			try {
				System.out.println("amount:"+amount);
				amount+=500;
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}
	synchronized void restartorder() {
		notify();
	
		System.out.println(".......");
	}
	
	synchronized void allrestart() {
		notifyAll();
	}
	public static void main(String[] args) throws InterruptedException {
		Main call= new Main();
		Thread t1= new Thread(()->{
			call.order();
		});
		
		Thread t2= new Thread(()->{
			call.amount();
		});
		Thread t3= new Thread(()->{
			call.location();
		});
		Thread unlock= new Thread(()->{
			call.restartorder();
		});
		Thread allunlock=new Thread(()->{
			call.allrestart();
		});
		
		t1.start();
		t2.start();
		t3.start();
		unlock.start();
		Thread.sleep(2000);
		allunlock.start();
	}
	
}