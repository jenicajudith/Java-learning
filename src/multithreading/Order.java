package multithreading;

public class Order extends Thread  {
   public void run() {
	   try {
	   System.out.println("taking order");
	   Thread.sleep(2000);
	   System.out.println("Order confirmed");
   }catch(InterruptedException e) {
	   System.out.println(e.getMessage());
   }
   }
}
