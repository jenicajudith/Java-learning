package syn_thread;
//payment , ticket booked num display, their payment-5, theater name -3-location, first function must stop after one num and then the second function and complete and 1 st threa release after 3 sec 3 rd tgread release
public class Booking {
	
synchronized void name(){
	
	for(int i=1;i<=10;i++) {
		System.out.println("customer : "+i);
		if(i==1) {
			try {
				wait();
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
			}
	
}
}
synchronized void payment() {
	int amt=500;
	for(int i=1;i<=5;i++) {
		System.out.println("payment :"+amt);
		amt=+500;
	}
}
synchronized void location() {
	for(int i=1;i<=3;i++) {
		if(i==1) {
			System.out.println("location:chennai");

		}
		else if(i==2) {
			System.out.println("location:mumbai");

		}
		else if(i==3) {
			System.out.println("location:banglore");
			
		}
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
synchronized void pause() {
	notify();
}

public static void main(String[] args) {
	Booking book=new Booking();
	Thread t1=new Thread(()->{
		book.name();
	});
	Thread t2=new Thread(()->{
		book.payment();
	});
	Thread t3=new Thread(()->{
		book.location();
	});
	Thread unlock=new Thread(()->{
		book.pause();
	});
	
	t1.start();
	t2.start();
	t3.start();
	unlock.start();
}
}


