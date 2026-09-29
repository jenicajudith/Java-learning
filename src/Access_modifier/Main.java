package Access_modifier;
// PUBLIC=>public is global it can be used in method , variable, class , can be called in same package and diff package
// PRIVATE=> private class can not be created only method and variable can be used =. private cannot be cannot connect to diff class, can be used only in same class
// PROTECTED=>for protected a seperate subclass must be created only then the class can be accessed it cannot be accessed directly must override method and use it must use extends keyword
// DEFAULT=>default can be used in class,method,variable cannot use in diff package and class

public class Main {
  public static void main(String[] args){
	  Upi p=new Upi();
	  Credit c=new Credit();
	  p.payment();
	  c.payment();
      Car c1=new Car();
      Bike b=new Bike();
      c1.Start();
      b.Start();
      Manager m=new Manager();
      m.work();
      m.bonus();
      Stu s=new Stu();
      
      
      s.display();
      s.reg();
		
	}
	
}
 