package Datatypes;
import java.util.Scanner;
public class Operator {
	Scanner sc=new Scanner(System.in);
	void arithmetic() {
		int a=10;
		int b=20;
		System.out.println(a+b);
		
		
		System.out.println("enter first num");
		int one=sc.nextInt();
		System.out.println("enter second num");
		int sec=sc.nextInt();
		System.out.println("sub ="+(one-sec));
	}
	void addtwoString() {
		System.out.println("enter string 1");
		String s1=sc.next();
		System.out.println("enter string 2");
		String s2=sc.next();
		System.out.println(s1+s2);
	}
	void multimodules() {
		int a=20,b=30,c=40;
		System.out.println("multiply : "+ a*b);
		System.out.println("div : "+ a/b);
		System.out.println("modulus : "+ a%b); 
		
	}
// Assignment operator =>, +=, -+, *=,/+,%=
	public void total() {
		int amount=100;
		amount=50;
		amount+=20;
		System.out.println(amount);
	}
	
//	Comparison or relational operator  => ==, !=,  .equals=> checks only the content
	
	public void compare() {
		int a=30;
		int b=20;
		System.out.println(a==b);
	}
	
//	logical operator
	void Logical() {
		int a=10;
		int b=20;
		System.out.println(a==b && a!=b); //and gate
		System.out.println(a<=b || a==b); // or gate
	}
	
//	bitwise operator
	void bitwise() {
		int a=5;
		int b=7;
		String p="7";
		System.out.println(p.codePointAt(0));
		System.out.println(a&b); //and 
		System.out.println(a|b); //or
		System.out.println(a^b); // xor
	}
	
//	increment and decrement
	void incre() {
		int a=100;
		a++;
		System.out.println(a); //post increment
		System.out.println(++a); 
		
		
	}
	
	
}
