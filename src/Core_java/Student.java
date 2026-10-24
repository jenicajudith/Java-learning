package Core_java;

public class Student {
   int id;
   String name;
   int marks;
   
   public Student(int id,String name,int marks) {
	   this.id=id;
	   this.name=name;
	   this.marks=marks;
   }
   
   public void display() {
	   System.out.println("student id :"+id);
	   System.out.println("student name : "+name);
	   System.out.println("student marks : "+marks);
   }
}
