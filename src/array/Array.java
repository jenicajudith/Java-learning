package array;
import java.util.Scanner;
public class Array {
 public static void main(String[] args) {
//	 int[] arr=new int[10];
	 Scanner sc=new Scanner (System.in);
//	 for(int i=0;i<arr.length;i++) {
//		 arr[i]=sc.nextInt();
//		 System.out.println(i);
//	 }
//	 for(int dis:arr) {
//		 System.out.println("array"+dis);
//	 }
	 
//	 String[] s=new String[5];
//	 int count=1;
//	 for(int i=0;i<s.length;i++) {
//		 System.out.println("enter product"+" "+count);
//		 s[i]=sc.next();
//		 count++;
//		 
//	 }
//	 for(String display:s) {
//		 System.out.println("product"+" "+display);
//	 }
////	  2D array
//	 int[][]arr=new int[3][3];
//	 for(int i=0;i<arr.length;i++) {
//		 for(int j=0;j<arr.length;j++) {
//			 System.out.println("index"+"row"+i +", column:" + j);
//			 arr[i][j]=sc.nextInt();
//		 }
//	 }
//	 
//	 for(int i=0;i<arr.length;i++) {
//		 for(int j=0;j<arr.length;j++) {
//			 System.out.println("index:"+"row"+i+", col:"+j+"="+arr[i][j]);
//		 }
//	 }
//	  3D array or multidimensional array
	 int[][][] array=new int[2][2][2]; // block=side, row, column
//	 array[0]=new int[2][];
//	array[1]=new int[3][];
//	array[0][0]=new int[4];
//	System.out.println(array.length);
	
	for(int i=0;i<array.length;i++) {
		for(int j=0;j<array.length;j++) {
			for(int k=0;k<array.length;k++) {
				System.out.println("block:"+i+"row:"+j+"col:"+k);
				array[i][j][k]=sc.nextInt();
			}
		}
	}
	
	for(int[][] ar:array){
		for(int[] arra:ar) {
			for(int a:arra) {
			System.out.println(a);
		}
	}
 }
	System.out.println();
 }}
