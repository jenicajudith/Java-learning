package Exception;
// unchecked exception

public class Exceptions {
	public static void main(String[] args) {
		try {
			int[] arr=new int[2];
			arr[0]=1;
			arr[1]=2;
			arr[2]=3;
			for(int array:arr) {
				System.out.println(array);
			}
		}
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
		}
		
		
		try {
			int value=3/0;
			System.out.println(value);
			
		}catch(ArithmeticException e) {
			System.out.println(e.getMessage());
		}
	}

}
