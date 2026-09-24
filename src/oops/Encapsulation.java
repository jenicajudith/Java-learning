package oops;

public class Encapsulation {
private long accno;
private int pin;
private double balance;

public Encapsulation(long accno,int pin, double balance) {
	this.accno=accno;
	this.pin=pin;
	this.balance=balance;
}

public void setAccno(long accno) {
	this.accno=accno;
}
public long setAccno() {
	return accno;
}
public void setPin(int pin) {
	this.pin=pin;
}
public int setpin() {
	return pin;
}
public void setBalance(double balance) {
	this.balance=balance;
}
public double setBalance() {
	return balance;
}
}
