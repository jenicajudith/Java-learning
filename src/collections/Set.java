package collections;

import java.util.HashSet;

public class Set {
// set =>hash set  
	
	public void hashset() {
		HashSet<Integer> hashSet= new HashSet<Integer>();
		
		hashSet.add(10);
		hashSet.add(20);
		hashSet.add(10);
		hashSet.remove(10);
		hashSet.add(56);
//		hashSet.clear();
		
	System.out.println(hashSet.size());
		System.out.println(hashSet.isEmpty());
		System.out.println(hashSet);
		
		for(Integer i:hashSet) {
			if(i==20) {
			System.out.println(i);
			}
		}
		
	}
	
	public static void main(String[] args) {
		Set set= new Set();
		set.hashset();
	}
}