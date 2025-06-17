package Level_1;
import java.util.*;
public class Number_Of_Digits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);
	        int number = sc.nextInt();
	        int count = 0;

	        while (number != 0) {
	            number /= 10;
	            count++;
	        }

	        System.out.println(count);

	}

}
