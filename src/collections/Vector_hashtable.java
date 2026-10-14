package collections;
import java.util.Vector;
import java.util.Hashtable;
public class Vector_hashtable {
 public void vector() {
	 Vector<Integer> term=new Vector<Integer>();
	 term.add(10);
	 term.add(20);
	 term.set(1, 70);
	 term.add(90);
	 System.out.println(term);
	 
 }
 
//  legacy function of hashmap; key value
 public void hasshtable() {
	 Hashtable<Integer,String> map=new Hashtable<Integer, String>(); 
	 map.put(1,"hello");
	 map.put(2,"welcome");
	 map.remove(2);
	 map.replace(1,"helllooo welcome");
	 System.out.println(map); 
 }

public static void main(String[] args) {
	Vector_hashtable vec=new Vector_hashtable();
	vec.vector();
	vec.hasshtable();
}
}