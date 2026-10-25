package Core_java;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//     Student s=new Student(30,"judith",90);
//     s.display();
//     Employee e=new Employee();
//     e=new Trainer();
//    
//     e.work();
//     e=new Developer();
//     e.work();
//     Studenttable ss=new Studenttable();
//     ss.stutablecreation();
//     ss.insert();
     
     Threads  th=new Threads();
     
     th.start();
     th.thread1();
     th.thread2();
     
     
     
     Calculator  c=(a,b)->{
    	 int num=a+b;
    	 System.out.println("the added value is : "+num);
    	 
     };
     c.val(34,56);
     
     
	}

}
