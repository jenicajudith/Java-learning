package array;
import java.util.Scanner;
public class Main {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the block");
	int block=sc.nextInt();
	System.out.println("enter the row");
	int row=sc.nextInt();
	System.out.println("enter the column");
	int column=sc.nextInt();
	int[][][] arr=new int[block][row][column];
	 
	for(int i=0;i<arr.length;i++) {
		for(int j=0;j<arr[i].length;j++) {
			for(int k=0;k<arr[i][j].length;k++) {
				System.out.println("enter the block:"+i+"row:"+j+"col"+k);
				arr[i][j][k]=sc.nextInt();
			}
		}
	}
	for(int[][] a:arr) {
		for(int[] ar:a) {
			for(int array:ar) {
				System.out.println(array);
			}
			System.out.println();
		}
		System.out.println();
	}
}
}
