package Multithreadings;

public class Bank extends Thread {
	int bal=5000;
	int withdraw=4000;
	
	
	
synchronized public void thread1(){
	if(bal>=withdraw) {
	bal=bal-withdraw;
	System.out.println("account balance : "+bal);
	}
	else {
		System.out.println("cannot withdraw ");
	}
}
synchronized public void thread2() {
	if(bal>=withdraw) {
		bal=bal-withdraw;
		System.out.println("account balance : "+bal);
		}
		else {
			System.out.println("cannot withdraw ");
		}
	
}

}
