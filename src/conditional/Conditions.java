package conditional;
import java.util.Scanner;
public class Conditions {
	    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
//		System.out.println("enter age");
//		int a=sc.nextInt();
//		if(a>=18) {
//		System.out.println("Eligible to vote"); 
//		}
//		else {
//		System.out.println("not eligible to vote");
//		}
//		System.out.println("enter number");
//		int num=sc.nextInt();
//		int r= num%2==0?1:0;
//		System.out.println(r +""+ "o is odd 1 is even" );
		
		int mark=sc.nextInt();
		 if (mark >= 90 && mark <= 100) {
	            System.out.println("A Grade");
	        } 
	        else if (mark >= 75) {
	            System.out.println("B Grade");
	        } 
	        else if (mark >= 50) {
	            System.out.println("C Grade");
	        } 
	        else if (mark >= 40) {
	            System.out.println("D Grade");
	        } 
	        else {
	            System.out.println("Fail");
	        }
		
	}

}
// compile time the memory gets allocated
//run time only takes the input will not store the memory
// primitive => ==
// non primitive => .equals
