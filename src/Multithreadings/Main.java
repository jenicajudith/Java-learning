package Multithreadings;

public class Main {

	public static void main(String[] args) throws InterruptedException {
		Threads th=new Threads();
		th.start();
		Bank b=new Bank();
		Thread t1=new Thread(()->{
			b.thread1();
		});
		Thread t2=new Thread(()->{
			b.thread2();
		});
		t1.start();
		t2.start();
	;
		Order o=new Order();
		Thread th3=new Thread(()->{
			try {
				o.customer();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		});
		Thread th4=new Thread(()->{
			o.chef();
		});
		th3.start();
		th4.start();
		
		o.join();
		Students s=new Students();
		Thread t3=new Thread(()->{
			s.stu1();
		});
		Thread t4=new Thread(()->{
			s.stu2();
		});
		Thread t5=new Thread(()->{
			s.stu3();
		});
		Thread t6=new Thread(()->{
			s.teacher();
		});
		t3.start();
		t4.start();
		t5.start();
		t6.start();
		s.join();
		
		 Company p = new Company();

	        

	      Thread producer = new Thread(() -> p.produce());

	        Thread c1 = new Thread(() -> p.consume("Consumer 1"));
	        Thread c2 = new Thread(() -> p.consume("Consumer 2"));
	        Thread c3 = new Thread(() -> p.consume("Consumer 3"));

	        c1.start();
	        c2.start();
	        c3.start();

	        producer.start();
	    }
		
		
		
		

	

}
