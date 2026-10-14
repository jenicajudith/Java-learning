package file_handling;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
public class Main {

	public static void main(String[] args) throws IOException{
         File create=new File("C:\\Users\\jenic\\OneDrive\\Documents\\hello.txt");
         if(create.createNewFile()){
        	 System.out .println("file is created");
         }
         else {
        	 System.out.println("file is already created");
         }
         FileWriter writes=new FileWriter("hello.txt");
         writes.write("hello everyone");
         
         writes.close();
         FileReader read=new FileReader("hello.txt");
         String data=read.readAllAsString();
         System.out.println(data);
         read.close();
         
	}

}
