package oops;
import java.util.Scanner;
public class Polymorphism {
  void arthmetic() {
	  Scanner sc=new Scanner(System.in);
	  System.out.println("value 1");
	  int a=sc.nextInt();
	  System.out.println("value 2");
	  int b=sc.nextInt();
	  
	  System.out.println(a+b);
  }
  void arthmetic(int a, int b) {
	  System.out.println(a-b);
}
  void arthmetic(int a, int b,int c) {
	  System.out.println(a*b);
}
  void arthmetic(float a, float b) {
	  System.out.println(a/b);
}
}
