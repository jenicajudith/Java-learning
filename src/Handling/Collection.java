package Handling;
import java.util.HashSet;
import java.util.HashMap;
import java.util.TreeSet;
public class Collection {
  
	public static void main(String[] args) {
		HashSet<Integer> set=new HashSet<>();
		set.add(10);
		set.add(20);
		set.add(10);
		set.add(30);
		set.add(20);
		 for(int hash:set) {
			 System.out.println(hash);
		 }
		 
		 HashMap<Integer,String> map=new HashMap<>();
		 map.put(1,"judi");
		 System.out.println(map);
		 
		 TreeSet<Integer> tree=new TreeSet<>();
		 tree.add(10);
			tree.add(20);
			tree.add(10);
			tree.add(30);
			tree.add(20);
			for (int treee:tree) {
				System.out.println(treee);
			}
		
		
		
	}
}