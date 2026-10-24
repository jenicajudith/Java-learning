package Core_java;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.HashSet;
public class Collection {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		  ArrayList<Integer> arr=new ArrayList<Integer>();
		  for(int i=1;i<=5;i++) {
			  System.out.println("enetr value "+i);
			  arr.add(sc.nextInt());
		}
		  System.out.println(arr);
		  
		  HashSet<Integer> set=new HashSet<Integer>(arr);
		  System.out.println(set);
	}

}
