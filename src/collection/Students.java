package collection;

import java.util.Objects;

public class Students {
  
	   int rollno;
	   String name;
	   String dept;
   
   

   public Students(int rollno, String name, String dept) {
	
	this.rollno = rollno;
	this.name = name;
	this.dept = dept;
   }
  
   @Override
   public int hashCode() {
	return Objects.hash(dept);
   }
   @Override
   public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Students other = (Students) obj;
	return Objects.equals(dept, other.dept);
   }
   
   void display() {
	    System.out.println(
	        "Roll No: " + rollno +
	        ", Name: " + name +
	        ", Department: " + dept
	    );
	}
}
