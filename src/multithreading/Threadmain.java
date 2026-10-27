package multithreading;

public class Threadmain {
	public static void main(String[] args) {
		Thread my= new Thread(()->{
		System.out.println("first");
		});
		my.setPriority(Thread.MIN_PRIORITY); //can also give numbers(1-10) according to what thread to run first
		
		Runnable myinterface= new Runnable() {

		@Override
		public void run() {
		// TODO Auto-generated method stub
		System.out.println("second");

		}

		};

		Thread my1= new Thread(myinterface);
		Thread th=new Thread(()->{
			System.out.println("hiii");
		});
		my1.setPriority(Thread.MAX_PRIORITY);//highest priority-first run
		
		my.start();
		my1.start();
}
}
