package oops;

public interface Interface {
	public void add();
    
	default void display() {
		System.out.println("displayed");
	}
	
	private void dis() {
		System.out.println("Yes");
	}
}
