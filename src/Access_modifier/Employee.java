package Access_modifier;

abstract class Employee {
abstract void work();
}


 class Manager extends Employee implements Bonus{
	 
	 @Override
	 void work() {
		 System.out.println("developer");
	 }
	 public void bonus() {
		 System.out.println("bonus="+ bonus);
	 }
	
}
