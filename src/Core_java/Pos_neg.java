package Core_java;
import java.util.Scanner;
public class Pos_neg {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter num");
	int num=sc.nextInt();
	if(num>0) {
		System.out.println("it is positive");
	}
	else if(num==0) {
		System.out.println("it is zero");
	}
	else {
		System.out.println("it is negative");
	}

}
}
