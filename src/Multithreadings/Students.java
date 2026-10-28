package Multithreadings;

public class Students extends Thread{
	
	synchronized public void stu1() {
		System.out.println("this is the first student");
		try {
			
			wait();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("mark is 80");
	}
	synchronized public void stu2() {
		System.out.println("this is the second student");
		try {
		
			wait();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("mark is 90");
	}
	synchronized public void stu3() {
		System.out.println("this is the third student");
		try {
			
			wait();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("mark is 90");
	}
	synchronized public void teacher() {
		  System.out.println("theresults has been published");
		  
		  notifyAll();
	}

}
