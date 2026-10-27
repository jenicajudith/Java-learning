package multithreading;

public class Mains {

	public static void main(String[] args) throws InterruptedException{
		 Order o = new Order();
	     Shop s = new Shop();
	    Location l = new Location();
	    o.start();
	    
	    s.start();
	    s.join();
        l.start();
	}

}
