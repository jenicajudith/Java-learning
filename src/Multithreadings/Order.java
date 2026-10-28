package Multithreadings;

import java.io.IOException;

public class Order extends Thread {
	synchronized public void customer() throws InterruptedException{
		
		try {
			System.out.println("waiting for the food"); 
			Thread.sleep(2000);
		}catch(InterruptedException e) {
			System.out.println(e.getMessage());
		}
		wait();
		
		System.out.println("order recieved");
	}
	
	synchronized public void chef(){
		try {
			System.out.println("Preparing the order");
			Thread.sleep(2000);
			
		}catch(InterruptedException e) {
			System.out.println(e.getMessage());
		}
		System.out.println("order has been prepared");
		notify();
		
	}

}
