package conditional;
import java.util.Scanner;
public class Condition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
      int math=8;
      int chem=5;
      int phy=8;
      int sci=chem+phy/2;
      int cutoff=math+sci;
      if(cutoff>=150) {
    	  System.out.println("bio maths");
      }
      else if(cutoff>=100){
    	  System.out.println("cs");
      }
      else if(cutoff>=70) {
    	  System.out.println("accounts");
      }
      else {
    	  System.out.println("fail");
      }
	}
	
	
	public void switchcase() {
		Scanner sc=new Scanner(System.in);
		System.out.println("CAlculation");
		System.out.println("1--add");
		System.out.println("2--sub");
		System.out.println("3--div");
		System.out.println("4--mul");
		System.out.println("enter option");

		int a=sc.nextInt();
		System.out.println("enter value 1");
		int aa=sc.nextInt();
		System.out.println("enter value2");
		int bb=sc.nextInt();
		
		
	
		
	
		switch(a) {
		case 1:
			System.out.println(aa+bb);
			break;
		
	case 2:
		System.out.println(aa-bb);
		break;
	
	case 3:
		System.out.println(aa/bb);
		break;
	case 4:
		System.out.println(aa*bb);
		break;
		default:
			System.out.println("Incorrect option");
		
	}
	}
	

}
