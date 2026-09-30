package Loops_condition;
import java.util.Scanner;
public class Employee {
	static int count=1;
	Scanner sc=new Scanner(System.in);
 void dis() {
  final int tax=10;
  
   
  for(int i=1;i<=5;i++) {
	  System.out.println("enter salary");
	  int sal=sc.nextInt();
	  if(sal>50000) {
		  System.out.println("high salary");
	  }
	  else {
		  System.out.println("normal salary");
	  }
	  int result=sal+sal*tax/100;
	  System.out.println("employee "+count+"  "+result);
	  count++;
	  
  }
}
}

