package operators_typecasting;

public class Eligible {
	public static void main(String[] args) {

        double age = 21.5;

        int person = (int) age;

        if (person >= 18 && person <= 60) {
            System.out.println("Eligible ");
        } else {
            System.out.println("Not eligible");
        }
    }
          
}
