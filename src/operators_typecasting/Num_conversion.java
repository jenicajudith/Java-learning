package operators_typecasting;

public class Num_conversion {
	public static void main(String[] args) {
		double value = 25.75;

        int number = (int) value;

        if (number % 2 == 0) {
            System.out.println(number + " is even");
        } else {
            System.out.println(number + " is odd");
        }
	}

}
