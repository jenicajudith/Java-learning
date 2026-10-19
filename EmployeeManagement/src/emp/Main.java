package emp;
import java.util.Scanner;
public class Main {

public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
		// TODO Auto-generated method stub
//System.out.println(Dbconnection.dbconnection());
int choice=0;
Employee call=new Employee();

call.empinsert();

if(!call.login()) {
	System.out.println("login failed");

}
//
//do {
//	System.out.println("------------------------employee management------------------------");
//	System.out.println("1 - insert employee data");
//	System.out.println("2 - display all data");
//	System.out.println("3 - display data using id");
//	System.out.println("4 - update data");
//	System.out.println("5 - delete data");
//	System.out.println("choose your option");
//	choice=sc.nextInt();
//	switch(choice) {
//	case 1:
//		call.empinsert();
//		break;
//	case 2:
//		call.Displayall();
//		break;
//	case 3:
//		call.displayid();
//		break;
//	case 4:
//		call.updateemp();
//		break;
//	case 5:
//		call.delete();
//		break;
//	default:
//		System.out.println("invalid choice");
//	}
//	
//}
//while(choice !=0);

do {
	
	System.out.println("1-- diplay all the details");
	System.out.println("2-- display only one detail");
	System.out.println("3-- delete all");
	System.out.println("choose your option");
	choice=sc.nextInt();
	switch(choice) {
	case 1:
		call.Displayall();
		break;
	case 2:
		call.displayid();
		break;
	case 3:
		call.delete();
		break;
	}
	
	
}
while(choice!=0);
	}

}
