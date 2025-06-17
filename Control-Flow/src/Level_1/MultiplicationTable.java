package Level_1;
import java.util.*;
public class MultiplicationTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scanner = new Scanner(System.in);

	       
	        System.out.print("Enter a number: ");
	        int number = scanner.nextInt();

	        for (int i = 6; i <= 9; i++) {
	            System.out.println(number + " * " + i + " = " + (number * i));
	        }
	}

}
