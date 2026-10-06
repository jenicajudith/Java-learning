package math_string;

public class Main {
public static void main(String[] args) {
//	 string methods
	String team="heLlo world";
	String a="welcome";
	System.out.println(team.codePointAt(2));
	System.out.println(team.charAt(2));
	System.out.println(team.concat(" "+"Judith"+" "+a)); 
	System.out.println(a.replaceAll("e","heyyyyy"));
System.out.println(team.repeat(2));
	
	System.out.println(team.length());
	System.out.println(team.contains("o"));
	System.out.println(team.substring(0,4));
	System.out.println("start word or letter"+team.startsWith("h"));
	System.out.println("end word or letter"+team.endsWith("d"));
	System.out.println(team.trim());
	System.out.println(team.lastIndexOf("t"));
	System.out.println(team.indexOf("t"));
	System.out.println(team.toLowerCase());
	System.out.println(team.toUpperCase());
	
String[] teams=team.split(" ");
for(String data:teams)
	System.out.println(data);

System.out.println(team.equals("    He&lo world"));
String s1=" ";
System.out.println("b"+s1.isBlank());// letter
System.out.println("e"+s1.isEmpty()); // space and letter
String matchs = "judi@gmail.com";

System.out.println(matchs.equals("Student")); 
// false

System.out.println(matchs.matches("^[a-z0-9]+@gmail\\.com$"));
// true
	System.out.println();
	
//	 math methods
	System.out.println(Math.PI);
	System.out.println(Math.abs(-9));// neg to pos
	System.out.println(Math.floor(2.3));
	System.out.println(Math.round(44.8));
	System.out.println(Math.ceil(22.6));
	System.out.println(Math.random()*5);
	System.out.println(Math.min(23,56));
	System.out.println(Math.max(59,77));
	System.out.println(Math.powExact(2,3)); // without decimal
	System.out.println(Math.pow(7.7,8.7));
	System.out.println(Math.E);
	


}
}
