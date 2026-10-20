package array;
import java.util.Scanner;
public class Jagged {
  public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	 // jagged array=> whwn every row has diff column sizes
	 int[][] val=new int[3][]; //row
	 val[0]=new int[2]; // first row 2 column
	 val[1]=new int[3];
	 val[2]=new int[3];
	 
	 for(int[] value:val) {
		 for(int jag:value) {
			 System.out.println(jag);
		 }
		 System.out.println();
		 }
	 
	 
	 
	 
	 String[][] cont=new String[3][];
	 cont[0]=new String[2];
	 cont[1]=new String[3];
	 cont[2]=new String[2];
	 
	 for(int i=0;i<cont.length;i++) {
		 for(int j=0;j<cont[i].length;j++) {
			 System.out.println("row:"+i+",col:"+j);
			 cont[i][j]=sc.next();
		 }
	 }
	 for(String[] con:cont) {
		for(String content:con) {
			System.out.println(content);
		}
		System.out.println();
	 }
	 
}
} 