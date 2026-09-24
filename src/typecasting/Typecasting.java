package typecasting;

public class Typecasting {
	public static void main(String[] args) {
//		string to int
		String word="10";
		int value= Integer.valueOf(word);
		System.out.println(value);
		
//int to string
		int term=10;
		String data=String.valueOf(term);
		int am=100;
		System.out.println(data+am);

//		 string to boolean
		String a="true";
		boolean pass=Boolean.valueOf(a);
		System.out.println(pass);
		
		
		
	}

}
