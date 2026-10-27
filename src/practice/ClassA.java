package practice;

public class ClassA {
	
	
	public static void main(String[] args) {
	int[] mrks={75, 92, 68, 92, 84};
	int max=mrks[0];
	for(int i=1;i<mrks.length;i++) {
		if(mrks[i]>max) {
			 max=mrks[i];
		}
	}
	System.out.println(max);
	
	

}
}