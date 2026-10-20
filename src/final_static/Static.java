package final_static;
//  can call directly without creating objects
public class Static {
 static String name="judi"; // only when given globally we can reassign
 public static void display() {
	 name="sam";
	 System.out.println(name);
 }  
}
