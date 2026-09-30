package Loops_condition;
import java.util.Scanner;
public class Loop {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<5;i++) {
			System.out.println("Enter the mark");
			int mrk=sc.nextInt();
			if(mrk>50) {
				System.out.println(mrk+"-pass");
			}
			else {
				System.out.println(mrk+"-fail");
			}
			}
		}
	}


