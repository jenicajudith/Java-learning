package collection;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
public class List {
	Scanner sc=new Scanner(System.in);
	public void ArrayL() {
		
        ArrayList<Student> array=new ArrayList<Student>();
        array.add(new Student(20, "Judi", 88));
        array.add(new Student(21, "Anu", 95));
        array.add(new Student(22, "Riya", 76));
        array.add(new Student(23, "Sam", 89));
        array.add(new Student(24, "Mia", 92));
        array.add(new Student(22, "Riya", 76));
        
        System.out.println("Student display : ");
        
        for(Student s:array) {
        	s.display();
        }
        Student max=array.get(0);
        for(Student s:array) {
        	if(s.mark>max.mark) {
        		max=s;
        	}
        }
        	max.displayy();
        	HashSet<Student> list=new HashSet<>(array);	
    		for(Student l:list) {
    			l.display();
    		}
        
        
	}
	public void Roll(){
        ArrayList<Student> array=new ArrayList<>();
        array.add(new Student(20,"karen",90));
        array.add(new Student(30,"helen",45));
        System.out.println("enter the rollno: ");
        int rollNo=sc.nextInt();
        for(Student s:array) {
        	
        if(rollNo==s.rollno) {
        	s.display();
        }
        }
        
        
        	
	}
	

public static void main(String[] args) {
	List l=new List();
	l.ArrayL();
	l.Roll();
//	l.list();

}
}