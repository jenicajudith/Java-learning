package multithreading;

public class Shop extends Thread {
public void run() {
	try {
		
	
	System.out.println("shop preparing the order");
	Thread.sleep(3000);
    System.out.println("Order is ready");
}catch(InterruptedException e) {
	System.out.println(e.getMessage());
}
}
}
