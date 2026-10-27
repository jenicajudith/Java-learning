package practice;
import java.util.Scanner;
public class Bank {
  Scanner sc=new Scanner(System.in);
	private String accholder;
	private double bal;
	double amt;
	
	
	public Bank(String accholder,double bal){
		this.accholder=accholder;
		this.bal=bal;
	}
	public void deposit(double amt) {
//		System.out.println("enter amt to deposit");
//		amt=sc.nextDouble();
		if(amt==Math.abs(amt)) {
			bal=bal+amt;
		}
	}
	public void withdraw(double amt) {
//		System.out.println("enter amt to deposit");
//		amt=sc.nextDouble();
		if(amt==Math.abs(amt)&& bal>=500) {
			bal=bal-amt;
		}
	}
	
	public void getbal() {
		System.out.println(bal);
	}
	
	
}


