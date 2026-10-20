package Handling;
import java.io.IOException;

import java.io.File;
import java.io.FileWriter;

public class FIles{
	public static void main(String[] args)  throws IOException {

    File create=new File("C:\\Users\\jenic\\OneDrive\\Documents\\student.txt");
    if(create.createNewFile()) {
    	System.out.println("file created");
    }
    else {
    	System.out.println("file is already  created");
    }
    
    FileWriter writes=new FileWriter(create);
    writes.write("hello this is my file content");
    writes.write("how are you?");
    writes.close();
}
}