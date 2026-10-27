package multithreading;

public class Anotherthread  extends Thread implements Runnable{

@Override
public void run() {
// TODO Auto-generated method stub
try {
Thread.sleep(5000);
System.out.println("order conformed");
} catch (InterruptedException e) {
// TODO Auto-generated catch block
e.printStackTrace();
}
try {
Thread.sleep(5000);
System.out.println("order deliverd");
} catch (InterruptedException e) {
// TODO Auto-generated catch block
e.printStackTrace();

}
}
}