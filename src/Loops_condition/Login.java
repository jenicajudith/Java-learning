package Loops_condition;
import java.util.Scanner;
public class Login {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner sc=new Scanner(System.in);
     String admin="admin";
     int password=12345;
     System.out.println("enter your username");
     String un=sc.next();
     System.out.println("enter your password");
     int pass=sc.nextInt();
     if(un.equals(admin) && pass==password) {
    	 System.out.println("Login successful");
     }
     else {
    	 System.out.println("invalid login");
     }
     }

}
