package recursion;

public class Recursion {
	public void evenorodd(int num) {
		if(num%2==0) {
			System.out.println(num+" "+"even");
		}
		else {
			System.out.println(num+ " "+ "odd");
		}
			
		if(num==50) {
			return;
		}
		evenorodd(num+1);
		
		
	}
	
	public static void main(String[] args) {
		Recursion r=new Recursion();
		r.evenorodd(1);
	}

}
