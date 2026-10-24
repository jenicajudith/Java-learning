package Core_java;

public class Employee{
	
	
	public void work(){
		System.out.println("they are working");
		
	}
}
	class Trainer  extends Employee{
		@Override
		public
		void work() {
			System.out.println("this is the trainee");
		}
		
	}
	class Developer  extends Employee{
		@Override
		 public void work() {
			System.out.println("this is the developer");
		}
		
	}
	
	
  

