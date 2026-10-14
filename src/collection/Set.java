package collection;
import java.util.HashSet;
public class Set{

	
		public void set(){
		HashSet<Student> stu=new HashSet<>();
		stu.add(new Student(1,"claire",89));
		stu.add(new Student(2,"laura",89));
		stu.add(new Student(3,"ken",89));
		stu.add(new Student(1,"claire",89));
		
		

		for(Student s:stu){
			
			System.out.println("");
			s.display();		
			}
		}
		
		public void hashset() {
			HashSet<Students> hash=new HashSet<>();
			hash.add(new Students(1,"claire","IT"));
			hash.add(new Students(2,"laura","CSE"));
			hash.add(new Students(3,"ken","EEE"));
			hash.add(new Students(4,"clayi","IT"));
			for(Students s:hash) {
				s.display();
			}
			
		}
	 
		
		public static void main(String[] args) {
			Set s=new Set();
			s.set();
			s.hashset();
		}

}
