
package Multithreadings;

public class Company extends Thread {

	 boolean available = false;
	    int product = 0;

	    synchronized public void produce() {
	        product++;
	        available = true;

	        System.out.println("Producer produced product " + product);

	        notifyAll();
	    }

	    synchronized public void consume(String name) {
	        try {
	            while (!available) {
	                System.out.println(name + " is waiting");
	                wait();
	            }

	            System.out.println(name + " consumed product " + product);

	            available = false;
	            notify();

	        } catch (InterruptedException e) {
	            e.printStackTrace();
	        }
	    }}