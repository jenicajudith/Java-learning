package file_handling;
import java.util.Scanner;
import java.io.IOException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.File;
public class Handling {
	Scanner sc=new Scanner(System.in);
	 File f=new File("C:\\Users\\jenic\\OneDrive\\Documents\\user.txt");
      public void create() throws IOException{
    	  System.out.println("enter the file name");
    	 
    	  if (f.createNewFile()) {
              System.out.println("File created successfully");
          } else {
              System.out.println("File already exists");
          }
      }
      public void write() throws IOException {
    	  System.out.println("enter the input");
    	  FileWriter w=new FileWriter(f);
    	  w.write(sc.next());
    	  w.close();
    	  
      }
      
      public void read() throws IOException{
    	  System.out.println("enter the file to read");
    	  FileReader r=new FileReader(f);
    	  String data=r.readAllAsString();
    	  System.out.println(data);
    	  r.close();
      }
      
      
    	  
      }

