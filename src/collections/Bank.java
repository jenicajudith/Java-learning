package collections;

public class Bank {
  String name;
  double bal;
  
  public Bank() {
	  
  }
  public String getName() {
	return name;
  }
  public void setName(String name) {
	this.name = name;
  }
  public double getBal() {
	return bal;
  }
  public void setBal(double bal) {
	this.bal = bal;
  }
  public Bank(String name, double bal) {
	
	this.name = name;
	this.bal = bal;
  }
  
}
