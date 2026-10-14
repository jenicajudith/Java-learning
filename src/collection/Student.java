package collection;

import java.util.Objects;

public class Student {
	
	int rollno;
	String name;
	int mark;
	
	public Student(int rollno, String name,int mark) {
		this.rollno=rollno;
		this.name=name;
		this.mark=mark;
	
	}
	@Override
	public int hashCode() {
		return Objects.hash(Integer.valueOf(mark), name, Integer.valueOf(rollno));
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return mark == other.mark && Objects.equals(name, other.name) && rollno == other.rollno;
	}
	


void display() {
    System.out.println(
        "Roll No: " + rollno +
        ", Name: " + name +
        ", Mark: " + mark
    );
}
void displayy() {
	System.out.println("highrst mark:"+mark+" Student name : "+name);
}
	
	
}

