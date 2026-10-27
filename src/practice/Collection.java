package practice;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.HashSet;
public class Collection {
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
  ArrayList<String> arr=new ArrayList<String>();
  for(int i=1;i<=5;i++) {
	  System.out.println("enetr name "+i);
	  arr.add(sc.next());
}
  System.out.println(arr);

	
	HashSet<String> set=new HashSet<>();
	set.contains(arr);  
	System.out.println(set);
	
}
}