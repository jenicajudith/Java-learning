package Core_java;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Student s=new Student(30,"judith",90);
     s.display();
     Employee e=new Employee();
     e=new Trainer();
    
     e.work();
     e=new Developer();
     e.work();
     Studenttable ss=new Studenttable();
     ss.stutablecreation();
     ss.insert();
     
	}

}
