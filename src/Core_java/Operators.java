package Core_java;

public class Operators {
	public static void main(String[] args) {
	int a=78;
	int b=89;
	int c=34;
	if(a>=b &&a>=c) {
		System.out.println(a+" "+"is the largest");
	}
	else if(b>=a&&b>=c) {
		System.out.println(b+" "+"is the largest");
	}
	else {
		System.out.println(c+ " "+"is the largest");
	}

}
}

// access specifires are used to acces the class this class is public so any class or package can access this
// in private only that class can use that
