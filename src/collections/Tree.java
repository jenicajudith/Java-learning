package collections;

import java.util.TreeSet;

public class Tree {
	
	
	public void Trees() {
		TreeSet<Integer> tree= new TreeSet<Integer>();
		
		tree.add(10);
		tree.add(30);
		tree.add(20);
	
		tree.remove(30);
		tree.add(40);
	
		System.out.println(tree.first());
		System.out.println(tree.getFirst());
		System.out.println(tree.getLast());
		
		System.out.println(tree.size());
		System.out.println(tree);
		tree.clear();
		System.out.println(tree);
	}

	
	public static void main(String[] args)  {
		Tree tree= new Tree();
		tree.Trees();
	}
}
