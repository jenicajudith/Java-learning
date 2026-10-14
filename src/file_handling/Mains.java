package file_handling;
import java.util.Scanner;
import java.io.IOException;
public class Mains {
	

	public static void main(String[] args) throws IOException{
		Handling h=new Handling();
		Scanner sc=new Scanner(System.in);
		 
		System.out.println("1. create file");
		System.out.println("2. write file");
		System.out.println("3. read file");
		System.out.println("enter choice");
		
		int choice =sc.nextInt();
		switch (choice) {
        case 1:
            h.create();
            break;
 
        case 2:
            h.write();
            break;

        case 3:
            h.read();
            break;

        default:
            System.out.println("Invalid choice");
    }
	

	}
}
