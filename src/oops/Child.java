package oops;
import java.util.Scanner;
public class Child extends Parent{
	Scanner sc=new Scanner(System.in);
     void findindex(String index) {
    	 System.out.println("whts the index:");
    	 int indexno=sc.nextInt();
    	 System.out.println("String index:"+ index.charAt(indexno));
     }
}
