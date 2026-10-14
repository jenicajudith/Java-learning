package collections;

import java.util.HashMap;
import java.util.TreeMap;

public class Map {

	public void Hashmap() {
		HashMap<Integer, String>  product= new HashMap<Integer, String>();
		
		product.put(1, "pen");
		product.put(2,"pencile");
		product.put(3, "scale");
		
		product.remove(1);
		product.replace(3, "easer");// edit
		
		product.put(4, "pen1");
		product.replace(4, "pen1", "pen");
		product.remove(2, "pencile");
	System.out.println(product.size());
//	product.clear();
		System.out.println(product.containsKey(2));
		System.out.println(product.containsValue("scale"));
		System.out.println(product);
		System.out.println(product.get(2));
		System.out.println(product.values()); // get value
		System.out.println(product.keySet());// get key
		
		for(  String value:product.values()) {
			
			System.out.println("value:"+value);
		}
		for(Integer key:product.keySet()) {
			System.out.println("key:"+key);
		}

		System.out.println("check"+product.entrySet());
		
	}
	
public void hashtree() {
	TreeMap<String,Integer> student= new TreeMap<String, Integer>();
	student.put("kumar",2000);
	student.put("arun", 3000);
	student.put("harish",500);
	student.put("kumar", 4000);
	
	System.out.println(student.firstKey());
	System.out.println(student.keySet());
	System.out.println(student.values());
	System.out.println(student);
}
	
	public void main(String[] args) {
		Map map= new Map();
		map.Hashmap();
		map.hashtree();
	}
}
