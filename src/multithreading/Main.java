package multithreading;

public class Main {
public static void main(String[] args) throws InterruptedException {
	Mythread my=new Mythread();
	my.start();
	my.loop(5);
    Anotherthread thread=new Anotherthread();
    
    System.out.println("current1:"+my.isAlive());
    if(my.isAlive()) {
    System.out.println("thread is running");
    }
    Thread threadd= new Thread(thread);
    threadd. start();
    my.join();
    System.out.println("current2:"+my. isAlive());
    if(my.isAlive()) {
    System.out.println("thread is running");

   my.loop(10); 

    System.out.println("thank you ... ");
	
}
}
}