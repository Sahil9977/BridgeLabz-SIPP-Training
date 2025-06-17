package Level_1;
import java.util.*;
public class Bonus {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);
	        int salary = sc.nextInt();
	        int years = sc.nextInt();

	        if (years > 5) {
	            double bonus = salary * 0.05;
	            System.out.println("Bonus: " + bonus);
	        } else {
	            System.out.println("No Bonus");
	        }

	}

}
