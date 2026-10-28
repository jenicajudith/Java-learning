package Multithreadings;
import java.io.IOException;
public class Threads extends Thread{
	public void run()  {
	try {
		System.out.println("the order is being procesesed");
		Thread.sleep(2000);
	}catch(InterruptedException e){
		System.out.println(e.getMessage());
	}
	
	System.out.println("the order is confirmed");
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
	}
}
