package Access_modifier;

public class Student {

    public String name="judi";
    int rollno=2;
    protected String college="btech";
    private int password=2345677;
    
    void reg() {
    	System.out.println(password);
    }
    
}
class Stu extends Student{
	
		void display() {
		System.out.println("Name="+name);
		
		System.out.println("roll no="+ rollno);
		System.out.println("college"+college);
		
		}
}