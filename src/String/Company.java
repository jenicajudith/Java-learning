package String;
import java.util.Scanner;
public class Company {
	public static void main(String[] args) {
	

	Scanner sc=new Scanner(System.in);
    String emp_name="";
    StringBuilder sb=new StringBuilder(emp_name);
    for(int i=1;i<=3;i++) {
    System.out.println("enter the employee name "+ i);
    sb.append(sc.next());
    }
    System.out.println("the employees are:"+sb);
	}
}