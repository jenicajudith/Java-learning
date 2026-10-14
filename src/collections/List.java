package collections;
import java.util.ArrayList;
import java.util.LinkedList;
//List=>  array list ,linked list, vector
public class List {
	public void ArrayList() {
		ArrayList<Integer> arrl=new ArrayList<Integer>();
		arrl.add(10);
		arrl.add(20);
		arrl.add(30);
		arrl.add(40);
		 arrl.set(0, 70);
		 arrl.remove(1);
		
		System.out.println(arrl);
		System.out.println(arrl.get(2));
		System.out.println("size:"+arrl.size());
		
	}
	public void Strings() {
		ArrayList<String> str=new ArrayList<String>();
		str.add("html");
		str.add("css");
		str.add("js");
		str.add("react");
		System.out.println(str);
		System.out.println(str.get(1));
		System.out.println(str.contains("js"));
		System.out.println(str.isEmpty());
		System.out.println(str.getLast());
		System.out.println(str.lastIndexOf("css"));
		System.out.println(str.indexOf("html"));
		
		
		
		
		
	}
	public void studentarraylist() {
		Studentinfo info=new Studentinfo();
		ArrayList<Studentinfo> stu=new ArrayList<Studentinfo>();// to connect class
		stu.add(new Studentinfo("judi",21,"abc"));
		stu.add(new Studentinfo("sam",24,"xyz"));
		System.out.println("name="+stu.get(0).getName()+" age="+stu.get(0).getAge()+" clg="+stu.get(0).getClg());
		
		for(Studentinfo s:stu) {
			if(s.getName()=="judi") {
				s.setName("eph");
			}
			System.out.println(s.getName()+" "+s.getAge()+"  "+s.getClg());
		}
	}
 
	public void banks() {
		Bank ba=new Bank();
		ArrayList<Bank> detail=new ArrayList<Bank>();
		detail.add(new Bank("clarie",40000));
		detail.add(new Bank("karen",500000));
		System.out.println("name:"+detail.get(0).getName()+"  balance:"+detail.get(0).getBal());
		
		
	}
	public void LinkedList() {
		LinkedList<Integer> link=new LinkedList<Integer>();
		link.add(10);
		link.add(30);
		link.add(56);
		System.out.println(link);
		
	}
public static void main(String[] args) {
	List arr=new List();
	arr.ArrayList();;
	arr.Strings();
	arr.studentarraylist();
	arr.banks();
    arr.LinkedList();

	

}}
